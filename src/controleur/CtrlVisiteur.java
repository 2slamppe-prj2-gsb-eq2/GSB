package controleur;

import java.util.List;
import javax.swing.JOptionPane;
import modele.dao.*;
import modele.metier.*;
import vue.VueVisiteur;

public class CtrlVisiteur extends CtrlAbstrait {
    
   private final DaoVisiteur daoVisiteur = new DaoVisiteur();
   private final DaoLabo daoLabo = new DaoLabo();
   private final DaoSecteur daoSecteur = new DaoSecteur() ;


    public CtrlVisiteur(CtrlPrincipal ctrlPrincipal) throws Exception {
        super(ctrlPrincipal);
        vue = new VueVisiteur(this);
        actualiser();
    }

    public final void actualiser() throws Exception {
        try {
            chargerListeVisiteur();
            chargerListeLabo();
            chargerListeSecteur() ;
        } catch (DaoException ex) {
            JOptionPane.showMessageDialog(getVue(), "CtrlVisiteur - actualiser - " + ex.getMessage(), " Liste des visiteurs ", JOptionPane.ERROR_MESSAGE);
        }
    }

   

    /**
     * presenceAnnuler réaction au clic sur le bouton ANNULER de la vue Le
     * contrôle est rendu au contrôleur fronta
     * @throws java.lang.Exception
     */
    public void visiteurQuitter() throws Exception {
        this.getCtrlPrincipal().action(EnumAction.VISITEUR_RETOUR);
    }
   /**Bouton suivant. rajoute +1 a chaque utilisateur 
    * 
    */
    public void visiteurSuivant(){
        int index = getVue().chercherCombo.getSelectedIndex()+1;
        if(index== getVue().chercherCombo.getItemCount())
        {
            index=0;
        }
        getVue().chercherCombo.setSelectedIndex(index);
    }
    
    /**
     Bouton précédent enleve -1 a chaque utilisateur
     */
    public void visiteurPrecedent(){
        int index = getVue().chercherCombo.getSelectedIndex()-1;
        if(index== -1)
        {
            index=getVue().chercherCombo.getItemCount() -1;
        }
        getVue().chercherCombo.setSelectedIndex(index);
    }
    /**
     * chargerListeVisiteur renseigner le modèle du composant chercherCombo
     * à partir de la base de données
     *
     * @throws DaoException
     */
    private void chargerListeVisiteur() throws DaoException, Exception {
        List<Visiteur> desVisiteurs = daoVisiteur.getAll();
        getVue().chercherCombo.removeAll();
        for (Visiteur unVisiteur : desVisiteurs) {
            getVue().chercherCombo.addItem(unVisiteur);
        }
    }
    /**
     * 
     * Charger la liste des labo relatif à la base de donnée
     * @throws DaoException
     * @throws Exception 
     */
        private void chargerListeLabo() throws DaoException, Exception {
        List<Labo> desLabos = daoLabo.getAll();
        getVue().laboCombo.removeAll();
        for (Labo unLabo : desLabos) {
            getVue().laboCombo.addItem(unLabo);
        }
    }
        /**
         * 
         * 
         * Charge la liste des Secteur relatif à la base de donnée
         * @throws DaoException 
         */
        
        private void chargerListeSecteur() throws DaoException {
        List<Secteur> desSecteurs = daoSecteur.getAll();
        getVue().secteurCombo.removeAll();
        for (Secteur unSecteur : desSecteurs) {
            getVue().secteurCombo.addItem(unSecteur);
        }
    }
    /**
     * Affiche les détails du visiteur selectionnée dans la comboBox recherche
     * 
     */
    public void visiteurSelectionner (){
        Visiteur visiteurSelect = (Visiteur) getVue().chercherCombo.getSelectedItem();
        getVue().nomText.setText(visiteurSelect.getNom());
        getVue().prenomText.setText(visiteurSelect.getPrenom());
        getVue().adresseText.setText(visiteurSelect.getAdresse());
        getVue().villeText.setText(visiteurSelect.getVille());
        getVue().cdpText.setText(visiteurSelect.getCp());
        getVue().secteurCombo.setSelectedItem(visiteurSelect.getSecteur());
        getVue().laboCombo.setSelectedItem(visiteurSelect.getLabo().getNom());
        String labo = visiteurSelect.getLabo().getNom() ;
        System.out.print("Labo avec methode getNom()"+labo);
        System.out.println("Labo sans methode getNom()"+visiteurSelect.getLabo()) ;
       
        
    }
    /**
     * Charge la vue visiteur
     *
     * @throws DaoException
     */
    
    @Override
    public VueVisiteur getVue() {
        return (VueVisiteur) vue;
    }

   

   
    
}