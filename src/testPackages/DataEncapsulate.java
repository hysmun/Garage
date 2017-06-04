/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackages;

import activite.Travail;
import centraleObj.CentraleCommand;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import static mainPackages.mainGarage.clientProperties;
import people.Client;
import people.PersonnelGarage;
import vehicules.Vehicule;

/**
 *
 * @author ante
 */
public class DataEncapsulate implements Serializable{
    public Vector<Client> vClient;
    public Vector<PersonnelGarage> vPersonnel;
    public LinkedList<Travail> llTravailPrevu;
    public ArrayList<Travail> llTravailEnCours;
    public LinkedList<Travail> llTravailFini;
    public LinkedList<Vehicule> vVehicule;
    public LinkedList<CentraleCommand> vCommand;
    public String dirSave; 

    public DataEncapsulate() {
        vClient = new Vector<Client>();
        vPersonnel = new Vector<PersonnelGarage>();
        llTravailPrevu = new LinkedList<Travail>();
        llTravailEnCours = new ArrayList<Travail>();
        llTravailFini = new LinkedList<Travail>();
        vVehicule = new LinkedList<Vehicule>();
        vCommand = new LinkedList<CentraleCommand>();
    }
}
