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
    
    public static LinkedList<Vector> linkedListVector = new LinkedList<Vector>();
    public static String[] listeProprio = {"Mr Paul Ice","Mme Marc Assin","Mr Tom Ate","Melle Sandy Kilo"};
    public static String[] listeTravailEntretien = {"Vidange","Pression des pneus","Pneu Hiver -> Ete","Pneu Ete -> Hiver"};
    public static String[] listeTravailReparation = {"Courroie","Transmission","Freins"};
    public static String libreString = "-- libre --";
    public static Vector<Vector> listeEnCours = new Vector<Vector>();
    
    public static LinkedList<Vector<Travail>> linkedListTravailTot = new LinkedList<Vector<Travail>>();
    public static Vector<Travail> listeRdv = new Vector<Travail>();
    public static Vector<Travail> listeEnCour = new Vector<Travail>();
    public static Vector<Travail> listeFini = new Vector<Travail>();
    
    
    public static String fileListe = "fileListe.save";
    public static String filePropertiesGeneral = "general.properties";
    
    public static Properties generalProperties = new Properties();
    
    public static void main(String[] args) {
        try
        {
            // TODO code application logic here
            
            FileInputStream input = new FileInputStream(filePropertiesGeneral);
            generalProperties.load(input);

            
            try {
               FileInputStream fileIn = new FileInputStream(fileListe);
               ObjectInputStream in = new ObjectInputStream(fileIn);
               linkedListTravailTot = (LinkedList<Vector<Travail>>) in.readObject();
               in.close();
               fileIn.close();
            }catch(IOException i) {
               i.printStackTrace();
            }catch(ClassNotFoundException c) {
               System.out.println("Employee class not found");
               c.printStackTrace();
            }
            
            System.out.println("TEST");
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
    
    static public String toString(int vectornum)
    {
        return linkedListVector.get(vectornum).get(0) + " " + linkedListVector.get(vectornum).get(1) + " " + linkedListVector.get(vectornum).get(2) + " " + linkedListVector.get(vectornum).get(3);
    }
}
