/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propertiescreation;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Random;
import javax.swing.JOptionPane;
import mainPackages.applicationGestionForm;
import mainPackages.mainGarage;
import static mainPackages.mainGarage.dE;
import people.Employe;
import people.TechnicienExterieur;

/**
 *
 * @author Morghen
 */
public class AdminCreation extends javax.swing.JDialog {

    Properties prop1;
    Properties prop2;
    InputStream in1;
    InputStream in2;
    OutputStream out1;
    OutputStream out2;
    String sep;
    File dir;
    
    public AdminCreation(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        sep = System.getProperty("file.separator");
        String current = System.getProperty("user.dir");
        dir = new File("accounts");
        if(!dir.exists())
        {
            try
            {
                dir.mkdir();
            }
            catch(SecurityException se)
            {
                applicationGestionForm.Log.write(se.getMessage());
            }
        }
        try
        {  
            in1 = new FileInputStream(dir + sep + "member.properties");
            in2 = new FileInputStream(dir + sep + "extern.properties");
            prop1 = new Properties();
            prop2 = new Properties();
            try 
            {
                prop1.load(in1);
                prop2.load(in2);
                in1.close();
                in2.close();
            }
            catch(IOException ex)
            {
                ex.printStackTrace();
            }         
        }
        catch(IOException io)
        {
            io.printStackTrace();
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

        LoginLabel = new javax.swing.JLabel();
        LoginTF = new javax.swing.JTextField();
        TelephoneLabel = new javax.swing.JLabel();
        TelephoneTF = new javax.swing.JTextField();
        PrenomLabel = new javax.swing.JLabel();
        PrenomTF = new javax.swing.JTextField();
        PassLabel = new javax.swing.JLabel();
        PassTF = new javax.swing.JPasswordField();
        NomLabel = new javax.swing.JLabel();
        NomTF = new javax.swing.JTextField();
        AdresseLabel = new javax.swing.JLabel();
        AdresseTF = new javax.swing.JTextField();
        PersonnelRB = new javax.swing.JRadioButton();
        ExternRB = new javax.swing.JRadioButton();
        OKButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Garage HEPL - Nouvel utilisateur");
        setName("adminCreationDialog"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        LoginLabel.setText("Login :");

        TelephoneLabel.setText("Téléphone :");

        PrenomLabel.setText("Prénom :");

        PassLabel.setText("Mot de passe :");

        NomLabel.setText("Nom :");

        AdresseLabel.setText("Adresse :");

        PersonnelRB.setSelected(true);
        PersonnelRB.setText("Personnel");
        PersonnelRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonnelRBActionPerformed(evt);
            }
        });

