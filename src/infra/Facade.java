package infra;

import business.control.EventControl;
import business.control.UserControl;
import business.model.Data;
import business.model.Event;
import business.model.User;
import util.UserLoginException;
import util.UserPasswordException;

// Singleton
public class Facade {
    private UserControl uc;
    private EventControl ec;
    private static Facade instance;
    private FacebookAdapter fa;
    private User logged;
    
    private Facade() {
        uc = UserControl.getInstance();
        ec = new EventControl();
        fa = new FacebookAdapter();
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
    
    public void addUser(String login, String pw, String name, String dn) throws UserLoginException, UserPasswordException {
        User u = new User(login, pw, name, new Data(dn));
        uc.add(u);
        logged = u;
    }
    
    public void addUser(User u) throws UserLoginException, UserPasswordException {
        addUser(u.getLogin(), u.getPassword(), u.getNome(), u.getData().toString());
    }
    
    public void listEvent(long id) {
        ec.list(id);
    }
    
    public void listAllEvents() {
        ec.listAll();
    }
    
    public void listUserEvents(String login) {
        
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
    
    public User getLoggedUser() {
        return logged;
    }
    
    public void login(String login, String pass) throws UserLoginException, UserPasswordException {
        User user = uc.getUser(login);
        
        if (user.getPassword() == pass)
            logged = user;
        else
            throw new UserPasswordException("Senha invalida");
    }
    
    public void setLoggedUser(User u) {
        logged = u;
    }
}
