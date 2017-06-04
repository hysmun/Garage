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
import java.util.Date;
import java.util.Objects;
import java.util.Random;


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
        this.id = "C"+new Random().nextInt(100000000);
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
        try 
        {
            byte b[] = serializedObj.getBytes(); 
            ByteArrayInputStream bi = new ByteArrayInputStream(b);
            ObjectInputStream si = new ObjectInputStream(bi);
            this.id = ((CentraleCommand) si.readObject()).id;
            this.libelle = ((CentraleCommand) si.readObject()).libelle;
            this.type = ((CentraleCommand) si.readObject()).type;
            this.quantite = ((CentraleCommand) si.readObject()).quantite;
            this.urgence = ((CentraleCommand)si.readObject()).urgence;
            this.dateEnvois = ((CentraleCommand) si.readObject()).dateEnvois;
            this.disponibilite = ((CentraleCommand) si.readObject()).disponibilite;
        } 
        catch (Exception e) 
        {
            System.out.println(e);
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
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        return "CentraleCommand{" + "id=" + id + ", libelle=" + libelle + ", type=" + type + ", quantite=" + quantite + ", dateEnvois=" + df.format(dateEnvois) + ", disponibilie="+disponibilite+'}';
    }
    
    public String toStringForSend(){
        String serializedObj = "";
        try 
        {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream so = new ObjectOutputStream(bo);
            so.writeObject(this);
            so.flush();
            serializedObj = bo.toString();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        return serializedObj;
    }
    
}
