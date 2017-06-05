/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centraleMain;

import centraleObj.CentraleCommand;

/**
 *
 * @author ante
 */
public class InStockEvent {
    
    private CentraleCommand commande;
    
    public InStockEvent(CentraleCommand p) {
        this.commande = p;
    }

    public CentraleCommand getCommande() {
        return commande;
    }
    
}
