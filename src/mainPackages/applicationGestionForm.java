/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackages;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.Box;
import network.NetworkBasicClient;
import people.addClients;
import propertiescreation.AdminCreation;
import propertiescreation.PropertiesCreations;
import systemData.options;
import testPackages.DataEncapsulate;


/**
 *
 * @author ante
 */
public class applicationGestionForm extends javax.swing.JFrame{

    public static NetworkBasicClient serverPneu;
    public static NetworkBasicClient serverPiece;
    public static NetworkBasicClient serverLubrifiant; 
    public static FichierLog Log;
    /**
     * Creates new form applicationGestionForm
     */
    public applicationGestionForm() {
        
        Log = new FichierLog();
        Log.init();
        Log.write("Lancement application");
        try
        {
           initComponents();
            threadDate thDate = new threadDate();
            thDate.start();
            serverPneu = new NetworkBasicClient(mainGarage.clientProperties.getProperty("ip-server"), Integer.parseInt(mainGarage.clientProperties.getProperty("port-pneu")));
            serverPiece = new NetworkBasicClient(mainGarage.clientProperties.getProperty("ip-server"), Integer.parseInt(mainGarage.clientProperties.getProperty("port-piece")));
            serverLubrifiant = new NetworkBasicClient(mainGarage.clientProperties.getProperty("ip-server"), Integer.parseInt(mainGarage.clientProperties.getProperty("port-lubrifiant")));
            if(mainGarage.dE.travailPont1 != null)
                appGestionPresencePont1Label.setText(mainGarage.dE.travailPont1.toString());
            if(mainGarage.dE.travailPont2 != null)
                appGestionPresencePont2Label.setText(mainGarage.dE.travailPont2.toString());
            if(mainGarage.dE.travailPont3 != null)
                appGestionPresencePont3Label.setText(mainGarage.dE.travailPont3.toString());
            if(mainGarage.dE.travailSol != null)
                appGestionPresenceSolLabel.setText(mainGarage.dE.travailSol.toString());
        }
        catch(Exception e)
        {
            System.out.println("C:\t Erreur const gestion form :"+e.getMessage());
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
        commanderMenu = new javax.swing.JMenu();
        pieceCommand = new javax.swing.JMenuItem();
        pneuCommand = new javax.swing.JMenuItem();
        lubrifiantCommand = new javax.swing.JMenuItem();
        receptionItem = new javax.swing.JMenuItem();
        listeCommandeItem = new javax.swing.JMenuItem();
        appGestionClientsMenu = new javax.swing.JMenu();
        ajoutClientItem = new javax.swing.JMenuItem();
        listClientItem = new javax.swing.JMenuItem();
        appGestionFacturesMenu = new javax.swing.JMenu();
        appGestionAdminMenu = new javax.swing.JMenu();
        ajoutAdminItem = new javax.swing.JMenuItem();
        appGestionParamMenu = new javax.swing.JMenu();
        appGestionInfoSysItem = new javax.swing.JMenuItem();
        appGestionAideMenu = new javax.swing.JMenu();
        appGestionDebuterItem = new javax.swing.JMenuItem();
        appGestionProposDeItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Garage HEPL - la polyclinique de vos voitures");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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
            .addGap(0, 404, Short.MAX_VALUE)
        );
        appGestionImagePanelLayout.setVerticalGroup(
            appGestionImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        appGestionPresencePont1Label.setBackground(new java.awt.Color(255, 255, 0));
        appGestionPresencePont1Label.setText("-- libre --");
        appGestionPresencePont1Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        appGestionPresencePont2Label.setText("-- libre --");
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
        appGestionPriseItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                appGestionPriseItemMousePressed(evt);
            }
        });
        appGestionAtelierMenu.add(appGestionPriseItem);

        appGestionTerminerItem.setText("Terminé");
        appGestionTerminerItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                appGestionTerminerItemMousePressed(evt);
            }
        });
        appGestionAtelierMenu.add(appGestionTerminerItem);

        appGestionListesItem.setText("Listes");
        appGestionListesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appGestionListesItemActionPerformed(evt);
            }
        });
        appGestionAtelierMenu.add(appGestionListesItem);

        appGestionMenuBar.add(appGestionAtelierMenu);

        appGestionMaterielMenu.setText("Matériel");

        commanderMenu.setText("Commander ");

        pieceCommand.setText("Commander une pièce");
        pieceCommand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieceCommandActionPerformed(evt);
            }
        });
        commanderMenu.add(pieceCommand);

        pneuCommand.setText("Commander des pneus");
        pneuCommand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pneuCommandActionPerformed(evt);
            }
        });
        commanderMenu.add(pneuCommand);

        lubrifiantCommand.setText("Commander un lubrifiant");
        lubrifiantCommand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lubrifiantCommandActionPerformed(evt);
            }
        });
        commanderMenu.add(lubrifiantCommand);

        appGestionMaterielMenu.add(commanderMenu);

        receptionItem.setText("Réceptionner");
        receptionItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receptionItemActionPerformed(evt);
            }
        });
        appGestionMaterielMenu.add(receptionItem);

        listeCommandeItem.setText("Liste commandes");
        listeCommandeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeCommandeItemActionPerformed(evt);
            }
        });
        appGestionMaterielMenu.add(listeCommandeItem);

        appGestionMenuBar.add(appGestionMaterielMenu);

        appGestionClientsMenu.setText("Clients");

        ajoutClientItem.setText("Ajouter Client");
        ajoutClientItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutClientItemActionPerformed(evt);
            }
        });
        appGestionClientsMenu.add(ajoutClientItem);

        listClientItem.setText("Listes Client");
        listClientItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listClientItemActionPerformed(evt);
            }
        });
        appGestionClientsMenu.add(listClientItem);

        appGestionMenuBar.add(appGestionClientsMenu);

        appGestionFacturesMenu.setText("Factures");
        appGestionMenuBar.add(appGestionFacturesMenu);

        appGestionAdminMenu.setText("Administration");

        ajoutAdminItem.setText("Ajouter compte utilisateur");
        ajoutAdminItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ajoutAdminItemMousePressed(evt);
            }
        });
        appGestionAdminMenu.add(ajoutAdminItem);

        appGestionMenuBar.add(appGestionAdminMenu);

        appGestionParamMenu.setText("Paramètres");
        appGestionParamMenu.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        appGestionInfoSysItem.setText("Infos système");
        appGestionInfoSysItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appGestionInfoSysItemActionPerformed(evt);
            }
        });
        appGestionParamMenu.add(appGestionInfoSysItem);

        appGestionMenuBar.add(Box.createHorizontalGlue());
        appGestionMenuBar.add(appGestionParamMenu);

        appGestionAideMenu.setText("Aide");

        appGestionDebuterItem.setText("Pour débuter");
        appGestionAideMenu.add(appGestionDebuterItem);

        appGestionProposDeItem.setText("A propos de ...");
        appGestionProposDeItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                appGestionProposDeItemMousePressed(evt);
            }
        });
        appGestionAideMenu.add(appGestionProposDeItem);

        appGestionMenuBar.add(appGestionAideMenu);

        setJMenuBar(appGestionMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(appGestionPont2label)
                                    .addComponent(appGestionPont1Label)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(appGestionPont3label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(appGestionSolLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(appGestionDiversLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(appGestionAtelierLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(appGestionPresenceSolLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                                    .addComponent(appGestionPresencePont3Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(appGestionPresencePont2Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(appGestionPresencePont1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(appGestionPresenceDiversLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(appGestionBureauComptaLabel)
                                            .addComponent(appGestionBureauClientLabel))
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(appGestionComptaPresenceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                                            .addComponent(appGestionPresenceBureauLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(appGestionBureauLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(appGestionPatronCheckBox)
                                    .addComponent(appGestionPauseCheckBox))
                                .addGap(118, 118, 118)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(appGestionCertAbsRadBut)
                                    .addComponent(appGestionToutPresentRadBut)))
                            .addComponent(appGestionImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(appGestionDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appGestionBureauComptaLabel)
                    .addComponent(appGestionComptaPresenceLabel)
                    .addComponent(appGestionCertAbsRadBut)
                    .addComponent(appGestionPauseCheckBox))
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
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

    private void appGestionPriseItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appGestionPriseItemMousePressed
        priseEnChargeForm enChargeForm = new priseEnChargeForm();
        enChargeForm.setVisible(true);
    }//GEN-LAST:event_appGestionPriseItemMousePressed

    private void appGestionTerminerItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appGestionTerminerItemMousePressed
        TermineForm termineForm = new TermineForm();
        termineForm.setVisible(true);
    }//GEN-LAST:event_appGestionTerminerItemMousePressed

    private void appGestionProposDeItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appGestionProposDeItemMousePressed
        // TODO add your handling code here:
        aProposForm apropos = new aProposForm();
        apropos.setVisible(true);
    }//GEN-LAST:event_appGestionProposDeItemMousePressed

    private void pneuCommandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pneuCommandActionPerformed
        // TODO add your handling code here:
        commandeForm cf = new commandeForm(this, true,commandeForm.PNEU);
        cf.setVisible(true);
        System.out.println("C: fin commande");
    }//GEN-LAST:event_pneuCommandActionPerformed

    private void lubrifiantCommandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lubrifiantCommandActionPerformed
        // TODO add your handling code here:
        commandeForm cf = new commandeForm(this, true,commandeForm.LUBRIFIANT);
        cf.setVisible(true);
        System.out.println("C: fin commande");
    }//GEN-LAST:event_lubrifiantCommandActionPerformed

    private void pieceCommandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieceCommandActionPerformed
        // TODO add your handling code here:
        commandeForm cf = new commandeForm(this, true,commandeForm.PIECE);
        cf.setVisible(true);
        System.out.println("C: fin commande");
    }//GEN-LAST:event_pieceCommandActionPerformed

    private void receptionItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receptionItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receptionItemActionPerformed

    private void listeCommandeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeCommandeItemActionPerformed
        // TODO add your handling code here:
        ListeCommandForm lcf = new ListeCommandForm(this, true);
        lcf.setVisible(true);
        
    }//GEN-LAST:event_listeCommandeItemActionPerformed

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
                System.out.println("C:\tFichier serialisation introuvable, creation d'un fichier vierge");
            }
            
            FileOutputStream fis = new FileOutputStream(mainGarage.clientProperties.getProperty("dossier-save")+System.getProperty("file.separator")+mainGarage.clientProperties.getProperty("fichier-save"));
            try {
                ObjectOutputStream in = new ObjectOutputStream(fis);
                in.writeObject(mainGarage.dE);
                in.close();
            }
            catch(EOFException ex) {
                System.out.println("C:\tFichier de serialisation vierge");
            }
            fis.close();
            System.out.println("C:\tSauvegarde effectuée");
            Log.close();
        }
        catch(IOException i) {
            i.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing

    private void appGestionListesItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appGestionListesItemActionPerformed
        // TODO add your handling code here:
        ListTravailForm ltf = new ListTravailForm(this, true);
        ltf.setVisible(true);
    }//GEN-LAST:event_appGestionListesItemActionPerformed

    private void ajoutClientItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutClientItemActionPerformed
        // TODO add your handling code here:
        addClients ac = new addClients(this, true);
        ac.setVisible(true);
    }//GEN-LAST:event_ajoutClientItemActionPerformed

    private void listClientItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listClientItemActionPerformed
        // TODO add your handling code here:
        ListClientForm lcf = new ListClientForm(this, true);
        lcf.setVisible(true);
    }//GEN-LAST:event_listClientItemActionPerformed

    private void ajoutAdminItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajoutAdminItemMousePressed
        // TODO add your handling code here:
        AdminCreation ac = new AdminCreation(this,true);
        ac.setVisible(true);
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
                System.out.println("C:\tFichier serialisation introuvable, creation d'un fichier vierge");
            }
            
            FileOutputStream fis = new FileOutputStream(mainGarage.clientProperties.getProperty("dossier-save")+System.getProperty("file.separator")+mainGarage.clientProperties.getProperty("fichier-save"));
            try {
                ObjectOutputStream in = new ObjectOutputStream(fis);
                in.writeObject(mainGarage.dE);
                in.close();
            }
            catch(EOFException ex) {
                System.out.println("C:\tFichier de serialisation vierge");
            }
            fis.close();
            System.out.println("C:\tSauvegarde effectuée");
        }
        catch(IOException i) {
            i.printStackTrace();
        }
    }//GEN-LAST:event_ajoutAdminItemMousePressed

    private void appGestionInfoSysItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appGestionInfoSysItemActionPerformed
        // TODO add your handling code here:
        options opt = new options(this,true);
        opt.setVisible(true);
    }//GEN-LAST:event_appGestionInfoSysItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
    private javax.swing.JMenuItem ajoutAdminItem;
    private javax.swing.JMenuItem ajoutClientItem;
    private javax.swing.JMenuItem appGestionAPrevoirItem;
    private javax.swing.JMenu appGestionAdminMenu;
    private javax.swing.JMenu appGestionAideMenu;
    private javax.swing.JLabel appGestionAtelierLabel;
    private javax.swing.JMenu appGestionAtelierMenu;
    private javax.swing.JLabel appGestionBureauClientLabel;
    private javax.swing.JLabel appGestionBureauComptaLabel;
    private javax.swing.JLabel appGestionBureauLabel;
    private javax.swing.JRadioButton appGestionCertAbsRadBut;
    private javax.swing.JMenu appGestionClientsMenu;
    private javax.swing.JLabel appGestionComptaPresenceLabel;
    public static javax.swing.JLabel appGestionDateLabel;
    private javax.swing.JMenuItem appGestionDebuterItem;
    private javax.swing.JLabel appGestionDiversLabel;
    private javax.swing.JMenu appGestionFacturesMenu;
    private javax.swing.JPanel appGestionImagePanel;
    private javax.swing.JMenuItem appGestionInfoSysItem;
    private javax.swing.JMenuItem appGestionListesItem;
    private javax.swing.JMenu appGestionMaterielMenu;
    private javax.swing.JMenuBar appGestionMenuBar;
    private javax.swing.JMenu appGestionParamMenu;
    private javax.swing.JCheckBox appGestionPatronCheckBox;
    private javax.swing.JCheckBox appGestionPauseCheckBox;
    private javax.swing.JLabel appGestionPont1Label;
    private javax.swing.JLabel appGestionPont2label;
    private javax.swing.JLabel appGestionPont3label;
    public static javax.swing.JLabel appGestionPresenceBureauLabel;
    public static javax.swing.JLabel appGestionPresenceDiversLabel;
    public static javax.swing.JLabel appGestionPresencePont1Label;
    public static javax.swing.JLabel appGestionPresencePont2Label;
    public static javax.swing.JLabel appGestionPresencePont3Label;
    public static javax.swing.JLabel appGestionPresenceSolLabel;
    private javax.swing.JMenuItem appGestionPriseItem;
    private javax.swing.JMenuItem appGestionProposDeItem;
    private javax.swing.JLabel appGestionSolLabel;
    private javax.swing.JMenuItem appGestionTerminerItem;
    private javax.swing.JRadioButton appGestionToutPresentRadBut;
    private javax.swing.JMenu commanderMenu;
    private javax.swing.JMenuItem listClientItem;
    private javax.swing.JMenuItem listeCommandeItem;
    private javax.swing.JMenuItem lubrifiantCommand;
    private javax.swing.JMenuItem pieceCommand;
    private javax.swing.JMenuItem pneuCommand;
    private javax.swing.JMenuItem receptionItem;
    // End of variables declaration//GEN-END:variables
}
