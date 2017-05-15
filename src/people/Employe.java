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
public class Employe extends PersonnelGarage implements Serializable{

    public Employe(String id, String nom, String prenom, String adresse, String numTelephone, String matricule) {
        super(id, nom, prenom, adresse, numTelephone, matricule);
    }
    
}
