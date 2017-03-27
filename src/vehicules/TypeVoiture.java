/*
 * package vehicules : classe abstraite Vehicule et classe Voiture qui hérite et implémente
Vehicule, qui possède une variable membre correspondant à la classe TypeVoiture (marque,
type, nombre de portes, …) et une autre correspondant au Client propriétaire (si connu : dans
le cas contraire, cette variable membre est à null); le constructeur d'initialisation de
TypeVoiture lance l'exception MissingTradeMarkException si on lui passe null pour la
marque;
 */
package vehicules;
import exception.MissingTradeMarkException;
/**
 *
 * @author ante
 */
public class TypeVoiture {
    
    protected String marque;
    protected String type;
    protected int nbPortes;

    public TypeVoiture() {
    }
    
    public TypeVoiture(String pmarque, String ptype, int pnbPortes) throws MissingTradeMarkException {
        if(pmarque == null)
        {
            throw new MissingTradeMarkException("Marque null dans constructeur TypeVoiture");
        }
        this.marque = pmarque;
        this.type = ptype;
        this.nbPortes = pnbPortes;
    }
    
    public String getMarque() {
        return marque;
    }

    public void setMarque(String pmarque) throws MissingTradeMarkException {
        if(pmarque == null)
        {
            throw new MissingTradeMarkException("Marque null dans constructeur TypeVoiture");
        }
        this.marque = pmarque;
    }

    public String getType() {
        return type;
    }

    public void setType(String ptype) {
        
        this.type = ptype;
    }

    public int getNbPortes() {
        return nbPortes;
    }

    public void setNbPortes(int pnbPortes) {
        this.nbPortes = pnbPortes;
    }

    @Override
    public String toString() {
        return "TypeVoiture{" + "marque=" + marque + ", type=" + type + ", nbPortes=" + nbPortes + "}";
    }
    
}
