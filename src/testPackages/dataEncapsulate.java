/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackages;

import activite.Travail;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import people.Client;
import vehicules.Vehicule;

/**
 *
 * @author ante
 */
public class dataEncapsulate {
    public Vector<Client> vClient;
    public LinkedList<Travail> llTravailPrevu;
    public ArrayList<Travail> llTravailEnCours;
    public LinkedList<Travail> llTravailFini;
    public LinkedList<Vehicule> llVehicules;

    public dataEncapsulate() {
        vClient = new Vector<Client>();
        llTravailPrevu = new LinkedList<Travail>();
        llTravailEnCours = new ArrayList<Travail>();
        llTravailFini = new LinkedList<Travail>();
        llVehicules = new LinkedList<Vehicule>();
    }
    
}