        ExternRB.setText("Exterieur");
        ExternRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExternRBActionPerformed(evt);
            }
        });

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Annuler");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PersonnelRB)
                            .addComponent(PassLabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OKButton)
                                .addGap(103, 103, 103)
                                .addComponent(CancelButton)
                                .addGap(407, 407, 407))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LoginTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ExternRB))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TelephoneLabel)
                                    .addComponent(NomLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TelephoneTF, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(NomTF))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AdresseLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(AdresseTF))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PrenomLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(PrenomTF, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LoginLabel)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginLabel)
                    .addComponent(LoginTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelephoneLabel)
                    .addComponent(PrenomLabel)
                    .addComponent(TelephoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrenomTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassLabel)
                    .addComponent(PassTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomLabel)
                    .addComponent(AdresseLabel)
                    .addComponent(NomTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdresseTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonnelRB)
                    .addComponent(ExternRB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OKButton)
                    .addComponent(CancelButton))
                .addGap(49, 49, 49))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PersonnelRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonnelRBActionPerformed
        if(ExternRB.isSelected())
        ExternRB.setSelected(false);
    }//GEN-LAST:event_PersonnelRBActionPerformed

    private void ExternRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExternRBActionPerformed
        if(PersonnelRB.isSelected())
        PersonnelRB.setSelected(false);
    }//GEN-LAST:event_ExternRBActionPerformed

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        if(PersonnelRB.isSelected())
        {
            if(LoginTF.getText().equals("") || PassTF.getText().equals("") || AdresseTF.getText().equals("") || TelephoneTF.getText().equals("") || NomTF.getText().equals("") || PrenomTF.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Certains champs ne sont pas remplis","Erreur",JOptionPane.ERROR_MESSAGE);
                return;
            }
            Employe tmp = new Employe(LoginTF.getText(), NomTF.getText(), PrenomTF.getText(), AdresseTF.getText(), TelephoneTF.getText(), LoginTF.getText() + new Random().nextInt(100));
            
            if(!dE.vPersonnel.isEmpty())
            {
                for(int i = 0;i<dE.vPersonnel.size();i++)
                {
                    if(dE.vPersonnel.get(i).getId().equals(LoginTF.getText()))
                    {
                        JOptionPane.showMessageDialog(null,"Duplicata détecté, échec création","Erreur",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                dE.vPersonnel.add(tmp);
                prop1.setProperty(LoginTF.getText(),PassTF.getText());
            }
            else
            {
                dE.vPersonnel.add(tmp);
                prop1.setProperty(LoginTF.getText(), PassTF.getText());
            }
            try
            {
                out1 = new FileOutputStream(dir+sep+"member.properties");
                prop1.store(out1, null);
                JOptionPane.showMessageDialog(null, "Compte ajoute", "Avertissement",JOptionPane.INFORMATION_MESSAGE);
                out1.close();
            }
            catch(IOException io)
            {
                io.printStackTrace();
            }
        }
        else
        {
            if(LoginTF.getText().equals("") || PassTF.getText().equals("") || AdresseTF.getText().equals("") || TelephoneTF.getText().equals("") || NomTF.getText().equals("") || PrenomTF.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Certains champs ne sont pas remplis","Erreur",JOptionPane.ERROR_MESSAGE);
                return;
            }
            TechnicienExterieur tmp2 = new TechnicienExterieur(LoginTF.getText(), NomTF.getText(), PrenomTF.getText(), AdresseTF.getText(), TelephoneTF.getText(),LoginTF.getText() + new Random().nextInt(100));
            if(!dE.vPersonnel.isEmpty())
            {
                for(int i = 0;i<dE.vPersonnel.size();i++)
                {
                    if(dE.vPersonnel.get(i).getId().equals(LoginTF.getText()))
                    {
                        JOptionPane.showMessageDialog(null,"Duplicata détecté, échec création","Erreur",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                dE.vPersonnel.add(tmp2);
                prop2.setProperty(LoginTF.getText(),PassTF.getText());
            }
            else
            {
                dE.vPersonnel.add(tmp2);
                prop2.setProperty(LoginTF.getText(), PassTF.getText());
            }
            try
            {
                out2 = new FileOutputStream(dir+sep+"extern.properties");
                prop2.store(out2, null);
                JOptionPane.showMessageDialog(null, "Compte ajoute", "Avertissement",JOptionPane.INFORMATION_MESSAGE);
                out2.close();
            }
            catch(IOException io)
            {
                io.printStackTrace();
            }
        }
    }//GEN-LAST:event_OKButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        try 
        {
            File dossierSave = new File(mainGarage.clientProperties.getProperty("dossier-save"));
            if(!dossierSave.exists())
            {
                dossierSave.mkdir();
            }
            File saveSerial = new File(mainGarage.clientProperties.getProperty("dossier-save")+System.getProperty("file.separator")+mainGarage.clientProperties.getProperty("fichier-save"));
            if(!saveSerial.exists())
            {
                FileOutputStream fos = new FileOutputStream(saveSerial);
                fos.close();
                applicationGestionForm.Log.write("C:\tFichier serialisation introuvable, creation d'un fichier vierge");
            }
            
                FileOutputStream fis = new FileOutputStream(mainGarage.clientProperties.getProperty("dossier-save")+System.getProperty("file.separator")+mainGarage.clientProperties.getProperty("fichier-save"));
                try {
                    ObjectOutputStream in = new ObjectOutputStream(fis);
                    in.writeObject(mainGarage.dE);
                    in.close();
                    applicationGestionForm.Log.write("C:\tFichier de serialisation mis a jour");
                }
                catch(EOFException ex) {
                    applicationGestionForm.Log.write("C:\tFichier de serialisation vierge");
                }
                fis.close();
            
            applicationGestionForm.Log.write("C:\tChargement serialisation reussi");
        }
        catch(IOException i) {
            i.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(AdminCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminCreation dialog = new AdminCreation(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel AdresseLabel;
    private javax.swing.JTextField AdresseTF;
    private javax.swing.JButton CancelButton;
    private javax.swing.JRadioButton ExternRB;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JTextField LoginTF;
    private javax.swing.JLabel NomLabel;
    private javax.swing.JTextField NomTF;
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JPasswordField PassTF;
    private javax.swing.JRadioButton PersonnelRB;
    private javax.swing.JLabel PrenomLabel;
    private javax.swing.JTextField PrenomTF;
    private javax.swing.JLabel TelephoneLabel;
    private javax.swing.JTextField TelephoneTF;
    // End of variables declaration//GEN-END:variables
}
