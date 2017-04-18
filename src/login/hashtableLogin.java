package login;

import java.util.Hashtable;

public class hashtableLogin {
    
    private Hashtable<String, String> loginTable;
    
    public hashtableLogin() {
        loginTable = new Hashtable();
        loginTable.put("root","root");
        loginTable.put("guest","guest");
    }
    
    
}
