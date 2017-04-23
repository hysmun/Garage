/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackages;

/**
 *
 * @author ante
 */
public class applicationGestionForm extends javax.swing.JFrame {

    /**
     * Creates new form applicationGestionForm
     */
    public applicationGestionForm() {
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

        appGestionAtelierLabel = new javax.swing.JLabel();
        appGestionPont1Label = new javax.swing.JLabel();
        appGestionPont2label = new javax.swing.JLabel();
        appGestionPont3label = new javax.swing.JLabel();
        appGestionSolLabel = new javax.swing.JLabel();
        appGestionDiversLabel = new javax.swing.JLabel();
        appGestionBureauLabel = new javax.swing.JLabel();
        appGestionBureauClientLabel = new javax.swing.JLabel();
        appGestionBureauComptaLabel = new javax.swing.JLabel();
        appGestionComptaPresenceLabel = new javax.swing.JLabel();
        appGestionToutPresentRadBut = new javax.swing.JRadioButton();
        appGestionCertAbsRadBut = new javax.swing.JRadioButton();
        appGestionImagePanel = new javax.swing.JPanel();
        appGestionPresencePont1Label = new javax.swing.JLabel();
        appGestionPresencePont2Label = new javax.swing.JLabel();
        appGestionPresencePont3Label = new javax.swing.JLabel();
        appGestionPresenceSolLabel = new javax.swing.JLabel();
        appGestionPresenceDiversLabel = new javax.swing.JLabel();
        appGestionPresenceBureauLabel = new javax.swing.JLabel();
        appGestionDateLabel = new javax.swing.JLabel();
        appGestionPatronCheckBox = new javax.swing.JCheckBox();
        appGestionPauseCheckBox = new javax.swing.JCheckBox();
        appGestionMenuBar = new javax.swing.JMenuBar();
        appGestionAtelierMenu = new javax.swing.JMenu();
        appGestionAPrevoirItem = new javax.swing.JMenuItem();
        appGestionPriseItem = new javax.swing.JMenuItem();
        appGestionTerminerItem = new javax.swing.JMenuItem();
        appGestionListesItem = new javax.swing.JMenuItem();
        appGestionMaterielMenu = new javax.swing.JMenu();
        appGestionClientsMenu = new javax.swing.JMenu();
        appGestionFacturesMenu = new javax.swing.JMenu();
        appGestionParamMenu = new javax.swing.JMenu();
        appGestionAideMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Garage HEPL - la polyclinique de vos voitures");

        appGestionAtelierLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        appGestionAtelierLabel.setText("Atelier");

        appGestionPont1Label.setText("Pont n°1 :");

        appGestionPont2label.setText("Pont n°2 :");

        appGestionPont3label.setText("Pont n°3 :");

        appGestionSolLabel.setText("Sol :");

        appGestionDiversLabel.setText("Divers :");

        appGestionBureauLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        appGestionBureauLabel.setText("Bureau");

        appGestionBureauClientLabel.setText("Bureau Client :");

        appGestionBureauComptaLabel.setText("Bureau comptabilité :");

        appGestionComptaPresenceLabel.setText("Mr Boulier est là");

        appGestionToutPresentRadBut.setText("Tout le monde présent");
        appGestionToutPresentRadBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appGestionToutPresentRadButMouseClicked(evt);
            }
        });

        appGestionCertAbsRadBut.setText("Certains absents");
        appGestionCertAbsRadBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appGestionCertAbsRadButMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout appGestionImagePanelLayout = new javax.swing.GroupLayout(appGestionImagePanel);
        appGestionImagePanel.setLayout(appGestionImagePanelLayout);
        appGestionImagePanelLayout.setHorizontalGroup(
            appGestionImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        appGestionImagePanelLayout.setVerticalGroup(
            appGestionImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        appGestionPresencePont1Label.setBackground(new java.awt.Color(255, 255, 0));
        appGestionPresencePont1Label.setText("-- libre --");
        appGestionPresencePont1Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        appGestionPresencePont2Label.setText("--libre --");
        appGestionPresencePont2Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        appGestionPresencePont3Label.setText("-- libre --");
        appGestionPresencePont3Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        appGestionPresenceSolLabel.setText("-- libre --");
        appGestionPresenceSolLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        appGestionPresenceDiversLabel.setText("-- libre --");
        appGestionPresenceDiversLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        appGestionPresenceBureauLabel.setText("-- libre --");
        appGestionPresenceBureauLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        appGestionDateLabel.setText("23/03/2017    13:19h");

        appGestionPatronCheckBox.setText("Patron disponible");
        appGestionPatronCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appGestionPatronCheckBoxMouseClicked(evt);
            }
        });

        appGestionPauseCheckBox.setText("Pause-Midi");
        appGestionPauseCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appGestionPauseCheckBoxMouseClicked(evt);
            }
        });

        appGestionAtelierMenu.setText("Atelier");

        appGestionAPrevoirItem.setText("A prévoir");
        appGestionAPrevoirItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                appGestionAPrevoirItemMousePressed(evt);
            }
        });
        appGestionAtelierMenu.add(appGestionAPrevoirItem);

        appGestionPriseItem.setText("Prise en charge");
        appGestionAtelierMenu.add(appGestionPriseItem);

        appGestionTerminerItem.setText("Terminé");
        appGestionAtelierMenu.add(appGestionTerminerItem);

        appGestionListesItem.setText("Listes");
        appGestionAtelierMenu.add(appGestionListesItem);

        appGestionMenuBar.add(appGestionAtelierMenu);

        appGestionMaterielMenu.setText("Matériel");
        appGestionMenuBar.add(appGestionMaterielMenu);

        appGestionClientsMenu.setText("Clients");
        appGestionMenuBar.add(appGestionClientsMenu);

        appGestionFacturesMenu.setText("Factures");
        appGestionMenuBar.add(appGestionFacturesMenu);

        appGestionParamMenu.setText("Paramètres");
        appGestionParamMenu.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        appGestionMenuBar.add(appGestionParamMenu);

        appGestionAideMenu.setText("Aide");
        appGestionMenuBar.add(appGestionAideMenu);

        setJMenuBar(appGestionMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(appGestionPont2label)
                            .addComponent(appGestionPont1Label)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(appGestionPont3label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(appGestionSolLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(appGestionDiversLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(appGestionBureauLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(appGestionAtelierLabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(appGestionPresenceDiversLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(appGestionPresenceSolLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(appGestionPresencePont3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(appGestionPresencePont2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(appGestionPresencePont1Label, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(appGestionBureauComptaLabel)
                            .addComponent(appGestionBureauClientLabel))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(appGestionPresenceBureauLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(appGestionComptaPresenceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(appGestionPatronCheckBox)
                            .addComponent(appGestionPauseCheckBox))
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(appGestionCertAbsRadBut)
                            .addComponent(appGestionToutPresentRadBut)))
                    .addComponent(appGestionImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appGestionDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(appGestionAtelierLabel)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(appGestionPont1Label)
                            .addComponent(appGestionPresencePont1Label))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(appGestionPont2label)
                            .addComponent(appGestionPresencePont2Label))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(appGestionPont3label)
                            .addComponent(appGestionPresencePont3Label))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(appGestionSolLabel)
                            .addComponent(appGestionPresenceSolLabel))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(appGestionDiversLabel)
                            .addComponent(appGestionPresenceDiversLabel))
                        .addGap(36, 36, 36)
                        .addComponent(appGestionBureauLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(appGestionDateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appGestionImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appGestionBureauClientLabel)
                    .addComponent(appGestionToutPresentRadBut)
                    .addComponent(appGestionPresenceBureauLabel)
                    .addComponent(appGestionPatronCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appGestionBureauComptaLabel)
                    .addComponent(appGestionComptaPresenceLabel)
                    .addComponent(appGestionCertAbsRadBut)
                    .addComponent(appGestionPauseCheckBox))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void appGestionToutPresentRadButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appGestionToutPresentRadButMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_appGestionToutPresentRadButMouseClicked

    private void appGestionCertAbsRadButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appGestionCertAbsRadButMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_appGestionCertAbsRadButMouseClicked

    private void appGestionPatronCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appGestionPatronCheckBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_appGestionPatronCheckBoxMouseClicked

    private void appGestionPauseCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appGestionPauseCheckBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_appGestionPauseCheckBoxMouseClicked

    private void appGestionAPrevoirItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appGestionAPrevoirItemMousePressed
        // TODO add your handling code here:
        RDVForm aprevoirForm = new RDVForm();
        aprevoirForm.setVisible(true);
    }//GEN-LAST:event_appGestionAPrevoirItemMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(applicationGestionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(applicationGestionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(applicationGestionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(applicationGestionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new applicationGestionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem appGestionAPrevoirItem;
    private javax.swing.JMenu appGestionAideMenu;
    private javax.swing.JLabel appGestionAtelierLabel;
    private javax.swing.JMenu appGestionAtelierMenu;
    private javax.swing.JLabel appGestionBureauClientLabel;
    private javax.swing.JLabel appGestionBureauComptaLabel;
    private javax.swing.JLabel appGestionBureauLabel;
    private javax.swing.JRadioButton appGestionCertAbsRadBut;
    private javax.swing.JMenu appGestionClientsMenu;
    private javax.swing.JLabel appGestionComptaPresenceLabel;
    private javax.swing.JLabel appGestionDateLabel;
    private javax.swing.JLabel appGestionDiversLabel;
    private javax.swing.JMenu appGestionFacturesMenu;
    private javax.swing.JPanel appGestionImagePanel;
    private javax.swing.JMenuItem appGestionListesItem;
    private javax.swing.JMenu appGestionMaterielMenu;
    private javax.swing.JMenuBar appGestionMenuBar;
    private javax.swing.JMenu appGestionParamMenu;
    private javax.swing.JCheckBox appGestionPatronCheckBox;
    private javax.swing.JCheckBox appGestionPauseCheckBox;
    private javax.swing.JLabel appGestionPont1Label;
    private javax.swing.JLabel appGestionPont2label;
    private javax.swing.JLabel appGestionPont3label;
    private javax.swing.JLabel appGestionPresenceBureauLabel;
    private javax.swing.JLabel appGestionPresenceDiversLabel;
    private javax.swing.JLabel appGestionPresencePont1Label;
    private javax.swing.JLabel appGestionPresencePont2Label;
    private javax.swing.JLabel appGestionPresencePont3Label;
    private javax.swing.JLabel appGestionPresenceSolLabel;
    private javax.swing.JMenuItem appGestionPriseItem;
    private javax.swing.JLabel appGestionSolLabel;
    private javax.swing.JMenuItem appGestionTerminerItem;
    private javax.swing.JRadioButton appGestionToutPresentRadBut;
    // End of variables declaration//GEN-END:variables
}
