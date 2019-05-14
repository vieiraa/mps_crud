package infra;

import business.model.Event;

public class AddEventCommand implements Command {
    FacebookAdapter fa;
    
    public Event askEvent() {
        long event = 0;
        return fa.getEvent(event);
    }
    
    @Override
    public void execute() {
        Facade f = Facade.getInstance();
        f.addEvento(fa.getAuthUser().getLogin(), askEvent());
    }
}
