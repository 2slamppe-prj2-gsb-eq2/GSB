/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author btssio
 */
public class RapportVisite extends javax.swing.JPanel {

    /**
     * Creates new form RapportVisite
     */
    public RapportVisite() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelRapportVisite = new javax.swing.JLabel();
        jLabelNumeroRapport = new javax.swing.JLabel();
        jLabelPraticien = new javax.swing.JLabel();
        jLabelDateRapport = new javax.swing.JLabel();
        jLabelMotifVisite = new javax.swing.JLabel();
        jLabelBilan = new javax.swing.JLabel();
        jTextFieldNumRapport = new javax.swing.JTextField();
        jComboBoxPraticien = new javax.swing.JComboBox();
        jButtonDetail = new javax.swing.JButton();
        jTextFieldDateRapport = new javax.swing.JTextField();
        jTextFieldMotifVisite = new javax.swing.JTextField();
        jTextFieldBilan = new javax.swing.JTextField();
        jButtonPrecedent = new javax.swing.JButton();
        jButtonSuivant = new javax.swing.JButton();
        jButtonNouveau = new javax.swing.JButton();
        jLabelOffreEchantillon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOffreEchantillon = new javax.swing.JTable();
        jButtonFermer = new javax.swing.JButton();

        jLabelRapportVisite.setText("Rapports de  Visite");

        jLabelNumeroRapport.setText("Numéro Rapport");

        jLabelPraticien.setText("Praticien");

        jLabelDateRapport.setText("Date Rapport");

        jLabelMotifVisite.setText("Motif Visite");

        jLabelBilan.setText("BILAN");

        jComboBoxPraticien.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonDetail.setText("Détail");

        jButtonPrecedent.setText("Précédent");

        jButtonSuivant.setText("Suivant");

        jButtonNouveau.setText("Nouveau");

        jLabelOffreEchantillon.setText("Offre d'échantillons");

        jTableOffreEchantillon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Médicaments", "NbEchantillon"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableOffreEchantillon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTableOffreEchantillon);

        jButtonFermer.setText("Fermer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(266, 266, 266)
                            .addComponent(jLabelRapportVisite))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelNumeroRapport)
                                .addComponent(jLabelPraticien)
                                .addComponent(jLabelDateRapport)
                                .addComponent(jLabelMotifVisite)
                                .addComponent(jLabelBilan))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jComboBoxPraticien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonDetail))
                                .addComponent(jTextFieldMotifVisite)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldNumRapport, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldDateRapport, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jTextFieldBilan))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jButtonPrecedent)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSuivant)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNouveau)
                        .addGap(67, 67, 67)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelOffreEchantillon)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFermer)
                        .addGap(111, 111, 111))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelRapportVisite)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroRapport)
                    .addComponent(jTextFieldNumRapport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPraticien)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxPraticien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonDetail)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDateRapport)
                    .addComponent(jTextFieldDateRapport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMotifVisite)
                    .addComponent(jTextFieldMotifVisite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBilan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBilan))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPrecedent)
                            .addComponent(jButtonSuivant)
                            .addComponent(jButtonNouveau)
                            .addComponent(jButtonFermer)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelOffreEchantillon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetail;
    private javax.swing.JButton jButtonFermer;
    private javax.swing.JButton jButtonNouveau;
    private javax.swing.JButton jButtonPrecedent;
    private javax.swing.JButton jButtonSuivant;
    private javax.swing.JComboBox jComboBoxPraticien;
    private javax.swing.JLabel jLabelBilan;
    private javax.swing.JLabel jLabelDateRapport;
    private javax.swing.JLabel jLabelMotifVisite;
    private javax.swing.JLabel jLabelNumeroRapport;
    private javax.swing.JLabel jLabelOffreEchantillon;
    private javax.swing.JLabel jLabelPraticien;
    private javax.swing.JLabel jLabelRapportVisite;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOffreEchantillon;
    private javax.swing.JTextField jTextFieldBilan;
    private javax.swing.JTextField jTextFieldDateRapport;
    private javax.swing.JTextField jTextFieldMotifVisite;
    private javax.swing.JTextField jTextFieldNumRapport;
    // End of variables declaration//GEN-END:variables
}
