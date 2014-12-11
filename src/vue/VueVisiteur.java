/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vue;

import controleur.CtrlAbstrait;
import controleur.CtrlMenu;

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
        cherherCombo = new javax.swing.JComboBox();
        chercherButton = new javax.swing.JButton();
        nomText = new javax.swing.JTextField();
        prenomText = new javax.swing.JTextField();
        adresseText = new javax.swing.JTextField();
        villeText = new javax.swing.JTextField();
        secteurCombo = new javax.swing.JComboBox();
        laboCombo = new javax.swing.JComboBox();
        cdpText = new javax.swing.JTextField();
        cdpLabel = new javax.swing.JLabel();
        precedentButton = new javax.swing.JButton();
        suiventButton = new javax.swing.JButton();
        fermerButton = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        getContentPane().add(cherherCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 108, 144, -1));

        chercherButton.setText("Ok");
        chercherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chercherButtonActionPerformed(evt);
            }
        });
        getContentPane().add(chercherButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 107, -1, -1));
        getContentPane().add(nomText, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 245, 226, -1));

        prenomText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomTextActionPerformed(evt);
            }
        });
        getContentPane().add(prenomText, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 286, 226, -1));
        getContentPane().add(adresseText, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 326, 226, -1));

        villeText.setToolTipText("");
        getContentPane().add(villeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 366, 226, -1));

        getContentPane().add(secteurCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 286, 150, -1));

        getContentPane().add(laboCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 245, 150, -1));

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
        getContentPane().add(precedentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 347, -1, -1));

        suiventButton.setText("Suivant");
        suiventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suiventButtonActionPerformed(evt);
            }
        });
        getContentPane().add(suiventButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 347, -1, -1));

        fermerButton.setText("Fermer");
        fermerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(fermerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 400, 210, -1));
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

    private void suiventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suiventButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suiventButtonActionPerformed

    private void precedentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precedentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precedentButtonActionPerformed

    private void fermerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerButtonActionPerformed
   // TODO add your handling code here:
    }//GEN-LAST:event_fermerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adresseLabel;
    private javax.swing.JTextField adresseText;
    private javax.swing.JLabel background;
    private javax.swing.JLabel cdpLabel;
    private javax.swing.JTextField cdpText;
    private javax.swing.JButton chercherButton;
    private javax.swing.JLabel chercherLabel;
    private javax.swing.JComboBox cherherCombo;
    private javax.swing.JButton fermerButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox laboCombo;
    private javax.swing.JLabel laboLabel;
    private javax.swing.JLabel nomLabel;
    private javax.swing.JTextField nomText;
    private javax.swing.JButton precedentButton;
    private javax.swing.JLabel prenomLabel;
    private javax.swing.JTextField prenomText;
    private javax.swing.JComboBox secteurCombo;
    private javax.swing.JLabel secteurLabel;
    private javax.swing.JButton suiventButton;
    private javax.swing.JLabel villeLabel;
    private javax.swing.JTextField villeText;
    private javax.swing.JLabel visiteurLabel;
    // End of variables declaration//GEN-END:variables
}
