/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centraleMain;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.LinkedList;

/**
 *
 * @author ante
 */
public class ReceivingBean implements InStockListener{

    private LinkedList<PropertyChangeListener> pcl;
    private String commandeRecue;
    
    void ReceivingBean()
    {
        commandeRecue = "";
        pcl = new LinkedList<PropertyChangeListener>();
    }

    public String getCommandeRecue() {
        return commandeRecue;
    }

    public void setCommandeRecue(String commandeRecue) {
        for(int i=0; i<pcl.size(); i++)
        {
            pcl.get(i).propertyChange(new PropertyChangeEvent(this, "commandeRecue", commandeRecue, this.commandeRecue));
        }
        this.commandeRecue = commandeRecue;
    }
    
    
    
    void AddPropertyChangeListener(PropertyChangeListener s)
    {
        pcl.add(s);
    }
    
    void RemovePropertyChangeListener(PropertyChangeListener s)
    {
        pcl.remove(s);
    }
    
    @Override
    public void InStockFired(InStockEvent s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
