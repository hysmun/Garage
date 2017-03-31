/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activite;

import people.Mecanicien;
import vehicules.Vehicule;

/**
 *
 * @author ante
 */
public class Entretien extends Travail{

    public Entretien() {
    }

    public Entretien(String id, Mecanicien meca, Vehicule vehi) {
        super(id, meca, vehi);
    }
    
}
