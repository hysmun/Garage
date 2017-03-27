/*
 * package vehicules : classe abstraite Vehicule et classe Voiture qui hérite et implémente
Vehicule, qui possède une variable membre correspondant à la classe TypeVoiture (marque,
type, nombre de portes, …) et une autre correspondant au Client propriétaire (si connu : dans
le cas contraire, cette variable membre est à null); le constructeur d'initialisation de
TypeVoiture lance l'exception MissingTradeMarkException si on lui passe null pour la
marque;
 */
package vehicules;


import people.Client;

/**
 *
 * @author ante
 */
public abstract class Vehicule {

    @Override
    public String toString() {
        return "Vehicule{ " + '}';
    }
    Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
