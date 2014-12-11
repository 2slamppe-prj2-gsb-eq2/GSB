/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import modele.dao.DaoException;
import modele.dao.DaoVisiteur;
import modele.metier.Visiteur;
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
        search() ;
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
    
    private void search() 
    {
       
        String tab[] ;
       getVue().chercherButton.addActionListener(new ActionListener() {
            private Visiteur unVisiteur;

            @Override
            public void actionPerformed(ActionEvent e) {
                
             String leVisiteur = getVue().chercherCombo.getSelectedItem().toString();
             System.out.println(leVisiteur);
             String string = leVisiteur;
             String[] parts = string.split(" ");
             String nom = parts[0]; // 004
             String prenom = parts[1]; // 034556
                try {
                    unVisiteur = daoVisiteur.getByName(nom, prenom) ;
                } catch (DaoException ex) {
                    Logger.getLogger(CtrlVisiteur.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(unVisiteur.getNom()) ;
                getVue().nomText.setText(unVisiteur.getNom());
                getVue().nomText.setText(unVisiteur.getPrenom());
                getVue().nomText.setText(unVisiteur.getAdresse());
                getVue().nomText.setText(unVisiteur.getVille());
                getVue().nomText.setText(unVisiteur.getCp());
                        
            }
        });
    }
    }

 
    

