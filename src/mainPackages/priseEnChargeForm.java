/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackages;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ante
 */
public class priseEnChargeForm extends javax.swing.JFrame {

    /**
     * Creates new form priseEnChargeForm
     */
    public priseEnChargeForm() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) priseEnChargeTable.getModel();
        for(int i = 0;i < mainGarage.linkedListVector.size();i++)
        {
            model.addRow(mainGarage.linkedListVector.get(i));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        priseEnChargeTravauxLabel = new javax.swing.JLabel();
        priseEnChargePontRadBut = new javax.swing.JRadioButton();
        priseEnChargeScrollPanel = new javax.swing.JScrollPane();
        priseEnChargeTable = new javax.swing.JTable();
        priseEnChargePontComboBox = new javax.swing.JComboBox<>();
        priseEnChargeSolRadBut = new javax.swing.JRadioButton();
        priseEnChargeOkButton = new javax.swing.JButton();
        priseEnChargeAnnulerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Garage HEPL - prise en charge d'un travail");

        priseEnChargeTravauxLabel.setText("Travaux en attente :");

        priseEnChargePontRadBut.setSelected(true);
        priseEnChargePontRadBut.setText("Pont");
        priseEnChargePontRadBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priseEnChargePontRadButMouseClicked(evt);
            }
        });

        priseEnChargeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type voiture", "Immatriculation", "Proprietaire", "Travail", "Remarques"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        priseEnChargeTable.setToolTipText("");
        priseEnChargeTable.setAutoscrolls(false);
        priseEnChargeScrollPanel.setViewportView(priseEnChargeTable);

        priseEnChargePontComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        priseEnChargeSolRadBut.setText("Sol");
        priseEnChargeSolRadBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priseEnChargeSolRadButMouseClicked(evt);
            }
        });

        priseEnChargeOkButton.setText("Ok");
        priseEnChargeOkButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priseEnChargeOkButtonMouseClicked(evt);
            }
        });

        priseEnChargeAnnulerButton.setText("Annuler");
        priseEnChargeAnnulerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priseEnChargeAnnulerButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(priseEnChargeTravauxLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priseEnChargeScrollPanel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priseEnChargeOkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(priseEnChargePontRadBut)
                                .addGap(44, 44, 44)
                                .addComponent(priseEnChargePontComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priseEnChargeAnnulerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priseEnChargeSolRadBut, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 299, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(priseEnChargeTravauxLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(priseEnChargeScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priseEnChargePontRadBut)
                    .addComponent(priseEnChargePontComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priseEnChargeSolRadBut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priseEnChargeOkButton)
                    .addComponent(priseEnChargeAnnulerButton))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void priseEnChargeOkButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priseEnChargeOkButtonMouseClicked

        Vector tmp = new Vector();
        DefaultTableModel model = (DefaultTableModel) priseEnChargeTable.getModel();
       
        
        if(priseEnChargeTable.getSelectedRowCount() == 1)
        {
            if(priseEnChargePontRadBut.isSelected())
            {
                //on va le mettre sur un des ponts 
                System.out.println("Prise en charge pont");
                switch((String)(priseEnChargePontComboBox.getSelectedItem()))
                {
                    case "1":
                        if(applicationGestionForm.appGestionPresencePont1Label.getText().equals(mainGarage.libreString))
                        {
                            //libre
                            applicationGestionForm.appGestionPresencePont1Label.setText(mainGarage.toString(priseEnChargeTable.getSelectedRow()));
                            tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(0));
                            tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(1));
                            tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(2));
                            tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(3));
                            tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(4));

                            mainGarage.listeEnCours.add(tmp);
                            
                            mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).clear();
                            mainGarage.linkedListVector.remove(priseEnChargeTable.getSelectedRow());
                            
                            model.removeRow(priseEnChargeTable.getSelectedRow());
                            this.invalidate();
                            
  
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Pont 1 occuper veuillez finir avec ce pont d'abord","Avertissement",JOptionPane.WARNING_MESSAGE);
                        }
                        break;
                    case "2":
                        if(applicationGestionForm.appGestionPresencePont2Label.getText().equals(mainGarage.libreString))
                        {
                            //libre
                            applicationGestionForm.appGestionPresencePont2Label.setText(mainGarage.toString(priseEnChargeTable.getSelectedRow()));
                            tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(0));
                            tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(1));
                            tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(2));
                            tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(3));
                            tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(4));
                            
                            mainGarage.listeEnCours.add(tmp);
                            
                            mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).clear();
                            mainGarage.linkedListVector.remove(priseEnChargeTable.getSelectedRow());
                            
                            model.removeRow(priseEnChargeTable.getSelectedRow());
                            this.invalidate();
                            
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Pont 2 occuper veuillez finir avec ce pont d'abord","Avertissement",JOptionPane.WARNING_MESSAGE);
                        }
                        break;
                    case "3":
                        if(applicationGestionForm.appGestionPresencePont3Label.getText().equals(mainGarage.libreString))
                        {
                            //libre
                            applicationGestionForm.appGestionPresencePont3Label.setText(mainGarage.toString(priseEnChargeTable.getSelectedRow()));
                            tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(0));
                            tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(1));
                            tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(2));
                            tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(3));
                            tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(4));
                            
                            mainGarage.listeEnCours.add(tmp);
                            
                            mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).clear();
                            mainGarage.linkedListVector.remove(priseEnChargeTable.getSelectedRow());
                            
                            model.removeRow(priseEnChargeTable.getSelectedRow());
                            this.invalidate();
                            
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Pont 3 occuper veuillez finir avec ce pont d'abord","Avertissement",JOptionPane.WARNING_MESSAGE);
                        }
                        break;
                    default:
                        System.out.println("Error prise en charge!");
                }
            }
            else if(priseEnChargeSolRadBut.isSelected())
            {
                //on va le pose sur le sol 
                if(applicationGestionForm.appGestionPresenceSolLabel.getText().equals(mainGarage.libreString))
                {
                    //libre
                    applicationGestionForm.appGestionPresenceSolLabel.setText(mainGarage.toString(priseEnChargeTable.getSelectedRow()));
                    tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(0));
                    tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(1));
                    tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(2));
                    tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(3));
                    tmp.add((String)mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).get(4));
                            
                    mainGarage.listeEnCours.add(tmp);    
                                                
                    mainGarage.linkedListVector.get(priseEnChargeTable.getSelectedRow()).clear();
                    mainGarage.linkedListVector.remove(priseEnChargeTable.getSelectedRow());
                            
                    model.removeRow(priseEnChargeTable.getSelectedRow());
                    this.invalidate();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Le Sol est occuper veuillez finir avec d'abord","Avertissement",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_priseEnChargeOkButtonMouseClicked

    private void priseEnChargeAnnulerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priseEnChargeAnnulerButtonMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_priseEnChargeAnnulerButtonMouseClicked

    private void priseEnChargePontRadButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priseEnChargePontRadButMouseClicked
        // TODO add your handling code here:
        priseEnChargePontRadBut.setSelected(true);
        priseEnChargeSolRadBut.setSelected(false);
    }//GEN-LAST:event_priseEnChargePontRadButMouseClicked

    private void priseEnChargeSolRadButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priseEnChargeSolRadButMouseClicked
        // TODO add your handling code here:
        priseEnChargeSolRadBut.setSelected(true);
        priseEnChargePontRadBut.setSelected(false);
    }//GEN-LAST:event_priseEnChargeSolRadButMouseClicked

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
            java.util.logging.Logger.getLogger(priseEnChargeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(priseEnChargeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(priseEnChargeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(priseEnChargeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new priseEnChargeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton priseEnChargeAnnulerButton;
    private javax.swing.JButton priseEnChargeOkButton;
    private javax.swing.JComboBox<String> priseEnChargePontComboBox;
    private javax.swing.JRadioButton priseEnChargePontRadBut;
    private javax.swing.JScrollPane priseEnChargeScrollPanel;
    private javax.swing.JRadioButton priseEnChargeSolRadBut;
    private javax.swing.JTable priseEnChargeTable;
    private javax.swing.JLabel priseEnChargeTravauxLabel;
    // End of variables declaration//GEN-END:variables
}
