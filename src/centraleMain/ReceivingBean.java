/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centraleMain;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.LinkedList;
import network.NetworkBasicServer;

/**
 *
 * @author ante
 */
public class ReceivingBean implements InStockListener{
    private NetworkBasicServer nbs;
    private LinkedList<PropertyChangeListener> pcl;
    private String commandeRecue;
    private boolean enMarche;
    
    public ReceivingBean()
    {
        commandeRecue = "INIT";
        pcl = new LinkedList<PropertyChangeListener>();
        enMarche = false;
    }
    
    public ReceivingBean(NetworkBasicServer pnbs)
    {
        commandeRecue = "INIT";
        pcl = new LinkedList<PropertyChangeListener>();
        this.nbs = pnbs;
        enMarche = false;
    }

    public String getCommandeRecue() {
        return commandeRecue;
    }

    public void setCommandeRecue(String pcommandeRecue) {
        for(int i=0; i<pcl.size(); i++)
        {
            pcl.get(i).propertyChange(new PropertyChangeEvent(this, "commandeRecue", this.commandeRecue, pcommandeRecue));
        }
        this.commandeRecue = pcommandeRecue;
    }

    public boolean isEnMarche() {
        return enMarche;
    }

    public void setEnMarche(boolean enMarche) {
        this.enMarche = enMarche;
    }
    
    public void run()
    {
        String message ="";
        while(isEnMarche())
        {
            if((message = nbs.getMessage()) != "RIEN")
            {
                System.out.println("S:\t run "+message);
                setCommandeRecue(message);
                setEnMarche(false);
            }
        }
    }
    
    public void AddPropertyChangeListener(PropertyChangeListener s)
    {
        pcl.add(s);
    }
    
    public void RemovePropertyChangeListener(PropertyChangeListener s)
    {
        pcl.remove(s);
    }
    
    @Override
    public void InStockFired(InStockEvent s) {
        nbs.sendMessage(s.getCommande().toStringForSend());
    }
}
