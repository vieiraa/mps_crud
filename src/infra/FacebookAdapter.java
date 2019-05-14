package infra;

import java.util.ArrayList;
import java.util.List;

import business.model.Data;
import business.model.Event;
import business.model.User;

public class FacebookAdapter implements FacebookHandler {
    private List<Event> events;
    private User loggedUser;
    
    public FacebookAdapter() {
        loggedUser = new User("admin", "123", "Adm", new Data("01/01/1970"));
        events = new ArrayList<>();
        events.add(new Event("Festa", "somewhere", new Data("14/05/2019"), "23:59", "Festa", 0.0f));
    }

    @Override
    public Event getEvent(long id) {
        return events.stream().filter(e -> e.getId() == id).findFirst().get();
    }

    @Override
    public User getAuthUser() {
        return loggedUser;
    }
}
