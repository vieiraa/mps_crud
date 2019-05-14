package infra;

import business.model.Event;

public class EventObserver {
    public void showMessage(Event e) {
        System.out.println(e.getNome());
    }
}
