/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activite;

import authenticate.Identifiable;
import java.io.Serializable;
import java.util.Objects;
import people.*;
import vehicules.*;

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

    public Travail() {
    }

    

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

    public PersonnelGarage getPersogarage() {
        return persogarage;
    }

    public void setPersogarage(PersonnelGarage persogarage) {
        this.persogarage = persogarage;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        Voiture vTmp = (Voiture)vehi;
        return "Immatriculation= " + vTmp.getImmatriculation() + ", Type Voiture= " + vTmp.getTypeVoiture() + ", vehi= " + vehi.getClient().getNom()+" "+vehi.getClient().getPrenom() + ", description=" + description + ", etat=" + etat ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.persogarage);
        hash = 11 * hash + Objects.hashCode(this.vehi);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.prix) ^ (Double.doubleToLongBits(this.prix) >>> 32));
        hash = 11 * hash + Objects.hashCode(this.description);
        hash = 11 * hash + this.etat;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Travail other = (Travail) obj;
        if (Double.doubleToLongBits(this.prix) != Double.doubleToLongBits(other.prix)) {
            return false;
        }
        if (this.etat != other.etat) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.persogarage, other.persogarage)) {
            return false;
        }
        if (!Objects.equals(this.vehi, other.vehi)) {
            return false;
        }
        return true;
    }

    
}
