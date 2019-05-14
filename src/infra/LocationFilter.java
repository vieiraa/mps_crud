package infra;

import java.util.List;
import java.util.stream.Collectors;

import business.model.Event;

public class LocationFilter implements FilterStrategy {
    
    @Override
    public List<Event> filter(List<Event> events, String location) {        
        List<Event> ret = events.stream()
                         .filter(e -> e.getLocation() == location)
                         .collect(Collectors.toList());
        
        return ret;
    }
}
