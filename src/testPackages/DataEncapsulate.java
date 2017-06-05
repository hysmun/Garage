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
    public Travail travailPont1;
    public Travail travailPont2;
    public Travail travailPont3;
    public Travail travailSol;
    public LinkedList<Travail> llTravailFini;
    public LinkedList<Vehicule> vVehicule;
    public LinkedList<CentraleCommand> vCommand;
    public String dirSave; 

    public DataEncapsulate() {
        vClient = new Vector<Client>();
        vPersonnel = new Vector<PersonnelGarage>();
        llTravailPrevu = new LinkedList<Travail>();
        travailPont1 = null;
        travailPont2 = null;
        travailPont3 = null;
        travailSol = null;
        llTravailFini = new LinkedList<Travail>();
        vVehicule = new LinkedList<Vehicule>();
        vCommand = new LinkedList<CentraleCommand>();
    }
}
