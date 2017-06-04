/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activite;

import java.io.Serializable;
import people.PersonnelGarage;
import vehicules.Vehicule;

/**
 *
 * @author ante
 */
public class Entretien extends Travail implements Serializable{

    public Entretien(String id, PersonnelGarage persogarage, Vehicule vehi, double prix, String description, int etat) {
        super(id, persogarage, vehi, prix, description, etat);
    }

    

}
