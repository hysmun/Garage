/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackages;

import activite.Reparation;
import activite.Travail;
import java.util.LinkedList;
import java.util.List;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;
import testPackages.DataEncapsulate;

/**
 *
 * @author ante
 */
public class ListTravailForm extends javax.swing.JDialog {

    /**
     * Creates new form ListTravailForm
     */
    public ListTravailForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try
        {
            initComponents();
            travailPrevuList.setModel(new MyListModel(mainGarage.dE.llTravailPrevu));
            travailEnCoursList.setModel(new MyComboBoxModel(mainGarage.dE));
            travailFiniList.setModel(new MyListModel(mainGarage.dE.llTravailFini));
        }
        catch(Exception e)
        {
            applicationGestionForm.Log.write("C:\t Erreur creation list travail " + e.getMessage());
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

        travailPrevuPanel = new javax.swing.JScrollPane();
        travailPrevuList = new javax.swing.JList<>();
        travailPrevuLabel = new javax.swing.JLabel();
        travailEnCoursLabel = new javax.swing.JLabel();
        travailFiniLabel = new javax.swing.JLabel();
        travailEnCoursPanel = new javax.swing.JScrollPane();
        travailEnCoursList = new javax.swing.JList<>();
        travailFiniPanel = new javax.swing.JScrollPane();
        travailFiniList = new javax.swing.JList<>();
        OKButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        travailPrevuPanel.setViewportView(travailPrevuList);

        travailPrevuLabel.setText("Travail Prevu :");

        travailEnCoursLabel.setText("Travail En Cours :");

        travailFiniLabel.setText("Travail Fini :");

        travailEnCoursPanel.setViewportView(travailEnCoursList);

        travailFiniPanel.setViewportView(travailFiniList);

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(travailPrevuLabel)
                    .addComponent(travailPrevuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(travailEnCoursPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(travailEnCoursLabel))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(travailFiniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(travailFiniLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(483, 483, 483)
                .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(travailPrevuLabel)
                    .addComponent(travailEnCoursLabel)
                    .addComponent(travailFiniLabel))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(travailFiniPanel)
                    .addComponent(travailPrevuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(travailEnCoursPanel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_OKButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ListTravailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListTravailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListTravailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListTravailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListTravailForm dialog = new ListTravailForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel travailEnCoursLabel;
    private javax.swing.JList<String> travailEnCoursList;
    private javax.swing.JScrollPane travailEnCoursPanel;
    private javax.swing.JLabel travailFiniLabel;
    private javax.swing.JList<String> travailFiniList;
    private javax.swing.JScrollPane travailFiniPanel;
    private javax.swing.JLabel travailPrevuLabel;
    private javax.swing.JList<String> travailPrevuList;
    private javax.swing.JScrollPane travailPrevuPanel;
    // End of variables declaration//GEN-END:variables
    class MyListModel implements ListModel
    {
        private final List<Travail> lTravail;
        private final LinkedList<ListDataListener> ldt;
        
        public MyListModel(List<Travail> l)
        {
            this.lTravail = l;
            ldt = new LinkedList<ListDataListener>();
        }
        
        @Override
        public int getSize() {
            return lTravail.size();
        }

        @Override
        public Object getElementAt(int index) {
            return lTravail.get(index).toString();
        }

        @Override
        public void addListDataListener(ListDataListener l) {
            ldt.add(l);
        }

        @Override
        public void removeListDataListener(ListDataListener l) {
            ldt.remove(l);
        }
        
    }
    class MyComboBoxModel implements ListModel {

        private final Travail tTravailPont1;
        private final Travail tTravailPont2;
        private final Travail tTravailPont3;
        private final Travail tTravailSol;
        private final LinkedList<ListDataListener> ldt;
        
        public MyComboBoxModel(DataEncapsulate de)
        {
            tTravailPont1 = de.travailPont1;
            tTravailPont2 = de.travailPont2;
            tTravailPont3 = de.travailPont3;
            tTravailSol = de.travailSol;
            ldt = new LinkedList<ListDataListener>();
        }

        @Override
        public int getSize() {
            return 4;
        }

        @Override
        public Object getElementAt(int index) {
            switch(index)
            {
                case 0:
                    if(tTravailPont1 == null)
                        return "Rien en cours sur le Pont 1";
                    return tTravailPont1.toString();
                case 1:
                    if(tTravailPont2 == null)
                        return "Rien en cours sur le Pont 2";
                    return tTravailPont2.toString();
                case 2:
                    if(tTravailPont3 == null)
                        return "Rien en cours sur le Pont 3";
                    return tTravailPont3.toString();
                case 3:
                    if(tTravailSol == null)
                        return "Rien en cours sur le Sol";
                    return tTravailSol.toString();
            }
            return "erreur";
        }

        @Override
        public void addListDataListener(ListDataListener l) {
            ldt.add(l);
        }

        @Override
        public void removeListDataListener(ListDataListener l) {
            ldt.remove(l);
        }
    }
}

