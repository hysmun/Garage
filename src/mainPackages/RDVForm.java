/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackages;

import activite.Entretien;
import activite.Reparation;
import exception.MissingTradeMarkException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static mainPackages.mainGarage.dE;
import people.Client;
import people.PersonnelGarage;
import people.addClients;
import vehicules.TypeVoiture;
import vehicules.Vehicule;
import vehicules.Voiture;

/**
 *
 * @author Morghen
 */
public class RDVForm extends javax.swing.JFrame {

    public DefaultComboBoxModel ReparationCBM = new DefaultComboBoxModel();
    public DefaultComboBoxModel EntretienCBM = new DefaultComboBoxModel();
    public Entretien entretien;
    public Reparation reparation;
    public Client client;
    public PersonnelGarage persogarage;
    public Vehicule vehi;
    
    
    public RDVForm() {
        initComponents();
        ReparationCBM.addElement("Courroie");
        ReparationCBM.addElement("Transmission");
        ReparationCBM.addElement("Freins");
        ReparationCBM.addElement("Pistons");
        EntretienCBM.addElement("Vidange");
        EntretienCBM.addElement("Petit entretien");
        EntretienCBM.addElement("Gros entretien");
        EntretienCBM.addElement("Gonflage des pneus");
        TypeTravailCB.setModel(EntretienCBM);
        if(!dE.vClient.isEmpty())
        {
            for(Client unClient : dE.vClient)
            {
                ProprioCB.addItem(unClient.getPrenom() + " " + unClient.getNom());
            }
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

        MarqueLabel = new javax.swing.JLabel();
        Immatriculation = new javax.swing.JLabel();
        Proprio = new javax.swing.JLabel();
        TypeTravail = new javax.swing.JLabel();
        Bonus = new javax.swing.JLabel();
        MarqueTF = new javax.swing.JTextField();
        ImmatTF = new javax.swing.JTextField();
        BonusTF = new javax.swing.JTextField();
        ProprioCB = new javax.swing.JComboBox();
        NouveauCheck = new javax.swing.JCheckBox();
        EntretienRB = new javax.swing.JRadioButton();
        ReparationRB = new javax.swing.JRadioButton();
        PlaqueBelgeCheck = new javax.swing.JCheckBox();
        TypeTravailCB = new javax.swing.JComboBox();
        OKButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        ModeleLabel = new javax.swing.JLabel();
        ModeleTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Garage HEPL - Nouveau travail pour l'atelier");
        setName("RDVForm"); // NOI18N

        MarqueLabel.setText("Marque :");

        Immatriculation.setText("Immatriculation :");

        Proprio.setText("Proprietaire :");

        TypeTravail.setText("Type de travail :");

        Bonus.setText("Instructions particulieres :");

        NouveauCheck.setText("Nouveau");

        EntretienRB.setSelected(true);
        EntretienRB.setText("Entretien");
        ButtonGroup RepaEntre = new ButtonGroup();
        RepaEntre.add(EntretienRB);
        RepaEntre.add(ReparationRB);
        EntretienRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntretienRBActionPerformed(evt);
            }
        });

        ReparationRB.setText("Reparation");
        ReparationRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReparationRBActionPerformed(evt);
            }
        });

        PlaqueBelgeCheck.setText("Plaque belge");

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

        ModeleLabel.setText("Modèle :");

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
                                            .addComponent(Immatriculation)
                                            .addComponent(Proprio))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ImmatTF, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                                .addComponent(PlaqueBelgeCheck))
                                            .addComponent(ProprioCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MarqueLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MarqueTF, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(ModeleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ModeleTF)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NouveauCheck)
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
                    .addComponent(MarqueLabel)
                    .addComponent(MarqueTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModeleLabel)
                    .addComponent(ModeleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Immatriculation)
                    .addComponent(ImmatTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlaqueBelgeCheck))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Proprio)
                    .addComponent(ProprioCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NouveauCheck))
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

    private void CancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_CancelButtonMouseClicked

    private void OKButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKButtonMouseClicked
        if(MarqueTF.getText().equals("") || ImmatTF.getText().equals("") || ModeleTF.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Certains champs obligatoires sont vides", "Erreur",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(ProprioCB.getSelectedItem() == null && !NouveauCheck.isSelected())
        {
            JOptionPane.showMessageDialog(null,"Client invalide/inexistant","Erreur",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(NouveauCheck.isSelected())
        {
            addClients nouvClient = new addClients(this,true);
            nouvClient.setVisible(true);
            ProprioCB.addItem(dE.vClient.lastElement().getPrenom() + " " + dE.vClient.lastElement().getNom());
            NouveauCheck.setSelected(false);
            return;
        }
        client = dE.vClient.get(ProprioCB.getSelectedIndex());
        try {
            vehi = new Voiture(new TypeVoiture(MarqueTF.getText(),ModeleTF.getText(),4),ImmatTF.getText(),"Voiture#"+ new Random().nextInt(100),client);
        } catch (MissingTradeMarkException ex) {
            Logger.getLogger(RDVForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(EntretienRB.isSelected())
        {
            entretien = new Entretien("Entretien#"+ new Random().nextInt(100),persogarage,vehi,new Random().nextDouble()*500,BonusTF.getText(),0);
            dE.llTravailPrevu.add(entretien);
            JOptionPane.showMessageDialog(null,"Travail créé","Information",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
        else
        {
            reparation = new Reparation("Reparation#"+ new Random().nextInt(100),persogarage,vehi,new Random().nextDouble()*500,BonusTF.getText(),0);
            dE.llTravailPrevu.add(reparation);
            JOptionPane.showMessageDialog(null,"Travail créé","Information",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_OKButtonMouseClicked

    private void EntretienRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntretienRBActionPerformed
        if(EntretienRB.isSelected())
        {
            TypeTravailCB.setModel(EntretienCBM);
        }
    }//GEN-LAST:event_EntretienRBActionPerformed

    private void ReparationRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReparationRBActionPerformed
        if(ReparationRB.isSelected())
        {
            TypeTravailCB.setModel(ReparationCBM);
        }
    }//GEN-LAST:event_ReparationRBActionPerformed

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
    private javax.swing.JLabel MarqueLabel;
    private javax.swing.JTextField MarqueTF;
    private javax.swing.JLabel ModeleLabel;
    private javax.swing.JTextField ModeleTF;
    private javax.swing.JCheckBox NouveauCheck;
    private javax.swing.JButton OKButton;
    private javax.swing.JCheckBox PlaqueBelgeCheck;
    private javax.swing.JLabel Proprio;
    javax.swing.JComboBox ProprioCB;
    private javax.swing.JRadioButton ReparationRB;
    private javax.swing.JLabel TypeTravail;
    javax.swing.JComboBox TypeTravailCB;
    // End of variables declaration//GEN-END:variables
}
