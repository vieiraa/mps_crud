package infra;

import java.util.List;

import business.model.Event;

public interface FilterStrategy {
    List<Event> filter(List<Event> events, String param);
}
