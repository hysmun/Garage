/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;
import authenticate.*;
import java.io.Serializable;

/**
 *
 * @author Rémy
 */
public abstract class PersonnelGarage extends Personne implements Identifiable,AValider, Serializable {
    
    private String matricule;

    public PersonnelGarage(String id, String nom, String prenom, String adresse, String numTelephone, String matricule) {
        super(id, nom, prenom, adresse, numTelephone);
        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    
    @Override
    public boolean isValid()
    {
        return this.validate();
    }
    
    @Override
    public boolean validate()
    {
        // A modifier
        throw new UnsupportedOperationException("Pas implementee");
    }
    
    
    
    
}
