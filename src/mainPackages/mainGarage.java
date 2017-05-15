/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackages;

import activite.Travail;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ante
 */
public class mainGarage {
    
    public static String libreString = "-- libre --";
    
    public static String fileListe = "fileListe.save";
    public static String filePropertiesGeneral = "general.properties";
    
    public static Properties generalProperties = new Properties();
    
    public static void main(String[] args) {
        try
        {
            // TODO code application logic here
            
            FileInputStream input = new FileInputStream(filePropertiesGeneral);
            generalProperties.load(input);

            loginForm loginWindows = new loginForm();
            loginWindows.setVisible(true);
            while(loginWindows.loginValue < 1)
            {
                try {
                    //attente
                    //System.out.print("t\n");
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
