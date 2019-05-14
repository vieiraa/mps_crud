package view;

import java.util.Scanner;

import infra.Facade;

public class Screen {
    private ScreenState current;
    private Facade facade;
    private Scanner scan;
    
    public Screen() {
        facade = Facade.getInstance();
        current = StartScreen.getInstance();
        scan = new Scanner(System.in);
    }
    
    public void show() {
        
        System.out.println("Bem-vindo ao Event Horizon.");
        if (facade.getLoggedUser() == null) {
            
        }
        
    }
    
    public void showScreen() {
        current.showScreen(this);
    }
}
