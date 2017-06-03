/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import authenticate.Identifiable;
import java.io.Serializable;

/**
 *
 * @author ante
 */
public class TechnicienExterieur extends PersonnelGarage implements Identifiable, Serializable{

    public TechnicienExterieur(String id, String nom, String prenom, String adresse, String numTelephone, String matricule) {
        super(id, nom, prenom, adresse, numTelephone, matricule);
    }


    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String i) {
        this.id = i;
    }
}
