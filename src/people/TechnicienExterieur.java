/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import authenticate.Identifiable;

/**
 *
 * @author ante
 */
public class TechnicienExterieur extends Personne implements Identifiable {
     public TechnicienExterieur() {
    }

    public TechnicienExterieur(String nom, String prenom, String adresse, String numTelephone) {
        super(nom, prenom, adresse, numTelephone);
    }

    @Override
    public String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(String i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
