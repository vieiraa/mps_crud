package infra;

import java.util.ArrayList;
import java.util.List;

import business.control.EventControl;
import business.model.Data;
import business.model.Event;
import business.model.User;

public class FacebookAdapter implements FacebookHandler {
    EventControl ec;
    private User loggedUser;
    
    public FacebookAdapter() {
        loggedUser = new User("admin", "123", "Adm", new Data("01/01/1970"));
        ec = EventControl.getInstance();
        ec.add("Festa", "jampa", new Data("14/05/2019"), "23:59", "festa", 1.0f);
    }

    @Override
    public Event getEvent(long id) {
        return ec.getEventos().values().stream().filter(e -> e.getId() == id).findFirst().get();
    }

    @Override
    public User getAuthUser() {
        return loggedUser;
    }
}
