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
        jLabel9 = new javax.swing.JLabel();
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

        jLabel9.setText("jLabel9");

        appGestionAtelierMenu.setText("Atelier");

        appGestionAPrevoirItem.setText("A prévoir");
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
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(appGestionBureauComptaLabel)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(appGestionPont2label)
                        .addComponent(appGestionPont1Label)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(appGestionSolLabel)
                            .addComponent(appGestionPont3label)
                            .addComponent(appGestionDiversLabel)
                            .addComponent(appGestionBureauLabel))
                        .addComponent(appGestionAtelierLabel, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(appGestionBureauClientLabel))
                .addContainerGap(722, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(appGestionAtelierLabel)
                .addGap(48, 48, 48)
                .addComponent(appGestionPont1Label)
                .addGap(50, 50, 50)
                .addComponent(appGestionPont2label)
                .addGap(50, 50, 50)
                .addComponent(appGestionPont3label)
                .addGap(49, 49, 49)
                .addComponent(appGestionSolLabel)
                .addGap(55, 55, 55)
                .addComponent(appGestionDiversLabel)
                .addGap(36, 36, 36)
                .addComponent(appGestionBureauLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appGestionBureauClientLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appGestionBureauComptaLabel)
                    .addComponent(jLabel9))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JMenu appGestionClientsMenu;
    private javax.swing.JLabel appGestionDiversLabel;
    private javax.swing.JMenu appGestionFacturesMenu;
    private javax.swing.JMenuItem appGestionListesItem;
    private javax.swing.JMenu appGestionMaterielMenu;
    private javax.swing.JMenuBar appGestionMenuBar;
    private javax.swing.JMenu appGestionParamMenu;
    private javax.swing.JLabel appGestionPont1Label;
    private javax.swing.JLabel appGestionPont2label;
    private javax.swing.JLabel appGestionPont3label;
    private javax.swing.JMenuItem appGestionPriseItem;
    private javax.swing.JLabel appGestionSolLabel;
    private javax.swing.JMenuItem appGestionTerminerItem;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
