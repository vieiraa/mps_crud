package business.control;

import java.util.List;
import java.util.Map;

import business.model.Data;
import business.model.Event;
import business.model.User;
import infra.FilterStrategy;

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
    
    public Map<Long, Event> getEventos() {
        return eventos;
    }
    
    public void list(long id) {
        
    }
    
    public void listAll() {
        
    }
    
    public void del(long id) {
        
    }
    
    public void saveEventos() {
        
    }
    
    public void loadEvetos() {
        
    }
}
