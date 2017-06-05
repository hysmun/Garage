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
public class SearchBean implements PropertyChangeListener{
    private LinkedList<SearchFoundListener> sfl;

    public SearchBean() {
        sfl = new LinkedList<SearchFoundListener>();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
