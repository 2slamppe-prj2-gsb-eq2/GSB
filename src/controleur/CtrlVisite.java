/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    private String str ;
    private List<Praticien> listPraticiens;
    private List<RapportVisite> listRapportsVisite;
    private int indiceCourant = 0 ;
    DateFormat format = new SimpleDateFormat("MM/dd/yy");
    
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
           chargerListeRapport() ;
           rapportSelectionner() ;
           
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
        getVue().jComboBoxPraticien.removeAllItems();
        getVue().jComboBoxPraticien.addItem("Aucun");
        listPraticiens = daoPraticien.getAll() ;
        for (Praticien unPraticien : listPraticiens) {
            getVue().jComboBoxPraticien.addItem(unPraticien.getNom()+" "+unPraticien.getPrenom());

        }

    }
    public void chargerListeRapport() throws DaoException, Exception {
       
        listRapportsVisite = daoRapportVisite.getAll() ;  
  
    }
    
    /**
     *
     * 
     **/
    public void rapportSelectionner() {
        RapportVisite unRapport = listRapportsVisite.get(indiceCourant) ;
        getVue().num.setText(Integer.toString(unRapport.getNum()));
        getVue().date.setText(format.format(unRapport.getDate()));
        getVue().motif.setText(unRapport.getMotif());
        getVue().bilan.setText(unRapport.getBilan());
        Praticien unPraticien = unRapport.getPraticien() ; 
        getVue().jComboBoxPraticien.setSelectedItem(unPraticien.getNom()+" "+unPraticien.getPrenom());
    }
    
    /**
    *
    *
    **/
    
    public void visiteSuivant(){
        indiceCourant = indiceCourant + 1;
        if (indiceCourant>listRapportsVisite.size()-1) {
            indiceCourant=0;
            }                
        rapportSelectionner();
    }
    
    /**
     * 
     **/
    
    public void visitePrecedent(){
        indiceCourant = indiceCourant - 1;
        if (indiceCourant<0) {
            indiceCourant=listRapportsVisite.size()-1;
            }               
        rapportSelectionner();
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
