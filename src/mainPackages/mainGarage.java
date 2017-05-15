/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import testPackages.DataEncapsulate;

/**
 *
 * @author ante
 */
public class mainGarage {
    
    public static DataEncapsulate dE;
    
    public static String libreString = "-- libre --";
    
    public static String fileListe = "fileListe.save";
    public static String filePropertiesGeneral = "general.properties";
    
    public static Properties generalProperties = new Properties();
    
    public static void main(String[] args) {
        try
        {
            // TODO code application logic here
            //gestion properties
            String current = System.getProperty("user.dir");
            File fileProperties = new File(filePropertiesGeneral);
            if(!fileProperties.exists())
            {
                OutputStream ot = new FileOutputStream(filePropertiesGeneral);
                generalProperties.setProperty("dossier-properties", "Properties");
                generalProperties.setProperty("fichier-client-properties", "client.properties");
                generalProperties.setProperty("fichier-pneu-properties", "pneu.properties");
                generalProperties.setProperty("fichier-piece-properties", "piece.properties");
                generalProperties.setProperty("fichier-lubifiant-properties", "lubrifiant.properties");
            }
            else
            {
                InputStream it = new FileInputStream(filePropertiesGeneral);
                generalProperties.load(it);
            }

            loginForm loginWindows = new loginForm();
            loginWindows.setVisible(true);
            while(loginWindows.loginValue < 1)
            {
                try {
                    //attente
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(mainGarage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Login reussi !");
            loginWindows.setVisible(false);
            
            
            applicationGestionForm formPrincipale = new applicationGestionForm();
            formPrincipale.setVisible(true);
        }
        catch(IOException e)
        {
            System.out.println("Error main garage !!!");
        }
    }
}
