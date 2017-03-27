/*
 *package vehicules : classe abstraite Vehicule et classe Voiture qui hérite et implémente
Vehicule, qui possède une variable membre correspondant à la classe TypeVoiture (marque,
type, nombre de portes, …) et une autre correspondant au Client propriétaire (si connu : dans
le cas contraire, cette variable membre est à null); le constructeur d'initialisation de
TypeVoiture lance l'exception MissingTradeMarkException si on lui passe null pour la
marque;
 */
package vehicules;

import People.*;

/**
 *
 * @author ante
 */
public class Voiture extends Vehicule{
    protected TypeVoiture typeVoiture;
    protected Client client;

    public Voiture(){
    }

    public Voiture(TypeVoiture typeVoiture, Client pclient) {
        this.typeVoiture = typeVoiture;
        this.client = pclient;
    }

    public TypeVoiture getTypeVoiture() {
        return typeVoiture;
    }

    public void setTypeVoiture(TypeVoiture ptypeVoiture) {
        this.typeVoiture = ptypeVoiture;
    }
    
    @Override
    public String toString() {
        return "Voiture{" + "typeVoiture=" + typeVoiture.toString() + '}';
    }
    
}
