/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centraleObj;

import authenticate.Identifiable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.StringTokenizer;


/**
 *
 * @author ante
 */
public class CentraleCommand implements Identifiable, Serializable{
    protected String id;
    protected String libelle;
    protected String type;
    protected int quantite;
    protected int urgence;
    protected Calendar dateEnvois;
    protected boolean disponibilite;
    
    public static final int URGENT = 3;
    public static final int PRIORITAIRE = 2;
    public static final int NONPRIORITAIRE = 1;

    public CentraleCommand() {
        this.id = "C0"+new Random().nextInt(100000000);
        this.disponibilite = false;
    }

    public CentraleCommand(String id, String libelle, String type, int quantite,int urgence, Calendar dateEnvois) {
        this.id = id;
        this.libelle = libelle;
        this.type = type;
        this.quantite = quantite;
        this.urgence = urgence;
        this.dateEnvois = dateEnvois;
        this.disponibilite = false;
    }

    public CentraleCommand(String id, String libelle, String type, int quantite, int urgence, Calendar dateEnvois, boolean disponibilite) {
        this.id = id;
        this.libelle = libelle;
        this.type = type;
        this.quantite = quantite;
        this.urgence = urgence;
        this.dateEnvois = dateEnvois;
        this.disponibilite = disponibilite;
    }
    
    public CentraleCommand(String serializedObj)
    {
        String tmpDate= "";
        try 
        {
            StringTokenizer st = new StringTokenizer(serializedObj, ",\n");
            
            this.id = st.nextToken();
            this.libelle = st.nextToken();
            this.type = st.nextToken();
            this.quantite = Integer.parseInt(st.nextToken());
            this.urgence = Integer.parseInt(st.nextToken());
            tmpDate = st.nextToken();
            StringTokenizer st2 = new StringTokenizer(tmpDate, "/\n");
            this.dateEnvois = Calendar.getInstance();
            this.dateEnvois.set(Integer.parseInt(st2.nextToken()), Integer.parseInt(st2.nextToken()), Integer.parseInt(st2.nextToken()));
            this.disponibilite = Boolean.parseBoolean(st.nextToken());
        } 
        catch (Exception e) 
        {
            System.out.println("CentraleCommand\tconstructeur string ( "+serializedObj + " == " + tmpDate +" ) -- " +e.getMessage());
        }
    }
    
    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Calendar getDateEnvois() {
        return dateEnvois;
    }

    public void setDateEnvois(Calendar dateEnvois) {
        this.dateEnvois = dateEnvois;
    }

    public int getUrgence() {
        return urgence;
    }

    public void setUrgence(int urgence) {
        this.urgence = urgence;
    }

    public boolean isDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    @Override
    public String toString() {
        return "id=" + id + ", libelle=" + libelle + ", type=" + type + ", quantite=" + quantite + ", dateEnvois=" + dateEnvois.get(Calendar.YEAR)+"/"+ dateEnvois.get(Calendar.MONTH)+"/"+dateEnvois.get(Calendar.DAY_OF_MONTH)+ ", disponibilie="+disponibilite;
    }
    
    public String toStringForSend(){
        String serializedObj="";
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            serializedObj = id+ "," +libelle+ "," + type + "," + quantite + "," + urgence + ","+ dateEnvois.get(Calendar.YEAR)+"/"+ dateEnvois.get(Calendar.MONTH)+"/"+dateEnvois.get(Calendar.DAY_OF_MONTH)+ "," +disponibilite;
        }
        catch(Exception e)
        {
            System.out.println("CentraleCommand:\tFrom to string for send ( "+serializedObj + " )"+e.getMessage());
        }
        return serializedObj;
    }
    
}
