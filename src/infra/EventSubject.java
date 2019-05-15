package infra;

import java.util.ArrayList;
import java.util.List;

import business.model.Data;
import business.model.Event;

// Observer
public class EventSubject {
    FacebookAdapter fa;
    List<EventObserver> observers;
    
    public void attach(EventObserver o) {
        observers.add(o);
    }
    
    public void detach(EventObserver o) {
        observers.remove(o);
    }
    
    public void notifyUser() {
        Data today = new Data("");
        for (Event e : fa.getAuthUser().getEvents()) {
            if (e.getData().equals(today)) {
                
            }
        }
        
    }
}
