/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import static java.lang.Integer.valueOf;
import java.util.Vector;
import vehicules.*;
import People.*;
import Activite.*;
import ExceptionGarage.*;
/**
 *
 * @author ante
 */
public class TestVehicules {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            // TODO code application logic here
            Voiture[] vVehicule;
            vVehicule = new Voiture[5];
            vVehicule[0] = new Voiture(new TypeVoiture("Reneau", "Megane", 4), new Client());
            vVehicule[1] = new Voiture(new TypeVoiture("Citroen", "Berlingo", 4), new Client());
            vVehicule[2] = new Voiture(new TypeVoiture("Volvo", "Megane", 4), new Client());
            vVehicule[3] = new Voiture(new TypeVoiture("Porsche", "911", 4), new Client());
            vVehicule[4] = new Voiture(new TypeVoiture("Lotus", "elise", 4), new Client());
            for(int i = 0; i< 5; i++)
            {
                //args[i] = "1";
                System.out.println("Voiture " + i + " en "+ args[i]+ " exemplaire " + vVehicule[i].toString() );
            }
        }
        catch(MissingTradeMarkException e)
        {
            
        }
    }
    
}
