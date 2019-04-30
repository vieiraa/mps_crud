package business.control;

import business.model.Data;

public class Facade {
    private UserControl uc;
    private EventControl ec;
    
    public Facade(UserControl u, EventControl e) {
        uc = u;
        ec = e;
    }
    
    public void addEvento(String nome,     
                          Data data,
                          String horario,
                          String desc,
                          float preco)
    {
        
    }
    
    public void addUser(String login, String pw) {
        
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
}
