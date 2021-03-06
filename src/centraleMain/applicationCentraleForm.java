/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centraleMain;

import centraleObj.CentraleCommand;
import java.awt.BorderLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import network.NetworkBasicServer;

/**
 *
 * @author ante
 */
public class applicationCentraleForm extends javax.swing.JFrame {

    /**
     * Creates new form applicationCentraleForm
     */
    public static final int PNEU = 0;
    public static final int PIECE = 1;
    public static final int LUBRIFIANT = 2;
    public static String filePropertiesGeneral = "general.properties";
    
    public int typeApp;
    public static Properties generalProperties = new Properties();
    public String serveurPropFile;
    public Properties serveurProperties = new Properties();
    public static String currentDir;
    public static String propertiesDir;
    public NetworkBasicServer netServer;
    
    public CentraleCommand commandeEnCours;
    
    public applicationCentraleForm() {
        initComponents();
        typeApp = -1;
    }
    public applicationCentraleForm(int type) {
        try
        {
           initComponents();
            typeApp = type;

             // <editor-fold defaultstate="collapsed" desc="properties serveur">
            currentDir = System.getProperty("user.dir");
            File fileProperties = new File(filePropertiesGeneral);
            if(!fileProperties.exists())
            {
                OutputStream ot = new FileOutputStream(filePropertiesGeneral);
                generalProperties.setProperty("dossier-properties", "properties");
                generalProperties.setProperty("fichier-client-properties", "client.properties");
                generalProperties.setProperty("fichier-pneu-properties", "pneu.properties");
                generalProperties.setProperty("fichier-piece-properties", "piece.properties");
                generalProperties.setProperty("fichier-lubrifiant-properties", "lubrifiant.properties");
                generalProperties.store(ot, null);
            }
            else
            {
                InputStream it = new FileInputStream(filePropertiesGeneral);
                generalProperties.load(it);
            }
            System.out.println("S: filePropertiesGeneral charger");
            
            
            File userdir = new File(currentDir);
            propertiesDir = generalProperties.getProperty("dossier-properties") + System.getProperty("file.separator");
            File dossierProperties = new File(generalProperties.getProperty("dossier-properties"));
            if(!dossierProperties.exists())
            {
                //dossier inexistant
                dossierProperties.mkdir();
            }
            
            
            switch(typeApp)
            {
                case PNEU://PNEU
                    serveurPropFile = generalProperties.getProperty("fichier-pneu-properties");
                    break;
                case PIECE://PIECE
                    serveurPropFile = generalProperties.getProperty("fichier-piece-properties");
                    break;
                case LUBRIFIANT://LUBRIFIANT
                    serveurPropFile = generalProperties.getProperty("fichier-lubrifiant-properties");
                    break;
                default:
            }
            File serveurfileProperties = new File(propertiesDir+serveurPropFile);
            if(!serveurfileProperties.exists())
            {
                OutputStream ot = new FileOutputStream(propertiesDir+serveurPropFile);
                serveurProperties.setProperty("ip-server", "127.0.0.1");
                serveurProperties.setProperty("port", ""+(4001+typeApp));
                switch(typeApp)
                {
                    case PNEU://PNEU
                        serveurProperties.setProperty("image","Pneus.png");
                        break;
                    case PIECE://PIECE
                        serveurProperties.setProperty("image","Pieces.png");
                        break;
                    case LUBRIFIANT://LUBRIFIANT
                        serveurProperties.setProperty("image","Lubrifiants.png");
                        break;
                    default:
                }
                serveurProperties.store(ot, null);
            }
            else
            {
                InputStream it = new FileInputStream(propertiesDir+serveurPropFile);
                serveurProperties.load(it);
            }
            System.out.println("S: "+ serveurPropFile+" charger");
            // </editor-fold> 
            
            switch(typeApp)
            {
                case PNEU://PNEU
                    this.setTitle(this.getTitle()+ " PNEUS");
                    break;
                case PIECE://PIECE
                    this.setTitle(this.getTitle()+ " PIECES");
                    break;
                case LUBRIFIANT://LUBRIFIANT
                    this.setTitle(this.getTitle()+ " LUBRIFIANT");
                    break;
                default:
            }
            //chargement image
            JLabel image = new JLabel( new ImageIcon(serveurProperties.getProperty("image")));
            imagePanel.setLayout(new BorderLayout());
            imagePanel.add(image, BorderLayout.CENTER);
            
            //network
            netServer = new NetworkBasicServer(Integer.parseInt(serveurProperties.getProperty("port")),messageEntrantCheckBox);
            
        }
        catch(IOException e)
        {
            System.out.println("S: Error serveur init "+e.getMessage());
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

        messageEntrantCheckBox = new javax.swing.JCheckBox();
        currentCommandLabel = new javax.swing.JLabel();
        lireButton = new javax.swing.JButton();
        commandComboBox = new javax.swing.JComboBox<>();
        messageLabel = new javax.swing.JLabel();
        detailCommandLabel = new javax.swing.JLabel();
        commandPanel = new javax.swing.JScrollPane();
        commandTable = new javax.swing.JTable();
        imagePanel = new javax.swing.JPanel();
        verifButton = new javax.swing.JButton();
        disponibiliteButton = new javax.swing.JRadioButton();
        notDispoButton = new javax.swing.JRadioButton();
        reponseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Centrale achat -");

        messageEntrantCheckBox.setText("Message Entrant");

        currentCommandLabel.setText("Commande en cours");

        lireButton.setBorder(null);
        lireButton.setLabel("Lire");
        lireButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lireButtonActionPerformed(evt);
            }
        });

        messageLabel.setText(">>");
        messageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        detailCommandLabel.setText("Détails de la commande");

        commandTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Caracteristique", "Valeur"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        commandPanel.setViewportView(commandTable);

        imagePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        verifButton.setText("vérification de la commande");
        verifButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifButtonActionPerformed(evt);
            }
        });

        disponibiliteButton.setText("disponible");
        disponibiliteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disponibiliteButtonActionPerformed(evt);
            }
        });

        notDispoButton.setSelected(true);
        notDispoButton.setText("non disponible");
        notDispoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notDispoButtonActionPerformed(evt);
            }
        });

        reponseButton.setText("Envoyer réponse");
        reponseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reponseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(detailCommandLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(commandPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(messageEntrantCheckBox)
                            .addComponent(lireButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currentCommandLabel)
                            .addComponent(commandComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(verifButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(reponseButton)
                                .addGap(345, 345, 345))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(disponibiliteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(notDispoButton)
                                .addGap(108, 108, 108))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currentCommandLabel)
                            .addComponent(messageEntrantCheckBox))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(commandComboBox)
                            .addComponent(lireButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(messageLabel)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailCommandLabel)
                    .addComponent(commandPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verifButton)
                    .addComponent(disponibiliteButton)
                    .addComponent(notDispoButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(reponseButton)
                .addGap(34, 34, 34))
        );

        messageEntrantCheckBox.getAccessibleContext().setAccessibleName("msgEntrantButton");
        currentCommandLabel.getAccessibleContext().setAccessibleName("currentCommandLabel");
        lireButton.getAccessibleContext().setAccessibleName("lireButton");
        commandComboBox.getAccessibleContext().setAccessibleName("commandeComboBox");
        messageLabel.getAccessibleContext().setAccessibleName("messageEntrantLabel");
        detailCommandLabel.getAccessibleContext().setAccessibleName("detailCommandLabel");
        imagePanel.getAccessibleContext().setAccessibleName("imagePanel");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void disponibiliteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disponibiliteButtonActionPerformed
        // TODO add your handling code here:
        notDispoButton.setSelected(false);
        commandeEnCours.setDisponibilite(true);
    }//GEN-LAST:event_disponibiliteButtonActionPerformed

    private void notDispoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notDispoButtonActionPerformed
        // TODO add your handling code here:
        disponibiliteButton.setSelected(false);
        commandeEnCours.setDisponibilite(false);
    }//GEN-LAST:event_notDispoButtonActionPerformed

    private void reponseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reponseButtonActionPerformed
        // TODO add your handling code here:
        try
        {
            netServer.sendMessage(commandeEnCours.toStringForSend());
            commandeEnCours = null;
        }
        catch(Exception e)
        {
            System.out.println("S:\t lors de renvois : " + e.getMessage());
        }
    }//GEN-LAST:event_reponseButtonActionPerformed

    private void verifButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verifButtonActionPerformed

    private void lireButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lireButtonActionPerformed
        // TODO add your handling code here:
        commandeEnCours = new CentraleCommand(netServer.getMessage());
        messageLabel.setText(commandeEnCours.toString());
    }//GEN-LAST:event_lireButtonActionPerformed

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
            java.util.logging.Logger.getLogger(applicationCentraleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(applicationCentraleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(applicationCentraleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(applicationCentraleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new applicationCentraleForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> commandComboBox;
    private javax.swing.JScrollPane commandPanel;
    public javax.swing.JTable commandTable;
    private javax.swing.JLabel currentCommandLabel;
    private javax.swing.JLabel detailCommandLabel;
    private javax.swing.JRadioButton disponibiliteButton;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JButton lireButton;
    private javax.swing.JCheckBox messageEntrantCheckBox;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JRadioButton notDispoButton;
    private javax.swing.JButton reponseButton;
    private javax.swing.JButton verifButton;
    // End of variables declaration//GEN-END:variables
}
