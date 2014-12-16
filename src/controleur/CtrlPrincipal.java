package controleur;

import static controleur.EnumAction.*;
import javax.swing.JOptionPane;
import modele.jdbc.Jdbc;
import vue.VueMenu;
import controleur.CtrlAbstrait ;

/**
 * Controleur principal (ou frontal) - un lien vers chaque contrôleur de base
 *
 * @author Equipe2-PPE
 * @version 1 11/12/2014
 */
public class CtrlPrincipal {

    private CtrlVisiteur ctrlVisiteur = null;
    private CtrlMenu ctrlMenu = null;
    private CtrlConnexion ctrlConnexion = null ;
    

    /**
     * action par défaut action au démarrage de l'application
     */
    public void action() {
        if (ctrlConnexion == null) {
            ctrlConnexion = new CtrlConnexion(this);
        }
        ctrlConnexion.getVue().setEnabled(true);
        ctrlConnexion.getVue().setVisible(true);
    }

    public void action(EnumAction action) throws Exception {
        switch (action) {
            case MENU_VISITEUR: // activation de vueVisiteur depuis vueMenu
                menuVisiteur();
                break;
            case AFFICHER_MENU :
                 afficherMenu() ;
                 break ;
            case VISITEUR_RETOUR:    // retour à vueMenu depuis la vueVisiteur
                visiteurQuitter();
                break;
            case MENU_FICHIER_QUITTER: // fin de l'application depuis vueMenu
                menuFichierQuitter();
                break;
        }

    }

    /**
     * Fin définitive de l'application La demande de confirmation est gérée par
     * le contrôleur spécialisé
     */
    private void menuFichierQuitter() {
        try {
            Jdbc.getInstance().deconnecter();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "CtrlPrincipal - fermeture connexion BD", JOptionPane.ERROR_MESSAGE);
        } finally {
            System.exit(0);
        }
    }
    
     /**
     * Transition vueMenu / vuePresence
     */
    private void afficherMenu() {
        if (ctrlConnexion == null) {
            ctrlConnexion = new CtrlConnexion(this);
        }
        
        ctrlMenu = new CtrlMenu(this);
        // vuPresence est une fenêtre modale :
        // -> vueMenu reste visible, mais n'est pas active
        ctrlConnexion.getVue().setEnabled(false);
        ctrlConnexion.getVue().setVisible(false);
        ctrlMenu.getVue().setVisible(true);
    }

    /**
     * Transition vueMenu / vueVisiteur
     */
    private void menuVisiteur() throws Exception {
        if (ctrlVisiteur == null) {
            ctrlVisiteur = new CtrlVisiteur(this);
        } else {
            // si la le contrôleur et sa vue existent déjà
            // il faut rafraîchir le contenu à partir de la base de données
            ctrlVisiteur.actualiser();
        }
        // vuVisiteur est une fenêtre modale :
        // -> vueMenu reste visible, mais n'est pas active
        ctrlMenu.getVue().setEnabled(false);
        ctrlVisiteur.getVue().setVisible(true);
    }

    /**
     * Transition vueVisiteur / vueMenu
     */
    private void visiteurQuitter() {
        if (ctrlMenu == null) {
            ctrlMenu = new CtrlMenu(this);
        }
        ctrlVisiteur.getVue().setVisible(false);
        ctrlMenu.getVue().setEnabled(true);
        ctrlMenu.getVue().setVisible(true);
    }
}