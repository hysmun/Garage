package login;

import java.util.Hashtable;

public class hashtableLogin {
    
    private final Hashtable<String, String> loginPersonnelTable;
    private final Hashtable<String, String> loginTable;
    
    public hashtableLogin() {
        loginPersonnelTable = new Hashtable();
        loginPersonnelTable.put("root","root");
        loginPersonnelTable.put("guest","guest");
        
        loginMembreTable = new Hashtable();
        loginMembreTable.put("root","root");
        loginMembreTable.put("guest","guest");
    }
    
    
}
