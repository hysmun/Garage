/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centraleMain;

import java.util.LinkedList;

/**
 *
 * @author ante
 */
public class PrepareOrderBean implements SearchFoundListener{
    private LinkedList<InStockListener> isl;

    public PrepareOrderBean() {
        isl = new LinkedList<InStockListener>();
    }
    
    void AddInStockListener(InStockListener s)
    {
        isl.add(s);
    }
    
    void RemoveInStockListener(InStockListener s)
    {
        isl.remove(s);
    }

    @Override
    public void SearchFound(SearchFoundEvent s) {
        //calcule date expedition (random) previen receiving bean
        for(int i=0; i<isl.size(); i++)
        {
            isl.get(i).InStockFired(new InStockEvent());
        }
    }
}
