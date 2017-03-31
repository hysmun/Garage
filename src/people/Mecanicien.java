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
public class Mecanicien extends Personne {
    protected String specialisation;

    public Mecanicien() {
        super();
    }

    public Mecanicien(String nom, String prenom, String adresse, String numTelephone) {
        super(nom, prenom, adresse, numTelephone);
    }

    public Mecanicien(String specialisation, String nom, String prenom, String adresse, String numTelephone) {
        super(nom, prenom, adresse, numTelephone);
    }
    public Mecanicien(String specialisation) {
        super();
        this.specialisation = specialisation;
    }  

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
    
}
