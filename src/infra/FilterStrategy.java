package infra;

import java.util.List;

import business.model.Event;

public interface FilterStrategy {
    void filter(List<Event> events, String param);
}
