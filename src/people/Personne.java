/*
 * classiquement pour les nom, prénom, adresse et numéro de téléphone;
 */
package people;

import authenticate.Identifiable;

/**
 *
 * @author ante
 */
public class Personne implements Identifiable{
    protected String id;
    protected String nom;
    protected String prenom;
    protected String adresse;
    protected String numTelephone;

    public Personne() {
    }

    public Personne(String id, String nom, String prenom, String adresse, String numTelephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numTelephone = numTelephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumTelephone() {
        return numTelephone;
    }

    public void setNumTelephone(String numTelephone) {
        this.numTelephone = numTelephone;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", numTelephone=" + numTelephone + '}';
    }
    
    @Override
    public String getId()
    {
        return this.id;
    }
    
    @Override
    public void setId(String id)
    {
        this.id = id;
    }
    
}
