/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vue;

import controleur.CtrlAbstrait;
import controleur.CtrlMenu;
import controleur.CtrlVisiteur;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author btssio
 */
public class VueVisiteur extends  VueAbstraite {

    /**
     * Creates new form Visiteur
     */
    public VueVisiteur(CtrlAbstrait ctrl) {
        super(ctrl);
        initComponents();
        this.setLocation(500, 200);
        this.setBounds(500, 200, 1236, 490);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        visiteurLabel = new javax.swing.JLabel();
        chercherLabel = new javax.swing.JLabel();
        nomLabel = new javax.swing.JLabel();
        prenomLabel = new javax.swing.JLabel();
        adresseLabel = new javax.swing.JLabel();
        villeLabel = new javax.swing.JLabel();
        secteurLabel = new javax.swing.JLabel();
        laboLabel = new javax.swing.JLabel();
        chercherCombo = new javax.swing.JComboBox();
        chercherButton = new javax.swing.JButton();
        prenomText = new javax.swing.JTextField();
        adresseText = new javax.swing.JTextField();
        villeText = new javax.swing.JTextField();
        secteurCombo = new javax.swing.JComboBox();
        laboCombo = new javax.swing.JComboBox();
        cdpText = new javax.swing.JTextField();
        cdpLabel = new javax.swing.JLabel();
        precedentButton = new javax.swing.JButton();
        suivantButton = new javax.swing.JButton();
        fermerButton = new javax.swing.JButton();
        nomText = new javax.swing.JTextField();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 352, 233));

        visiteurLabel.setText("Visiteurs");
        getContentPane().add(visiteurLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 44, -1, -1));

        chercherLabel.setText("Chercher :");
        getContentPane().add(chercherLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 113, -1, -1));

        nomLabel.setText("NOM :");
        getContentPane().add(nomLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 250, -1, -1));

        prenomLabel.setText("PRENOM :");
        getContentPane().add(prenomLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 291, -1, -1));

        adresseLabel.setText("ADRESSE :");
        getContentPane().add(adresseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 331, -1, -1));

        villeLabel.setText("VILLE :");
        getContentPane().add(villeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 371, -1, -1));

        secteurLabel.setText("SECTEUR :");
        getContentPane().add(secteurLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 291, -1, -1));

        laboLabel.setText("LABO :");
        getContentPane().add(laboLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 250, -1, -1));

        chercherCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chercherComboActionPerformed(evt);
            }
        });
        getContentPane().add(chercherCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 108, 144, -1));

        chercherButton.setText("Ok");
        chercherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chercherButtonActionPerformed(evt);
            }
        });
        getContentPane().add(chercherButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 107, -1, -1));

        prenomText.setEditable(false);
        prenomText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomTextActionPerformed(evt);
            }
        });
        getContentPane().add(prenomText, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 286, 226, -1));

        adresseText.setEditable(false);
        getContentPane().add(adresseText, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 326, 226, -1));

        villeText.setEditable(false);
        villeText.setToolTipText("");
        getContentPane().add(villeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 366, 226, -1));

        secteurCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secteurComboActionPerformed(evt);
            }
        });
        getContentPane().add(secteurCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 286, 150, -1));

        laboCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laboComboActionPerformed(evt);
            }
        });
        getContentPane().add(laboCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 245, 150, -1));

        cdpText.setEditable(false);
        cdpText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdpTextActionPerformed(evt);
            }
        });
        getContentPane().add(cdpText, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 401, 51, -1));

        cdpLabel.setText("CODE POSTAL :");
        getContentPane().add(cdpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 406, -1, -1));

        precedentButton.setText("Précédent");
        precedentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precedentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(precedentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        suivantButton.setText("Suivant");
        suivantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suivantButtonActionPerformed(evt);
            }
        });
        getContentPane().add(suivantButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, -1));

        fermerButton.setText("Fermer");
        fermerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(fermerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 210, -1));

        nomText.setEditable(false);
        nomText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTextActionPerformed(evt);
            }
        });
        getContentPane().add(nomText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 226, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void chercherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chercherButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chercherButtonActionPerformed

    private void cdpTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdpTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdpTextActionPerformed

    private void prenomTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomTextActionPerformed

    private void suivantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suivantButtonActionPerformed
((CtrlVisiteur)controleur).visiteurSuivant();        // TODO add your handling code here:
    }//GEN-LAST:event_suivantButtonActionPerformed

    private void precedentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precedentButtonActionPerformed
    ((CtrlVisiteur)controleur).visiteurPrecedent();     
    }//GEN-LAST:event_precedentButtonActionPerformed

    private void fermerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerButtonActionPerformed
        try {
            ((CtrlVisiteur)controleur).visiteurQuitter();
        } catch (Exception ex) {
            Logger.getLogger(VueVisiteur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fermerButtonActionPerformed

    private void chercherComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chercherComboActionPerformed
            ((CtrlVisiteur)controleur).visiteurSelectionner();
    }//GEN-LAST:event_chercherComboActionPerformed

    private void laboComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laboComboActionPerformed
        
    }//GEN-LAST:event_laboComboActionPerformed

    private void secteurComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secteurComboActionPerformed
      
    }//GEN-LAST:event_secteurComboActionPerformed

    private void nomTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adresseLabel;
    public javax.swing.JTextField adresseText;
    private javax.swing.JLabel background;
    private javax.swing.JLabel cdpLabel;
    public javax.swing.JTextField cdpText;
    public javax.swing.JButton chercherButton;
    public javax.swing.JComboBox chercherCombo;
    private javax.swing.JLabel chercherLabel;
    private javax.swing.JButton fermerButton;
    private javax.swing.JButton jButton3;
    public javax.swing.JComboBox laboCombo;
    private javax.swing.JLabel laboLabel;
    private javax.swing.JLabel nomLabel;
    public javax.swing.JTextField nomText;
    public javax.swing.JButton precedentButton;
    private javax.swing.JLabel prenomLabel;
    public javax.swing.JTextField prenomText;
    public javax.swing.JComboBox secteurCombo;
    private javax.swing.JLabel secteurLabel;
    public javax.swing.JButton suivantButton;
    private javax.swing.JLabel villeLabel;
    public javax.swing.JTextField villeText;
    private javax.swing.JLabel visiteurLabel;
    // End of variables declaration//GEN-END:variables
}
