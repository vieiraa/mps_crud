package view;

import java.util.Scanner;

import util.UserLoginException;
import util.UserPasswordException;

public class LoginScreen implements ScreenState {
    private static LoginScreen instance;
    Scanner scan;
    
    private LoginScreen() {
        scan = new Scanner(System.in);
    }
    
    @Override
    public void showScreen(Screen screen) {
        while (true) {
            System.out.println("Login: ");
            String login = scan.next();
            System.out.println("Senha: ");
            String senha = scan.next();
            
            try {
                screen.getFacade().login(login, senha);
            } catch (UserLoginException | UserPasswordException e) {
                System.out.println(e.getMessage());
                continue;
            }
            
            screen.setState(MainScreen.getInstance());
            break;
        }
        
        
    }
    
    public static LoginScreen getInstance() {
        if (instance == null)
            instance = new LoginScreen();
        
        return instance;
    }
}
