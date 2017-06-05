/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackages;

import activite.*;

import centraleObj.CentraleCommand;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import people.*;
import vehicules.*;

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
        for(int i=0; i<4; i++)
        {
            llTravailEnCours.add(new Reparation());
        }
        llTravailFini = new LinkedList<Travail>();
        vVehicule = new LinkedList<Vehicule>();
        vCommand = new LinkedList<CentraleCommand>();
    }
}
