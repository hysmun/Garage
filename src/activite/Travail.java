/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activite;

import authenticate.Identifiable;
import java.io.Serializable;
import people.Client;
import people.PersonnelGarage;
import vehicules.Vehicule;

/**
 *
 * @author ante
 */
public abstract class Travail implements Identifiable, Serializable{
    protected String id;
    protected PersonnelGarage persogarage;
    protected Vehicule vehi;
    protected double prix;
    protected String description;
    protected int etat;


    public Travail(String id, PersonnelGarage persogarage, Vehicule vehi, double prix, String description, int etat) {
        this.id = id;
        this.persogarage = persogarage;
        this.vehi = vehi;
        this.prix = prix;
        this.description = description;
        this.etat = etat;
    }

    
    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public PersonnelGarage getPersonnelGarage() {
        return persogarage;
    }

    public void setPersonnelGarage(PersonnelGarage persogarage) {
        this.persogarage = persogarage;
    }

    public Vehicule getVehi() {
        return vehi;
    }

    public void setVehi(Vehicule vehi) {
        this.vehi = vehi;
    }
    
    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    
}
