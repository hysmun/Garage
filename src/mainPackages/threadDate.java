/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackages;

import java.text.DateFormat;
import java.util.Locale;

/**
 *
 * @author ante
 */
public class threadDate extends Thread{
    public DateFormat formatDate;
    threadDate() {
        formatDate = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
    }

    @Override
    public void run() {
        // compute
        try
        {
            while(true)
            {
                appGestionDateLabel.setText();
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Error thread date !!!");
        }
    }
}
