 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vue;

import controleur.CtrlAbstrait;
import controleur.CtrlMenu;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author btssio
 */
public class VueMenu extends  VueAbstraite {

    /**
     * Creates new form Menu
     */
    public VueMenu(CtrlAbstrait ctrl) {
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

        jButtonVIsite = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonVisit = new javax.swing.JButton();
        jButtonPrat = new javax.swing.JButton();
        jButtonMedoc = new javax.swing.JButton();
        jButtonQuitter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonVIsite.setText("Compte Rendus");
        jButtonVIsite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVIsiteActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(55, 66, 128));
        jLabel1.setFont(new java.awt.Font("gargi", 0, 15)); // NOI18N
        jLabel1.setText("MENU | APP GSB");

        jButtonVisit.setText("Visiteurs");
        jButtonVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisitActionPerformed(evt);
            }
        });

        jButtonPrat.setText("Praticiens");

        jButtonMedoc.setText("Médicaments");

        jButtonQuitter.setText("Quitter");
        jButtonQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVisit, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPrat, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMedoc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonVIsite)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonVIsite)
                        .addGap(20, 20, 20)
                        .addComponent(jButtonVisit)
                        .addGap(20, 20, 20)
                        .addComponent(jButtonPrat)
                        .addGap(20, 20, 20)
                        .addComponent(jButtonMedoc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jButtonQuitter))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVIsiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVIsiteActionPerformed
            try {
            ((CtrlMenu)controleur).visite();       // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(VueMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }//GEN-LAST:event_jButtonVIsiteActionPerformed

    private void jButtonQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitterActionPerformed
    System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonQuitterActionPerformed

    private void jButtonVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisitActionPerformed
        try {
            ((CtrlMenu)controleur).visiteur();       // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(VueMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonVisitActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMedoc;
    private javax.swing.JButton jButtonPrat;
    private javax.swing.JButton jButtonQuitter;
    private javax.swing.JButton jButtonVIsite;
    private javax.swing.JButton jButtonVisit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
