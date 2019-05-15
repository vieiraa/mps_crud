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
        System.out.println("Login: ");
        String login = scan.next();
        System.out.println("Senha: ");
        String senha = scan.next();
        
        try {
            screen.getFacade().login(login, senha);
            screen.setState(MainScreen.getInstance());
        } catch (UserLoginException | UserPasswordException e) {
            System.out.println(e.getMessage());
            screen.setState(this);
        }
    }
    
    public static LoginScreen getInstance() {
        if (instance == null)
            instance = new LoginScreen();
        
        return instance;
    }
}
