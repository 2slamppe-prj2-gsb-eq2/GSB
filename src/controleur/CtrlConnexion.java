/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modele.dao.DaoVisiteur;
import vue.VueConnexion;

/**
 *
 * @author btssio
 */
public class CtrlConnexion extends CtrlAbstrait {
    private final DaoVisiteur daoVisiteur = new DaoVisiteur();
    private boolean connexion;

    public CtrlConnexion(CtrlPrincipal ctrlPrincipal) {
        super(ctrlPrincipal);
        vue = new VueConnexion(this);
        
            //Ecouteurs Bouton ok
        getVue().JButtonConnexion.addActionListener(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    valider() ;
                } catch (Exception ex) {
                    Logger.getLogger(CtrlConnexion.class.getName()).log(Level.SEVERE, null, ex);
                }
              
            }
        });
        
        //Ecouteurs Bouton ok
        getVue().JButtonQuit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {              
            }
        });
    }
    
    /**
     * 
     * Fonction qui valide ou non la connexion
     * Selon l'id et le mot de passe rentrer
     */
    
   public void valider() throws Exception
   {
       // récupération du login et mot de passe pour vérification
        String login = getVue().JtextLogin.getText();
        String mdp = getVue().JTextMdp.getText();
         //vérification vers la bdd oracle en JPA
        connexion = daoVisiteur.verifierLoginMdp(login, mdp);
        if(connexion){
            //System.out.print("connexion réussi");
            CtrlPrincipal ctrlP = new CtrlPrincipal();
            ctrlP.action(EnumAction.AFFICHER_MENU);
            vue.setVisible(false);
        } else{
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, "Connexion invalide.");
        }       
       
   }
    
    
     @Override
    public VueConnexion getVue() {
        return (VueConnexion) vue;
    }
    
}
