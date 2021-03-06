 package controleur;

import javax.swing.JOptionPane;
import vue.VueMenu;

/**
 * Contrôleur de la fenêtre VueMenu
 * @author SLAM-groupe2
 * @version 1 11 novembre 2014
 */

public class CtrlMenu extends CtrlAbstrait {

    public CtrlMenu(CtrlPrincipal ctrlPrincipal) {
        super(ctrlPrincipal);
        vue = new VueMenu(this);
        System.out.println(vue) ;
    }

    /**
     * clic sur la commande Quitter du menu Fichier Le contrôleur délègue
     * l'action au contrôleur frontal
     */
    public void fichierQuitter() throws Exception {
        // Confirmer avant de quitter
        int rep = JOptionPane.showConfirmDialog(getVue(), "Quitter l'application\nEtes-vous sûr(e) ?", "Ambulances", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rep == JOptionPane.YES_OPTION) {
            // mettre fin à l'application
            this.getCtrlPrincipal().action(EnumAction.MENU_FICHIER_QUITTER);
        }
    }

    /**
     * clic sur la commande Ajouter du menu presence Le contrôleur délègue
     * l'action au contrôleur frontal
     */
    public void visiteur() throws Exception {
        this.getCtrlPrincipal().action(EnumAction.MENU_VISITEUR);
    }
    
    /**
     * 
     * @return 
     **/
    
    public void visite() throws Exception {
        this.getCtrlPrincipal().action(EnumAction.MENU_VISITE) ;
    }

    @Override
    public VueMenu getVue() {
        return (VueMenu) vue;
    }
}
