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
    public static String currentDir;
    public static String propertiesDir;
    
    public static Properties generalProperties = new Properties();
    public static Properties clientProperties = new Properties();
    
    public static void main(String[] args) {
        try
        {
            // TODO code application logic here
            //gestion properties
            currentDir = System.getProperty("user.dir");
            File fileProperties = new File(filePropertiesGeneral);
            if(!fileProperties.exists())
            {
                OutputStream ot = new FileOutputStream(filePropertiesGeneral);
                generalProperties.setProperty("dossier-properties", "Properties");
                generalProperties.setProperty("fichier-client-properties", "client.properties");
                generalProperties.setProperty("fichier-pneu-properties", "pneu.properties");
                generalProperties.setProperty("fichier-piece-properties", "piece.properties");
                generalProperties.setProperty("fichier-lubifiant-properties", "lubrifiant.properties");
                generalProperties.store(ot, null);
            }
            else
            {
                InputStream it = new FileInputStream(filePropertiesGeneral);
                generalProperties.load(it);
            }
            System.out.println("filePropertiesGeneral charger");
            
            File userdir = new File(currentDir);
            propertiesDir = generalProperties.getProperty("dossier-properties") + System.getProperty("file.separator");
            File dossierProperties = new File(generalProperties.getProperty("dossier-properties"));
            if(!dossierProperties.exists())
            {
                //dossier inexistant
                dossierProperties.mkdir();
            }
            
            File ClientfileProperties = new File(propertiesDir+generalProperties.getProperty("fichier-client-properties"));
            if(!ClientfileProperties.exists())
            {
                OutputStream ot = new FileOutputStream(propertiesDir+generalProperties.getProperty("fichier-client-properties"));
                clientProperties.setProperty("ip-client", "127.0.0.1");
                clientProperties.setProperty("port-client", "4000");
                clientProperties.setProperty("ip-server", "127.0.0.1");
                clientProperties.setProperty("port-pneu", "4001");
                clientProperties.setProperty("port-piece", "4002");
                clientProperties.setProperty("port-lubrifiant", "4003");
                clientProperties.store(ot, null);
            }
            else
            {
                InputStream it = new FileInputStream(propertiesDir+generalProperties.getProperty("fichier-client-properties"));
                clientProperties.load(it);
            }
            System.out.println("fichier-client-properties charger");
            
            

            loginForm loginWindows = new loginForm();
            if(loginWindows.noLogin == 1)
            {
                loginWindows.setVisible(false);
                while(loginWindows.noLogin != 0)
                {
                    try
                    {
                        Thread.sleep(10);
                    }
                    catch (InterruptedException ex) 
                    {
                        Logger.getLogger(mainGarage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                loginWindows.setVisible(true);
            }
            else
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
        catch(NullPointerException e)
        {
            System.out.println("ERREUR POINTEUR NULL");
        }
        catch(IOException e)
        {
            System.out.println("Error main garage !!!");
        }
    }
}
