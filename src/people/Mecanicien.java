/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.io.Serializable;

/**
 *
 * @author ante
 */
public class Mecanicien extends PersonnelGarage implements Serializable{
    protected String specialisation;

    public Mecanicien(String id, String nom, String prenom, String adresse, String numTelephone, String matricule,String specialisation) {
        super(id, nom, prenom, adresse, numTelephone, matricule);
        this.specialisation = specialisation;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
    
}
