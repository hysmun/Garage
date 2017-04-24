/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author ante
 */
public class Mecanicien extends PersonnelGarage {
    protected String specialisation;

    public Mecanicien(String matricule, String id, String nom, String prenom, String adresse, String numTelephone) {
        super(matricule, id, nom, prenom, adresse, numTelephone);
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
    
}
