/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackages;

import activite.Travail;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import people.Client;
import vehicules.Vehicule;

/**
 *
 * @author ante
 */
public class DataEncapsulate implements Serializable{
    public Vector<Client> vClient;
    public LinkedList<Travail> llTravailPrevu;
    public ArrayList<Travail> llTravailEnCours;
    public LinkedList<Travail> llTravailFini;
    public Vector<Vehicule> vVehicule;

    public DataEncapsulate() {
        /*vClient = new Vector<Client>();
        llTravailPrevu = new LinkedList<Travail>();
        llTravailEnCours = new ArrayList<Travail>();
        llTravailFini = new LinkedList<Travail>();
        vVehicule = new Vector<Vehicule>();*/
    }
    
    
}