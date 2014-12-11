/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import modele.dao.DaoException;
//import modele.dao.*;
//import modele.metier.*;
import vue.VueVisiteur;


/**
 *
 * @author btssio
 */
public class CtrlVisiteur extends CtrlAbstrait {

    public CtrlVisiteur(CtrlPrincipal ctrlPrincipal) {
        super(ctrlPrincipal);
        vue = new  VueVisiteur(this);
        System.out.println(vue) ;
    }
    
     @Override
    public VueVisiteur getVue() {
        return (VueVisiteur) vue;
    }
    
    private void chargerListeEquipiers() throws DaoException {
      
        }
    }

 
    

