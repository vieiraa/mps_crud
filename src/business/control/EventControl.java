package business.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import business.model.Data;
import business.model.Event;
import business.model.User;
import infra.FilterStrategy;

public class EventControl {
    private Map<Long, Event> eventos;
    private static EventControl instance;
    
    private EventControl() {
        eventos = new HashMap<Long, Event>(); 
    }
    
    public void add(String nome,
                    String loc,
                    Data data,
                    String horario,
                    String desc,
                    float preco) 
    {
        Event e = new Event(nome, loc, data, horario, desc, preco);
        eventos.put(e.getId(), e);
    }
    
    public Map<Long, Event> getEventos() {
        return eventos;
    }
    
    public void list(long id) {
        
    }
    
    public void listAll() {
        for (Event e : eventos.values()) {
            System.out.println(e.toString());
        }
    }
    
    public void del(long id) {
        
    }
    
    public void saveEventos() {
        
    }
    
    public void loadEvetos() {
        
    }
    
    public static EventControl getInstance() {
        if (instance == null)
            instance = new EventControl();
        return instance;
    }
}
