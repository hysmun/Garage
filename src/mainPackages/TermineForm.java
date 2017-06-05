/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackages;

import activite.Reparation;
import activite.Travail;
import centraleObj.CentraleCommand;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListDataListener;
import javax.swing.table.AbstractTableModel;
import testPackages.DataEncapsulate;
import vehicules.Voiture;

/**
 *
 * @author Morghen
 */
public class TermineForm extends javax.swing.JFrame {

    /**
     * Creates new form TermineForm
     */
    public TermineForm() {
        initComponents();
        travailTable.setModel(new MyTableModel(mainGarage.dE));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TravailLabel = new javax.swing.JLabel();
        OKButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        travailPanel = new javax.swing.JScrollPane();
        travailTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Garage HEPL - Terminer un travail");

        TravailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TravailLabel.setText("Travail :");

        OKButton.setText("OK");
        OKButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKButtonMouseClicked(evt);
            }
        });

        CancelButton.setText("Annuler");
        CancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelButtonMouseClicked(evt);
            }
        });

        travailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        travailPanel.setViewportView(travailTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TravailLabel)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(travailPanel)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 150, Short.MAX_VALUE)
                        .addComponent(OKButton)
                        .addGap(239, 239, 239)
                        .addComponent(CancelButton)
                        .addGap(163, 163, 163))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(TravailLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(travailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton)
                    .addComponent(OKButton))
                .addGap(47, 47, 47))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_CancelButtonMouseClicked

    private void OKButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKButtonMouseClicked
        
            
        switch(travailTable.getSelectedRow())
        {
            case 0:
                if(mainGarage.dE.travailPont1 != null)
                {
                    applicationGestionForm.appGestionPresencePont1Label.setText(mainGarage.libreString);
                    mainGarage.dE.llTravailFini.add(mainGarage.dE.travailPont1);
                    mainGarage.dE.travailPont1 = null;
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Veuillez selection un travail en cours","Erreur",JOptionPane.ERROR_MESSAGE);
                }
                break;
            case 1:
                if(mainGarage.dE.travailPont2 != null)
                {
                    applicationGestionForm.appGestionPresencePont2Label.setText(mainGarage.libreString);
                    mainGarage.dE.llTravailFini.add(mainGarage.dE.travailPont2);
                    mainGarage.dE.travailPont2 = null;
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Veuillez selection un travail en cours","Erreur",JOptionPane.ERROR_MESSAGE);
                }
                break;
            case 2:
                if(mainGarage.dE.travailPont3 != null)
                {
                    applicationGestionForm.appGestionPresencePont3Label.setText(mainGarage.libreString);
                    mainGarage.dE.llTravailFini.add(mainGarage.dE.travailPont3);
                    mainGarage.dE.travailPont3 = null;
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Veuillez selection un travail en cours","Erreur",JOptionPane.ERROR_MESSAGE);
                }
                break;
            case 3:
                if(mainGarage.dE.travailSol != null)
                {
                    applicationGestionForm.appGestionPresenceSolLabel.setText(mainGarage.libreString);
                    mainGarage.dE.llTravailFini.add(mainGarage.dE.travailSol);
                    mainGarage.dE.travailSol = null;
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Veuillez selection un travail en cours","Erreur",JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
        this.invalidate();
        this.dispose();
        
        
    }//GEN-LAST:event_OKButtonMouseClicked

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
            java.util.logging.Logger.getLogger(TermineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TermineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TermineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TermineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TermineForm().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel TravailLabel;
    private javax.swing.JScrollPane travailPanel;
    private javax.swing.JTable travailTable;
    // End of variables declaration//GEN-END:variables
class MyTableModel extends AbstractTableModel {

        private final Travail tTravailPont1;
        private final Travail tTravailPont2;
        private final Travail tTravailPont3;
        private final Travail tTravailSol;
        private final String[] tableHeaders = {"Type Travail", "Type Voiture", "Immatriculation", "Propriétaire","Remarque"};
        
        public MyTableModel(DataEncapsulate de)
        {
            tTravailPont1 = de.travailPont1;
            tTravailPont2 = de.travailPont2;
            tTravailPont3 = de.travailPont3;
            tTravailSol = de.travailSol;
        }

        @Override
        public String getColumnName(int columnIndex) {
            return tableHeaders[columnIndex];
        }
        
        @Override
        public int getRowCount() {
            return 4;
        }

        @Override
        public int getColumnCount() {
            return 5;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Travail myObj = tTravailPont1;
            switch(rowIndex)
            {
                case 0:
                    if(tTravailPont1 == null)
                        return "Rien en cours sur le Pont 1";
                    myObj = tTravailPont1;
                    break;
                case 1:
                    if(tTravailPont2 == null)
                        return "Rien en cours sur le Pont 2";
                    myObj = tTravailPont2;
                    break;
                case 2:
                    if(tTravailPont3 == null)
                        return "Rien en cours sur le Pont 3";
                    myObj = tTravailPont3;
                    break;
                case 3:
                    if(tTravailSol == null)
                        return "Rien en cours sur le Sol";
                    myObj = tTravailSol;
                    break;
            }
            
            switch(columnIndex)
            {
                case 0://type travail
                    return (myObj instanceof Reparation) ?  "Reparation" : "Entretien";
                case 1://Type voiture
                    return ( (Voiture) myObj.getVehi()).getTypeVoiture();
                case 2://imma
                    return ( (Voiture) myObj.getVehi()).getImmatriculation();
                case 3://proprio
                    return ""+( (Voiture) myObj.getVehi()).getClient().getNom() + " "+( (Voiture) myObj.getVehi()).getClient().getPrenom();
                case 4://desc
                    return myObj.getDescription();
            }
            return null;
        }
    }
}
