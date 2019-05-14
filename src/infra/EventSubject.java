package infra;

import java.util.ArrayList;
import java.util.List;

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
        List<Event> todayEvents = new ArrayList<>();
        
    }
}
