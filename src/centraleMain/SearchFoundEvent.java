/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centraleMain;

/**
 *
 * @author ante
 */
public class SearchFoundEvent {

    private String libelle;
    private boolean dispo;

    public SearchFoundEvent(String libelle, boolean dispo) {
        this.libelle = libelle;
        this.dispo = dispo;
    }

    public String getLibelle() {
        return libelle;
    }

    public boolean isDispo() {
        return dispo;
    }
    
}
