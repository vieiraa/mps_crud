package business.control;

import java.util.List;
import java.util.Map;

import business.model.Data;
import business.model.Event;
import business.model.User;

public class EventControl {
    private Map<Long, Event> eventos;
    
    public EventControl() {};
    
    void add(String nome,
             String lat, String lng,
             Data data,
             String horario,
             String desc,
             float preco,
             User criador) 
    {
        
    }
    
    Map<Long, Event> getEventos() {
        return eventos;
    }
    
    void list(long id) {
        
    }
    
    void listAll() {
        
    }
    
    void del(long id) {
        
    }
    
    void saveEventos() {
        
    }
    
    void loadEvetos() {
        
    }
}
