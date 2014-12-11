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
import modele.dao.DaoLabo;
import modele.dao.DaoVisiteur;
import modele.metier.Labo;
import modele.metier.Visiteur;
import vue.VueVisiteur;


/**
 *
 * @author btssio
 */
public class CtrlVisiteur extends CtrlAbstrait {

     static DaoVisiteur daoVisiteur = new DaoVisiteur();
     static DaoLabo daoLabo = new DaoLabo() ;
     private List<Labo> lesLabos;
    //private List<Secteur> lesSecteurs;
     
    public CtrlVisiteur(CtrlPrincipal ctrlPrincipal) throws Exception {
        super(ctrlPrincipal);
        vue = new  VueVisiteur(this);
        chargerListeVisiteurs() ;
        search() ;
        
        lesLabos = daoLabo.getAll();
        System.out.println(lesLabos);
        afficherListeLabo(lesLabos);
  
        
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
    
    private void afficherListeLabo(List<Labo> lesLabos)
    {
        getVue().laboCombo.removeAllItems();
        getVue().laboCombo.addItem("aucun");
        for(int i=0; i<lesLabos.size(); i++ ){
            getVue().laboCombo.addItem(lesLabos.get(i).getNom());
        }
     } 
    
    
    /***
     ** Affiche les détails du visiteurs en fonction du visiteurs courant
     ** afficher dans la combo box
     ** lors de l'évenement
     ** du clique du bouton ok
     * 
     **/
    
    private void search() 
    {
       
   
       getVue().chercherButton.addActionListener(new ActionListener() {
            private Visiteur unVisiteur;
            Labo unLab ;

            @Override
            public void actionPerformed(ActionEvent e) {
                
             String leVisiteur = getVue().chercherCombo.getSelectedItem().toString();
             String string = leVisiteur;
             String[] parts = string.split(" ");
             String nom = parts[0]; // 004
             String prenom = parts[1]; // 034556
             try {
                 unVisiteur = daoVisiteur.getByName(nom, prenom) ;
             } catch (Exception ex) {
                 Logger.getLogger(CtrlVisiteur.class.getName()).log(Level.SEVERE, null, ex);
             }                            
                getVue().nomText.setText(unVisiteur.getNom());
                getVue().prenomText.setText(unVisiteur.getPrenom());
                getVue().adresseText.setText(unVisiteur.getAdresse());
                getVue().villeText.setText(unVisiteur.getVille());
                getVue().cdpText.setText(unVisiteur.getCp());
                getVue().laboCombo.setSelectedItem(unVisiteur.getLeLabo());
                 getVue().laboCombo.setSelectedItem(unVisiteur.getLeLabo());
                
                        
            }
        });
    }
    }

 
    

