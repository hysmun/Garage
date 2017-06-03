/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import login.hashtableLogin;
import propertiescreation.PropertiesCreations;

public class loginForm extends javax.swing.JFrame {

    private hashtableLogin hashtables;
    
    /*
    -1 erreur mdp
    0 pas login
    1 login correct Membre
    2 login correct Exterieur
    */
    public int loginValue=0;
    
    //0 = on peut se log (car fichiers existants) | 1 = pas de comptes trouvé (les fichiers doivent être créé et rempli)
    static public int noLogin=0;
    
    public loginForm() {
        initComponents();
        String sep = System.getProperty("file.separator");
        String current = System.getProperty("user.dir");
        File fi = new File("accounts");
        if(!fi.exists())
        {
            noLogin = 1;
            JOptionPane.showMessageDialog(null,"Aucuns comptes trouvés, ouverture de l'outil de création de comptes","Erreur",JOptionPane.ERROR_MESSAGE);
            PropertiesCreations pc = new PropertiesCreations();
            pc.setVisible(true);
            this.setVisible(false);
            while(pc.is)
        }
        else
        {
            try
            {
                FileInputStream members = new FileInputStream(current + sep + "accounts" + sep + "member.properties");
                FileInputStream externs = new FileInputStream(current + sep + "accounts" + sep + "extern.properties");
            }
            catch(IOException io)
            {
                io.printStackTrace();
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    /*
    @SuppressWarnings("unchecked")*/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UtilisateurLabelLoginForm = new javax.swing.JLabel();
        UtilisateurTextFieldLoginForm = new javax.swing.JTextField();
        MdpLabelLoginForm = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        MembreRadioLoginForm = new javax.swing.JRadioButton();
        ExterieurRadioLoginForm = new javax.swing.JRadioButton();
        OkButtonLoginForm = new javax.swing.JButton();
        AnnulerButtonLoginForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Garage HEPL - Authentification d'un utilisateur");
        setName("loginFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 200));
        getContentPane().setLayout(new java.awt.GridLayout(4, 2, 5, 5));

        UtilisateurLabelLoginForm.setText("Utilisateur :");
        UtilisateurLabelLoginForm.setName("UtilisateurLabel"); // NOI18N
        getContentPane().add(UtilisateurLabelLoginForm);
        getContentPane().add(UtilisateurTextFieldLoginForm);

        MdpLabelLoginForm.setText("Mot de passe :");
        getContentPane().add(MdpLabelLoginForm);
        getContentPane().add(PasswordField);

        MembreRadioLoginForm.setSelected(true);
        MembreRadioLoginForm.setText("Membre du personnel");
        MembreRadioLoginForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MembreRadioLoginFormMouseClicked(evt);
            }
        });
        getContentPane().add(MembreRadioLoginForm);

        ExterieurRadioLoginForm.setText("Exterieur habilité");
        ExterieurRadioLoginForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExterieurRadioLoginFormMouseClicked(evt);
            }
        });
        getContentPane().add(ExterieurRadioLoginForm);

        OkButtonLoginForm.setText("Ok");
        OkButtonLoginForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OkButtonLoginFormMouseClicked(evt);
            }
        });
        getContentPane().add(OkButtonLoginForm);

        AnnulerButtonLoginForm.setText("Annuler");
        AnnulerButtonLoginForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnnulerButtonLoginFormMouseClicked(evt);
            }
        });
        getContentPane().add(AnnulerButtonLoginForm);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExterieurRadioLoginFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExterieurRadioLoginFormMouseClicked
        // TODO add your handling code here:
        ExterieurRadioLoginForm.setSelected(true);
        MembreRadioLoginForm.setSelected(false);
    }//GEN-LAST:event_ExterieurRadioLoginFormMouseClicked

    private void MembreRadioLoginFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MembreRadioLoginFormMouseClicked
        MembreRadioLoginForm.setSelected(true);
        ExterieurRadioLoginForm.setSelected(false);
    }//GEN-LAST:event_MembreRadioLoginFormMouseClicked

    private void AnnulerButtonLoginFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnnulerButtonLoginFormMouseClicked
        System.exit(0);
    }//GEN-LAST:event_AnnulerButtonLoginFormMouseClicked

    private void OkButtonLoginFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkButtonLoginFormMouseClicked
        if(MembreRadioLoginForm.isSelected() == true)
        {
            if(hashtables.getLoginMembreTable().get(UtilisateurTextFieldLoginForm.getText()) == null)
            {
                System.out.println("Membre inexistant");
                if(hashtables.getLoginExternTable().get(UtilisateurTextFieldLoginForm.getText()) == null)
                {
                    System.out.println("Inconnu, fermeture applic");
                    System.exit(0);
                }
                else if(hashtables.getLoginExternTable().get(UtilisateurTextFieldLoginForm.getText()).equals(PasswordField.getText()))
                {
                    System.out.println("Mauvais choix de login, redirection");
                    JOptionPane.showMessageDialog(null,"Choix incorrect, vous allez etre redirige vers votre section","Avertissement",JOptionPane.WARNING_MESSAGE);
                    // Login applic exterieur
                    loginValue = 2;
                }
                else
                {
                    System.out.println("Mot de passe errone, autre tentative");
                    JOptionPane.showMessageDialog(null,"Erreur mot de passe","Avertissement",JOptionPane.WARNING_MESSAGE);
                    // Clean
                    UtilisateurTextFieldLoginForm.setText("");
                    PasswordField.setText("");
                }
            }
            else
            {
                System.out.println("Membre existant, verification");
                if(hashtables.getLoginMembreTable().get(UtilisateurTextFieldLoginForm.getText()).equals(PasswordField.getText()))
                {
                    System.out.println("Acces a l'applic");
                    // Login applic
                    loginValue = 1;
                }
                else
                {
                    System.out.println("Mot de passe errone, autre tentative");
                    JOptionPane.showMessageDialog(null,"Erreur mot de passe","Avertissement",JOptionPane.WARNING_MESSAGE);
                    // Clean
                    UtilisateurTextFieldLoginForm.setText("");
                    PasswordField.setText("");
                    
                }
            }
        }
        else if(ExterieurRadioLoginForm.isSelected() == true)
        {
            if(hashtables.getLoginExternTable().get(UtilisateurTextFieldLoginForm.getText()) == null)
            {
                System.out.println("Membre inexistant");
                if(hashtables.getLoginMembreTable().get(UtilisateurTextFieldLoginForm.getText()) == null)
                {
                    System.out.println("Inconnu, fermeture applic");
                    System.exit(0);
                }
                else if(hashtables.getLoginMembreTable().get(UtilisateurTextFieldLoginForm.getText()).equals(PasswordField.getText()))
                {
                    System.out.println("Mauvais choix de login, redirection");
                    JOptionPane.showMessageDialog(null,"Choix incorrect, vous allez etre redirige vers votre section","Avertissement",JOptionPane.WARNING_MESSAGE);
                    // Login applic exterieur
                    loginValue = 2;
                }
                else
                {
                    System.out.println("Mot de passe errone, autre tentative");
                    JOptionPane.showMessageDialog(null,"Erreur mot de passe","Avertissement",JOptionPane.WARNING_MESSAGE);
                    // Clean
                    UtilisateurTextFieldLoginForm.setText("");
                    PasswordField.setText("");
                }
            }
            else
            {
                System.out.println("Membre existant, verification");
                if(hashtables.getLoginExternTable().get(UtilisateurTextFieldLoginForm.getText()).equals(PasswordField.getText()))
                {
                    System.out.println("Acces a l'applic");
                    // Login applic
                    loginValue = 1;
                }
                else
                {
                    System.out.println("Mot de passe errone, autre tentative");
                    JOptionPane.showMessageDialog(null,"Erreur mot de passe","Avertissement",JOptionPane.WARNING_MESSAGE);
                    // Clean
                    UtilisateurTextFieldLoginForm.setText("");
                    PasswordField.setText("");
                }
            }
        }
    }//GEN-LAST:event_OkButtonLoginFormMouseClicked

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new loginForm().setVisible(true);
                                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnnulerButtonLoginForm;
    private javax.swing.JRadioButton ExterieurRadioLoginForm;
    private javax.swing.JLabel MdpLabelLoginForm;
    private javax.swing.JRadioButton MembreRadioLoginForm;
    private javax.swing.JButton OkButtonLoginForm;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel UtilisateurLabelLoginForm;
    private javax.swing.JTextField UtilisateurTextFieldLoginForm;
    // End of variables declaration//GEN-END:variables
}
