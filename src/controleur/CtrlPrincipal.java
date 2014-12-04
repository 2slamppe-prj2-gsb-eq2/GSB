package controleur;


import javax.swing.JOptionPane;
import modele.jdbc.Jdbc;

/**
 * Controleur principal (ou frontal) - un lien vers chaque contrôleur de base
 *
 * @author nbourgeois
 * @version 1 20 novembre 2013
 */
public class CtrlPrincipal {

    private CtrlVisiteur ctrlVisiteur = null;
    private CtrlMenu ctrlMenu = null;

    /**
     * action par défaut action au démarrage de l'application
     */
    public void action() {
        if (ctrlMenu == null) {
            ctrlMenu = new CtrlMenu(this);
        }
        ctrlMenu.getVue().setEnabled(true);
        ctrlMenu.getVue().setVisible(true);
    }

    public void action(EnumAction action) {
        switch (action) {
            case MENU_VISITEUR: // activation de vuePresence depuis vueMenu
                menuVisiteur();
                break;
            case VISITEUR_RETOUR:    // retour à vueMenu depuis la vuePresence
                presenceQuitter();
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
    private void menuVisiteur() {
        if (ctrlVisiteur == null) {
            ctrlVisiteur = new CtrlVisiteur(this);
        } else {
            // si la le contrôleur et sa vue existent déjà
            // il faut rafraîchir le contenu à partir de la base de données
            ctrlVisiteur.actualiser();
        }
        // vuPresence est une fenêtre modale :
        // -> vueMenu reste visible, mais n'est pas active
        ctrlMenu.getVue().setEnabled(false);
        ctrlVisiteur.getVue().setVisible(true);
    }

    /**
     * Transition vuePresence / vueMenu
     */
    private void presenceQuitter() {
        if (ctrlMenu == null) {
            ctrlMenu = new CtrlMenu(this);
        }
        ctrlVisiteur.getVue().setVisible(false);
        ctrlMenu.getVue().setEnabled(true);
        ctrlMenu.getVue().setVisible(true);
    }
}
