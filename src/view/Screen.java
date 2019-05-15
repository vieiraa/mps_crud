package view;

import infra.Facade;

public class Screen {
    private ScreenState current, exit;
    private Facade facade;
    
    public Screen() {
        facade = Facade.getInstance();
        current = MainScreen.getInstance();
        exit = ExitScreen.getInstance();
    }
    
    public void show() {
        while (current != exit) {
            System.out.flush();
            showScreen();
        }
        
        showScreen();
    }
    
    public void showScreen() {
        current.showScreen(this);
    }
    
    public Facade getFacade() {
        return facade;
    }
    
    public void setState(ScreenState s) {
        current = s;
    }
}
