/*
 * une Personne cliente du garage et qui a donc un numéro de client (il est donc
Identifiable); elle n'a évidemment aucun droit d'utilisation pour ApplicationGestion.
 */
package people;

/**
 *
 * @author ante
 */
public class Client extends Personne{

    public Client() {
    }

    public Client(String nom, String prenom, String adresse, String numTelephone) {
        super(nom, prenom, adresse, numTelephone);
    }

    @Override
    public String toString() {
        return "Client{" + '}';
    }
    
}
