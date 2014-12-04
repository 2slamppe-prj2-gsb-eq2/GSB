/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
//import modele.dao.*;
//import modele.metier.*;
import vue.VueVisiteur;


/**
 *
 * @author btssio
 */
public class CtrlVisiteur extends CtrlAbstrait {

    public CtrlVisiteur(CtrlPrincipal l) {
        super(l);
        vue = new  VueVisiteur(this);
        actualiser();
    }

    public final void actualiser() {
      
    }

    
}
