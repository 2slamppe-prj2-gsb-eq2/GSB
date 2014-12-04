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

        jButtonCr = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonVisit = new javax.swing.JButton();
        jButtonPrat = new javax.swing.JButton();
        jButtonMedoc = new javax.swing.JButton();
        jButtonQuitter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonCr.setText("Compte Rendus");
        jButtonCr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCr);
        jButtonCr.setBounds(77, 62, 122, 30);

        jLabel1.setBackground(new java.awt.Color(55, 66, 128));
        jLabel1.setText("MENU | APP GSB");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(77, 26, 440, 24);

        jButtonVisit.setText("Visiteurs");
        getContentPane().add(jButtonVisit);
        jButtonVisit.setBounds(77, 110, 122, 30);

        jButtonPrat.setText("Praticiens");
        getContentPane().add(jButtonPrat);
        jButtonPrat.setBounds(77, 158, 122, 30);

        jButtonMedoc.setText("Médicaments");
        getContentPane().add(jButtonMedoc);
        jButtonMedoc.setBounds(77, 206, 106, 30);

        jButtonQuitter.setText("Quitter");
        jButtonQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonQuitter);
        jButtonQuitter.setBounds(77, 254, 63, 30);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 0, 660, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCrActionPerformed

    private void jButtonQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitterActionPerformed
    System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonQuitterActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCr;
    private javax.swing.JButton jButtonMedoc;
    private javax.swing.JButton jButtonPrat;
    private javax.swing.JButton jButtonQuitter;
    private javax.swing.JButton jButtonVisit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
