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
import modele.dao.DaoException;
import modele.dao.DaoLabo;
import modele.dao.DaoVisiteur;
import modele.metier.Labo;
import modele.metier.Visiteur;
import vue.VueVisiteur;


/**
 *
 * @author équipe2
 */
public class CtrlVisiteur extends CtrlAbstrait {

     static DaoVisiteur daoVisiteur = new DaoVisiteur();
     static DaoLabo daoLabo = new DaoLabo() ;
     private List<Labo> lesLabos;
     private int indiceVisiteurCourant ;
     private Visiteur unVisiteur ;
     
    
     
    //private List<Secteur> lesSecteurs;
     
    public CtrlVisiteur(CtrlPrincipal ctrlPrincipal) throws Exception {
        super(ctrlPrincipal);
        vue = new  VueVisiteur(this);
        chargerListeVisiteurs() ;
        search() ;
         
        
        lesLabos = daoLabo.getAll();
        afficherListeLabo(lesLabos);
        
        suivant() ;
        precedent() ;
  
        
    }
    
    
    /**
     * 
     * FOnction qui charge tous les visiteurs de la base de donnée
     * @return liste des visiteurs
     * @throws DaoException
     * @throws Exception 
     */
    
    private ArrayList<Visiteur> chargerListeVisiteurs() throws DaoException, Exception {
       ArrayList<Visiteur> lesVisiteurs = new ArrayList<Visiteur>();
        lesVisiteurs = daoVisiteur.getAll();
         getVue().chercherCombo.removeAllItems();
        for(int i=0; i<lesVisiteurs.size(); i++)
        {
            getVue().chercherCombo.addItem(lesVisiteurs.get(i).getNom()+" "+lesVisiteurs.get(i).getPrenom()) ;
        }
        return lesVisiteurs ;
        }
    
    /***
     * 
     * Affiche la liste des labos
     * @param lesLabos 
     */
    
    private void afficherListeLabo(List<Labo> lesLabos)
    {
        getVue().laboCombo.removeAllItems();
        getVue().laboCombo.addItem("aucun");
        for(int i=0; i<lesLabos.size(); i++ ){
            getVue().laboCombo.addItem(lesLabos.get(i).getNom());
        }
     } 
    
    /**
     * 
     * Fonction qui affiche le visiteur courant dans la Jcombobox 
     * @return String qui est le nom et prénom du visiteur courant concaténé
     */
    private String afficherVisiteurCourant()
    {
        
         String leVisiteur = getVue().chercherCombo.getSelectedItem().toString();
         String string = leVisiteur;
         
         return string ;
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
            String visitCourant ;
            Labo unLab ;

            @Override
            public void actionPerformed(ActionEvent e) {
                
             visitCourant = afficherVisiteurCourant() ;
             String[] parts = visitCourant.split(" ");
             String nom = parts[0]; 
             String prenom = parts[1]; 
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
                
                
                        
            }
        });
    }
    
    /***
     * Affiche le visiteur suivant lors de l'évenement du clique sur 
     * le bouton suivant
     * @throws Exception 
     */
    
    private void suivant() throws Exception
    {
               
       getVue().suivantButton.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
            indiceVisiteurCourant = getVue().chercherCombo.getSelectedIndex() ;
             ArrayList<Visiteur> lesVisiteurs = new ArrayList<Visiteur>();
           try {
               lesVisiteurs = chargerListeVisiteurs() ;
           } catch (Exception ex) {
               Logger.getLogger(CtrlVisiteur.class.getName()).log(Level.SEVERE, null, ex);
           }
            indiceVisiteurCourant = indiceVisiteurCourant + 1;
              if (indiceVisiteurCourant>lesVisiteurs.size()-1) {
                    indiceVisiteurCourant=0;
                }
             String leVisiteur = getVue().chercherCombo.getItemAt(indiceVisiteurCourant).toString();
             String visitNext = leVisiteur;
             String[] parts = visitNext.split(" ");
             String nom = parts[0]; 
             String prenom = parts[1]; 
             try {
                 unVisiteur = daoVisiteur.getByName(nom, prenom) ;
             } catch (Exception ex) {
                 Logger.getLogger(CtrlVisiteur.class.getName()).log(Level.SEVERE, null, ex);
             }          
                getVue().chercherCombo.setSelectedIndex(indiceVisiteurCourant);
                getVue().nomText.setText(unVisiteur.getNom());
                getVue().prenomText.setText(unVisiteur.getPrenom());
                getVue().adresseText.setText(unVisiteur.getAdresse());
                getVue().villeText.setText(unVisiteur.getVille());
                getVue().cdpText.setText(unVisiteur.getCp());
                getVue().laboCombo.setSelectedItem(unVisiteur.getLeLabo());
       }
    });
    }
    
  /***
   * Affiche le visiteur précédent lors de l'évenement du clique sur 
   * le bouton précédent 
   */
    
    private void precedent()
    {
         getVue().precedentButton.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
            indiceVisiteurCourant = getVue().chercherCombo.getSelectedIndex() ;
             ArrayList<Visiteur> lesVisiteurs = new ArrayList<Visiteur>();
           try {
               lesVisiteurs = chargerListeVisiteurs() ;
           } catch (Exception ex) {
               Logger.getLogger(CtrlVisiteur.class.getName()).log(Level.SEVERE, null, ex);
           }
            indiceVisiteurCourant = indiceVisiteurCourant - 1;
              if (indiceVisiteurCourant<0) {
                     indiceVisiteurCourant=lesVisiteurs.size()-1;
                }
             String leVisiteur = getVue().chercherCombo.getItemAt(indiceVisiteurCourant).toString();
             String visitNext = leVisiteur;
             String[] parts = visitNext.split(" ");
             String nom = parts[0]; 
             String prenom = parts[1]; 
             try {
                 unVisiteur = daoVisiteur.getByName(nom, prenom) ;
             } catch (Exception ex) {
                 Logger.getLogger(CtrlVisiteur.class.getName()).log(Level.SEVERE, null, ex);
             }          
                getVue().chercherCombo.setSelectedIndex(indiceVisiteurCourant);
                getVue().nomText.setText(unVisiteur.getNom());
                getVue().prenomText.setText(unVisiteur.getPrenom());
                getVue().adresseText.setText(unVisiteur.getAdresse());
                getVue().villeText.setText(unVisiteur.getVille());
                getVue().cdpText.setText(unVisiteur.getCp());
                getVue().laboCombo.setSelectedItem(unVisiteur.getLeLabo());
       }
    });
        
    }
    
 @Override
    public VueVisiteur getVue() {
        return (VueVisiteur) vue;
    }
}
    

