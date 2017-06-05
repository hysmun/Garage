/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import static mainPackages.applicationGestionForm.appGestionDateLabel;

/**
 *
 * @author ante
 */
public class threadDate extends Thread{
    public DateFormat formatDate;
    threadDate() {
        formatDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    }

    @Override
    public void run() {
        // compute
        try
        {
            while(true)
            {
                appGestionDateLabel.setText(formatDate.format(new Date()));
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Error thread date !!!");
        }
    }

    public DateFormat getFormatDate() {
        return formatDate;
    }

    public void setFormatDate(DateFormat formatDate) {
        this.formatDate = formatDate;
    }
    
    
}
