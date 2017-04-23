/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackages;

import java.util.logging.Level;
import java.util.logging.Logger;
import people.Client;

/**
 *
 * @author ante
 */
public class mainGarage {

    /**
     */
    public static Client cliTest1 = new Client("1", "Paul", "Icier", "rue du cimetière 42", "0496100811");
    public static Client cliTest2 = new Client("2", "Toma", "Te", "rue du cimetière 42", "0496100811");
    public static Client cliTest3 = new Client("3", "truc", "Icier", "rue du cimetière 42", "0496100811");
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("TEST\n");
        loginForm loginWindows = new loginForm();
        loginWindows.setLocation(500, 400);
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
        System.out.print("Login reussi !");
        loginWindows.setVisible(false);
        
        applicationGestionForm formPrincipale = new applicationGestionForm();
        formPrincipale.setLocation(500, 400);
        formPrincipale.setVisible(true);
    }
    
}
