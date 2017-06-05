/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centraleMain;

/**
 *
 * @author ante
 */
public class mainCentraleServeur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        applicationCentraleFormBean appPneu = new applicationCentraleFormBean(applicationCentraleForm.PNEU);
        appPneu.setVisible(true);
        applicationCentraleFormBean appPiece = new applicationCentraleFormBean(applicationCentraleForm.PIECE);
        appPiece.setVisible(true);
        applicationCentraleFormBean appLubrifiant = new applicationCentraleFormBean(applicationCentraleForm.LUBRIFIANT);
        appLubrifiant.setVisible(true);
        
        
        /*          VERSION DE BASE SANS BEANS ET FONCTIONNEL
        
        applicationCentraleFormBean appPneu = new applicationCentraleFormBean(applicationCentraleForm.PNEU);
        appPneu.setVisible(true);
        applicationCentraleFormBean appPiece = new applicationCentraleFormBean(applicationCentraleForm.PIECE);
        appPiece.setVisible(true);
        applicationCentraleFormBean appLubrifiant = new applicationCentraleFormBean(applicationCentraleForm.LUBRIFIANT);
        appLubrifiant.setVisible(true);
        
        */
        
    }
    
}
