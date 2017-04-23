/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackages;

/**
 *
 * @author ante
 */
public class mainGarage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("TEST\n");
        loginForm loginWindows = new loginForm();
        loginWindows.setLocation(500, 400);
        loginWindows.setVisible(true);
        
        
        while(loginWindows.loginValue < 1)
        {
            //attente
        }
        System.out.print("Login reussi !");
        loginWindows.setVisible(false);
        
        applicationGestionForm formPrincipale = new applicationGestionForm();
        formPrincipale.setLocation(500, 400);
        formPrincipale.setVisible(true);
    }
    
}
