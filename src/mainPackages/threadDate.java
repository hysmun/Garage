/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import static mainPackages.applicationGestionForm.appGestionDateLabel;

/**
 *
 * @author ante
 */
public class threadDate extends Thread{
    static public DateFormat formatDate;
    static public TimeZone tz;
    static public Date currentDate;
    threadDate() {
        formatDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        tz = TimeZone.getTimeZone("Europe/Brussels");   
    }

    @Override
    public void run() {
        // compute
        try
        {
            while(true)
            {
                //appGestionDateLabel.setText(formatDate.format(new Date()));
                currentDate = Calendar.getInstance(tz).getTime();
                formatDate.setTimeZone(tz);
                appGestionDateLabel.setText(formatDate.format(currentDate));
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

    public TimeZone getTz() {
        return tz;
    }

    public void setTz(TimeZone tz) {
        this.tz = tz;
    }
    
    
    
}
