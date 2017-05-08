/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activite;

import java.io.Serializable;
import people.Mecanicien;
import vehicules.Vehicule;

/**
 *
 * @author ante
 */
public class Entretien extends Travail implements Serializable{

    public Entretien(String id, Mecanicien meca, Vehicule vehi, double prix, String description, int etat) {
        super(id, meca, vehi, prix, description, etat);
    }

    

}
