package mainPackages;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
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
    
    public void init()
    {
        this.path = getPath();
        this.output = getOutput();
    }

    public FileWriter getOutput() 
    {
        try 
        {
            FileWriter tmp = new FileWriter(this.path,true);
            return tmp;
        } catch (IOException ex) {
            Logger.getLogger(FichierLog.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void close()
    {
        if(output != null)
        {
            this.date = Calendar.getInstance().getTime();
            String tmp = this.sfd.format(this.date) + " -- Fermeture application\n";
            try 
            {
                this.output.write(tmp);
                this.output.close();
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(FichierLog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public File getPath() {
        
        File workingdir = new File("logs");
        if(!workingdir.exists())
        {
            workingdir.mkdir();
        }
        File workingfile = new File("logs"+sep+"loggedInfo.log");
        if(!workingfile.exists())
        {
            try {
                workingfile.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(FichierLog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return workingfile;     
    }    
    
    public void write(String text)
    {
        if(this.output != null)
        {
            this.date = Calendar.getInstance().getTime();
            String tmp = this.sfd.format(this.date) + " -- " + text + "\n";
            try 
            {
                this.output.write(tmp);
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(FichierLog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
}
