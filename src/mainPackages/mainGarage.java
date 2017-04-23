/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackages;

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

    public static Client cliTest1;
    public static Client cliTest2;
    public static Client cliTest3;

    public static Voiture voiTest1 ;
    public static Voiture voiTest2 ;
    public static Voiture voiTest3;
    
    
    public static void main(String[] args) {
        try
        {
            // TODO code application logic here
            System.out.print("TEST\n");
            loginForm loginWindows = new loginForm();
            loginWindows.setLocation(500, 400);
            loginWindows.setVisible(true);
            cliTest1 = new Client("1", "Paul", "Icier", "rue du cimetière 42", "0496100811");
            cliTest2 = new Client("2", "Toma", "Te", "rue des 100 dre", "0496100811");
            cliTest3 = new Client("3", "truc", "Bidule", "rue lle", "0496100811");

            voiTest1 = new Voiture("1", new TypeVoiture("Peugeot", "berline", 5), "1-NLU-134", cliTest1);
            voiTest2 = new Voiture("2", new TypeVoiture("Peugeot", "berline", 5), "1-NLU-134", cliTest1);
            voiTest3 = new Voiture("3", new TypeVoiture("Peugeot", "berline", 5), "1-NLU-134", cliTest1);

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
            System.out.print("Login reussi !");
            loginWindows.setVisible(false);

            applicationGestionForm formPrincipale = new applicationGestionForm();
            formPrincipale.setLocation(500, 400);
            formPrincipale.setVisible(true);
        }
        catch(Throwable e)
        {
            System.out.println("Error main garage !!!");
        }
    }
}
