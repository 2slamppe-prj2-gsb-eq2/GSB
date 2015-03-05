/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import javax.swing.JOptionPane;
import modele.dao.DaoException;
import vue.VueVisite;
import vue.VueVisiteur;

/**
 *
 * @author btssio
 */
public class CtrlVisite  extends CtrlAbstrait {
    
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
     
    
    }
   
       /**
        * 
        * @throws Exception 
        */
    public void visiteQuitter() throws Exception{
         this.getCtrlPrincipal().action(EnumAction.VISITE_RETOUR);
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
