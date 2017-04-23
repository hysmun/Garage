/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackages;

/**
 *
 * @author Morghen
 */
public class RDVForm extends javax.swing.JFrame {

    
    
    public RDVForm() {
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

        TypeVoiture = new javax.swing.JLabel();
        Immatriculation = new javax.swing.JLabel();
        Proprio = new javax.swing.JLabel();
        TypeTravail = new javax.swing.JLabel();
        Bonus = new javax.swing.JLabel();
        VoitTF = new javax.swing.JTextField();
        ImmatTF = new javax.swing.JTextField();
        BonusTF = new javax.swing.JTextField();
        ProprioCB = new javax.swing.JComboBox(mainGarage.listeProprio);
        newCheck = new javax.swing.JCheckBox();
        EntretienRB = new javax.swing.JRadioButton();
        ReparationRB = new javax.swing.JRadioButton();
        PlaqueBelgeCheck = new javax.swing.JCheckBox();
        TypeTravailCB = new javax.swing.JComboBox<>();
        OKButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Garage HEPL - Nouveau travail pour l'atelier");
        setName("RDVForm"); // NOI18N

        TypeVoiture.setText("Type voiture :");

        Immatriculation.setText("Immatriculation :");

        Proprio.setText("Proprietaire :");

        TypeTravail.setText("Type de travail :");

        Bonus.setText("Instructions particulieres :");

        newCheck.setText("Nouveau");

        EntretienRB.setSelected(true);
        EntretienRB.setText("Entretien");
        EntretienRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EntretienRBMousePressed(evt);
            }
        });

        ReparationRB.setText("Reparation");

        PlaqueBelgeCheck.setText("Plaque belge");

        TypeTravailCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        OKButton.setText("OK");

        CancelButton.setText("Annuler");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(OKButton)
                        .addGap(157, 157, 157)
                        .addComponent(CancelButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(BonusTF))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(EntretienRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ReparationRB))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TypeTravail)
                                        .addGap(18, 18, 18)
                                        .addComponent(TypeTravailCB, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TypeVoiture)
                                            .addComponent(Immatriculation)
                                            .addComponent(Proprio))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ImmatTF, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                                .addComponent(PlaqueBelgeCheck))
                                            .addComponent(VoitTF)
                                            .addComponent(ProprioCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(25, 25, 25)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newCheck)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bonus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeVoiture)
                    .addComponent(VoitTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Immatriculation)
                    .addComponent(ImmatTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlaqueBelgeCheck))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Proprio)
                    .addComponent(ProprioCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newCheck))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntretienRB)
                    .addComponent(ReparationRB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TypeTravail)
                    .addComponent(TypeTravailCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(Bonus)
                .addGap(5, 5, 5)
                .addComponent(BonusTF, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OKButton)
                    .addComponent(CancelButton))
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EntretienRBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntretienRBMousePressed
        if(ReparationRB.isSelected() == true)
            ReparationRB.setSelected(false);
        EntretienRB.setSelected(true);
        ProprioCB = new javax.swing.JComboBox(mainGarage.listeTravailEntretien);
        
    }//GEN-LAST:event_EntretienRBMousePressed

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
            java.util.logging.Logger.getLogger(RDVForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RDVForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RDVForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RDVForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RDVForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bonus;
    private javax.swing.JTextField BonusTF;
    private javax.swing.JButton CancelButton;
    private javax.swing.JRadioButton EntretienRB;
    private javax.swing.JTextField ImmatTF;
    private javax.swing.JLabel Immatriculation;
    private javax.swing.JButton OKButton;
    private javax.swing.JCheckBox PlaqueBelgeCheck;
    private javax.swing.JLabel Proprio;
    private javax.swing.JComboBox ProprioCB;
    private javax.swing.JRadioButton ReparationRB;
    private javax.swing.JLabel TypeTravail;
    private javax.swing.JComboBox<String> TypeTravailCB;
    private javax.swing.JLabel TypeVoiture;
    private javax.swing.JTextField VoitTF;
    private javax.swing.JCheckBox newCheck;
    // End of variables declaration//GEN-END:variables
}
