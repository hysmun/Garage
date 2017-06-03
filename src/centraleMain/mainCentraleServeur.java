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
        applicationCentraleForm appPneu = new applicationCentraleForm(applicationCentraleForm.PNEU);
        appPneu.setVisible(true);
        applicationCentraleForm appPiece = new applicationCentraleForm(applicationCentraleForm.PIECE);
        appPiece.setVisible(true);
        applicationCentraleForm appLubrifiant = new applicationCentraleForm(applicationCentraleForm.LUBRIFIANT);
        appLubrifiant.setVisible(true);
        
    }
    
}
