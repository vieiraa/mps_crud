package business.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String login;
    private String password;
    private String name;
    private Data dataNascimento;
    private boolean admin;
    private List<Event> events;
    
    public User() {
        dataNascimento = new Data();
    }
    
    public User(String l, String n, String p, Data dn) {
        login = l;
        password = p;
        name = n;
        dataNascimento = dn;
        events = new ArrayList<Event>();
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Data getData() {
        return dataNascimento;
    }
    
    public String getDataFormatada() {
        return dataNascimento.toString();
    }
    
    public String getNome() {
        return name;
    }
    
    public void setNome(String n) {
        name = n;
    }
    
    public String toString() {
        return String.format("%s - %s", login, getDataFormatada());
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> e) {
        this.events = e;
    }
    
    public void addEvent(Event e) {
        events.add(e);
    }
    
    public void removeEvent(Event e) {
        events.remove(e);
    }
}
