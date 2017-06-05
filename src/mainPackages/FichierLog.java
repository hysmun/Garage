package mainPackages;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FichierLog implements Serializable {
    
    public FileWriter output = null;
    public File path;
    static public String sep = System.getProperty("file.separator");
    public Date date;
    public DateFormat sfd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    public FichierLog()
    {
        
    }

    public FileWriter getOutput() 
    {
        path = getPath();
        try
        {
            output = new FileWriter(path,true);
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        return output;
    }
    public void close()
    {
        if(output != null)
        {
            try {
                output.close();
            } catch (IOException ex) {
                Logger.getLogger(FichierLog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public File getPath() {
        
        File tmp = new File("logs");
        if(!tmp.exists())
        {
            tmp.mkdir();
        }
        File tmp2 = new File("logs"+sep+"loggedInformation.log");
        if(!tmp2.exists())
        {
            try
            {
                FileOutputStream fos = new FileOutputStream(tmp2,true);
                fos.close();
            }
            catch(IOException ex)
            {
                ex.printStackTrace();
            }
        }
        return tmp2;
    }    
    
    public void write(String text)
    {
        if(output != null)
        {
            date = Calendar.getInstance().getTime();
            String tmp = sfd.format(date) + " -- " + text + "\n";
            try 
            {
                output.write(tmp);
                output.flush();
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(FichierLog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
}
