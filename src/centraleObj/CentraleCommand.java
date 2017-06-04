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
import java.util.Date;
import java.util.Objects;


/**
 *
 * @author ante
 */
public class CentraleCommand implements Identifiable, Serializable{
    protected String id;
    protected String libelle;
    protected String type;
    protected int quantite;
    protected Date dateEnvois;

    public CentraleCommand() {
    }

    public CentraleCommand(String id, String libelle, String type, int quantite, Date dateEnvois) {
        this.id = id;
        this.libelle = libelle;
        this.type = type;
        this.quantite = quantite;
        this.dateEnvois = dateEnvois;
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
            this.dateEnvois = ((CentraleCommand) si.readObject()).dateEnvois;
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

    public Date getDateEnvois() {
        return dateEnvois;
    }

    public void setDateEnvois(Date dateEnvois) {
        this.dateEnvois = dateEnvois;
    }

    @Override
    public String toString() {
        return "CentraleCommand{" + "id=" + id + ", libelle=" + libelle + ", type=" + type + ", quantite=" + quantite + ", dateEnvois=" + dateEnvois + '}';
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
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CentraleCommand other = (CentraleCommand) obj;
        if (this.quantite != other.quantite) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.libelle, other.libelle)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.dateEnvois, other.dateEnvois)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + Objects.hashCode(this.libelle);
        hash = 47 * hash + Objects.hashCode(this.type);
        hash = 47 * hash + this.quantite;
        hash = 47 * hash + Objects.hashCode(this.dateEnvois);
        return hash;
    }
    
}
