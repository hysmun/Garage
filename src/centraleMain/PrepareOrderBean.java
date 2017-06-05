/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centraleMain;

import centraleObj.CentraleCommand;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author ante
 */
public class PrepareOrderBean implements SearchFoundListener{
    private LinkedList<InStockListener> isl;
    private CentraleCommand commande;

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
        commande = new CentraleCommand(s.getLibelle());
        if(commande.isDisponibilite() == true)
        {
            int tmp = new Random().nextInt(50);
            commande.setDateEnvois(Calendar.getInstance() );
            commande.getDateEnvois().add(Calendar.DAY_OF_YEAR, tmp);
        }
        for(int i=0; i<isl.size(); i++)
        {
            isl.get(i).InStockFired(new InStockEvent(commande));
        }
    }
}
