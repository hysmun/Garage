/*
 * package vehicules : classe abstraite Vehicule et classe Voiture qui hérite et implémente
Vehicule, qui possède une variable membre correspondant à la classe TypeVoiture (marque,
type, nombre de portes, …) et une autre correspondant au Client propriétaire (si connu : dans
le cas contraire, cette variable membre est à null); le constructeur d'initialisation de
TypeVoiture lance l'exception MissingTradeMarkException si on lui passe null pour la
marque;
 */
package vehicules;


import authenticate.Identifiable;
import java.io.Serializable;
import people.Client;

/**
 *
 * @author ante
 */
public abstract class Vehicule implements Identifiable, Serializable{
    protected String id;
    protected Client cli;

    public Vehicule(String id, Client client) {
        this.id = id;
        this.cli =  client;
    }
    
    public Client getClient() {
        return cli;
    }

    public void setClient(Client client) {
        this.cli = client;
    } 

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
    
    @Override
        public String toString() {
            return "Vehicule{ " + '}';
        }
}
