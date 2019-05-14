package infra;

import business.control.EventControl;
import business.control.UserControl;
import business.model.Data;
import business.model.Event;
import business.model.User;

// Singleton
public class Facade {
    private UserControl uc;
    private EventControl ec;
    private static Facade instance;
    
    private Facade() {
        uc = new UserControl();
        ec = new EventControl();
    }
    
    public void addEvento(String nome,     
                          Data data,
                          String horario,
                          String desc,
                          float preco)
    {
        
    }
    
    public void addEvento(String login, Event e) {
        
    }
    
    public void addUser(String login, String pw, String name, Data dn) {
        
    }
    
    public void addUser(User u) {
        
    }
    
    public void listEvent(long id) {
        
    }
    
    public void listAllEvents() {
        
    }
    
    public void listUser(String login) {
        
    }
    
    public void delEvent(long id) {
        
    }
    
    public void delUser(String login) {
        
    }
    
    public void generateReportHTML() {
        
    }
    
    public void generateReportJSON() {
        
    }
    
    public static Facade getInstance() {
        if (instance == null)
            instance = new Facade();
        
        return instance;
    }
}
