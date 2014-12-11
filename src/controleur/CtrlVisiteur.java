/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import modele.dao.DaoException;
import modele.dao.DaoVisiteur;
import modele.metier.Visiteur;
//import modele.dao.*;
//import modele.metier.*;
import vue.VueVisiteur;


/**
 *
 * @author btssio
 */
public class CtrlVisiteur extends CtrlAbstrait {

     static DaoVisiteur daoVisiteur = new DaoVisiteur();
    public CtrlVisiteur(CtrlPrincipal ctrlPrincipal) throws Exception {
        super(ctrlPrincipal);
        vue = new  VueVisiteur(this);
        chargerListeVisiteurs() ;
    }
    
     @Override
    public VueVisiteur getVue() {
        return (VueVisiteur) vue;
    }
    
    private void chargerListeVisiteurs() throws DaoException, Exception {
       ArrayList<Visiteur> lesVisiteurs = new ArrayList<Visiteur>();
        lesVisiteurs = daoVisiteur.getAll();
         getVue().chercherCombo.removeAllItems();
        for(int i=0; i<lesVisiteurs.size(); i++)
        {
            getVue().chercherCombo.addItem(lesVisiteurs.get(i).getNom()+" "+lesVisiteurs.get(i).getPrenom()) ;
        }

        }
    }

 
    

