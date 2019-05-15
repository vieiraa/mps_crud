package view;

import infra.Facade;

public class Screen {
    private ScreenState current, exit;
    private Facade facade;
    
    public Screen() {
        facade = Facade.getInstance();
        
        exit = ExitScreen.getInstance();
    }
    
    public void show() {
        while (current != exit) {
            System.out.println("Bem-vindo ao Event Horizon.");
            if (facade.getLoggedUser() == null)
                current = StartScreen.getInstance();
            
            else
                current = MainScreen.getInstance();
            
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
