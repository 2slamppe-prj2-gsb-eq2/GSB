/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.util.List;
import javax.swing.JOptionPane;
import modele.dao.DaoException;
import modele.dao.DaoPraticien;
import modele.dao.DaoRapportVisite;
import modele.dao.DaoVisiteur;
import modele.metier.Praticien;
import modele.metier.RapportVisite;
import vue.VueVisite;
import vue.VueVisiteur;

/**
 *
 * @author btssio
 */
public class CtrlVisite  extends CtrlAbstrait {
        
    private final DaoPraticien daoPraticien = new DaoPraticien();
    private final DaoRapportVisite daoRapportVisite = new DaoRapportVisite();
    /**
     * @param ctrlPrincipal
     * @throws Exception 
     */
      public CtrlVisite(CtrlPrincipal ctrlPrincipal) throws Exception {
        super(ctrlPrincipal);
        vue = new VueVisite(this);
        actualiser();
    }
      
      /**
       * 
       * @throws Exception 
       */
       public final void actualiser() throws Exception {
           chargerListePraticiens() ;
           
    }
   
       /**
        * 
        * @throws Exception 
        */
    public void visiteQuitter() throws Exception{
         this.getCtrlPrincipal().action(EnumAction.VISITE_RETOUR);
    }

    
    
     /**
     * chargerListePraticiens renseigner le modèle du composant JcomBoxPraticien
     * à partir de la base de données
     * @throws DaoException
     */
    private void chargerListePraticiens() throws DaoException, Exception {
        List<Praticien> desPraticiens = daoPraticien.getAll();
        getVue().jComboBoxPraticien.removeAll();
        for (Praticien unPraticien : desPraticiens) {
            getVue().jComboBoxPraticien.addItem(unPraticien);

        }
    }
    private void chargerListeRapport() throws DaoException, Exception {
        List<RapportVisite> lesRapports = daoRapportVisite.getAll() ;
    }
    
    /**
     *
     * 
     **/
    public void praticienSelectionner() {
        
    }
    
     /**
     * Charge la vue visiteur
     *
     * @throws DaoException
     */
    
    @Override
    public VueVisite getVue() {
        return (VueVisite) vue;
    }

}
