/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackages;

import java.util.LinkedList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import people.Client;
import vehicules.TypeVoiture;
import vehicules.Voiture;
import vehicules.*;

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
    
    
    public static void main(String[] args) {
        try
        {
            // TODO code application logic here
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
        catch(Throwable e)
        {
            System.out.println("Error main garage !!!");
        }
    }
    
    static public String toString(int vectornum)
    {
        return linkedListVector.get(vectornum).get(0) + " " + linkedListVector.get(vectornum).get(1) + " " + linkedListVector.get(vectornum).get(2) + " " + linkedListVector.get(vectornum).get(3);
    }
}
