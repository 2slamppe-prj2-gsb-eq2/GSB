/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vue;

import controleur.CtrlAbstrait;

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

        setBackground(new java.awt.Color(255, 255, 255));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/background.png"))); // NOI18N

        visiteurLabel.setText("Visiteurs");

        chercherLabel.setText("Chercher :");

        nomLabel.setText("NOM :");

        prenomLabel.setText("PRENOM :");

        adresseLabel.setText("ADRESSE :");

        villeLabel.setText("VILLE :");

        secteurLabel.setText("SECTEUR :");

        laboLabel.setText("LABO :");

        chercherButton.setText("Ok");
        chercherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chercherButtonActionPerformed(evt);
            }
        });

        prenomText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomTextActionPerformed(evt);
            }
        });

        villeText.setToolTipText("");

        cdpText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdpTextActionPerformed(evt);
            }
        });

        cdpLabel.setText("CODE POSTAL :");

        precedentButton.setText("Précédent");
        precedentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precedentButtonActionPerformed(evt);
            }
        });

        suiventButton.setText("Suivant");
        suiventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suiventButtonActionPerformed(evt);
            }
        });

        fermerButton.setText("Fermer");
        fermerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prenomLabel)
                                    .addComponent(nomLabel))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prenomText)
                                    .addComponent(nomText)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adresseLabel)
                                    .addComponent(villeLabel)
                                    .addComponent(cdpLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cdpText, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adresseText)
                                    .addComponent(villeText))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(visiteurLabel)
                                .addGap(128, 128, 128))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(laboLabel)
                                    .addComponent(chercherLabel)
                                    .addComponent(secteurLabel))
                                .addGap(18, 18, 18)
                                .addComponent(cherherCombo, 0, 144, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(chercherButton)
                                .addGap(35, 35, 35))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(laboCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(secteurCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fermerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(precedentButton)
                                        .addGap(50, 50, 50)
                                        .addComponent(suiventButton)))))
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(visiteurLabel)
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chercherLabel)
                                    .addComponent(cherherCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chercherButton))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomLabel)
                            .addComponent(laboLabel)
                            .addComponent(laboCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prenomLabel)
                            .addComponent(prenomText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secteurLabel)
                            .addComponent(secteurCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adresseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adresseLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(villeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(villeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precedentButton)
                            .addComponent(suiventButton))
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdpText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cdpLabel)
                    .addComponent(fermerButton))
                .addContainerGap(68, Short.MAX_VALUE))
        );
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
    System.exit(0);        // TODO add your handling code here:
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
