package login;

import java.io.Serializable;
import java.util.Hashtable;

public class hashtableLogin implements Serializable{
    
    private final Hashtable<String, String> loginMembreTable;
    private final Hashtable<String, String> loginExternTable;
    
    public hashtableLogin() {
        loginMembreTable = new Hashtable();
        loginMembreTable.put("root","root");
        
        loginExternTable = new Hashtable();
        loginExternTable.put("guest","guest");
    }

    public Hashtable<String, String> getLoginMembreTable() {
        return loginMembreTable;
    }

    public Hashtable<String, String> getLoginExternTable() {
        return loginExternTable;
    }
    
    
}
