/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centraleMain;

import centraleObj.CentraleCommand;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.LinkedList;

/**
 *
 * @author ante
 */
public class SearchBean implements PropertyChangeListener{
    private final LinkedList<SearchFoundListener> sfl;
    public CentraleCommand commande;

    public SearchBean() {
        sfl = new LinkedList<SearchFoundListener>();
    }
    
    public void setDisponibilite(boolean dispo)
    {
        if(commande != null)
        {
            commande.setDisponibilite(dispo);
            for(int i=0; i<sfl.size(); i++)
            {
                sfl.get(i).SearchFound(new SearchFoundEvent(commande.toStringForSend(), dispo));
            }
        }
    }
    
    void AddSearchFoundListener(SearchFoundListener s)
    {
        sfl.add(s);
    }
    
    void RemoveSearchFoundListener(SearchFoundListener s)
    {
        sfl.remove(s);
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        commande = new CentraleCommand((String)evt.getNewValue());
    }
    
}
