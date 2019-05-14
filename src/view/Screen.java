package view;

import infra.Facade;

public class Screen {
    private ScreenState current;
    private Facade facade;
    
    public Screen() {
        facade = Facade.getInstance();
    }
}
