package infra;

import business.model.Event;
import business.model.User;

public interface FacebookHandler {
    Event getEvent(long id);
    User getAuthUser();
}
