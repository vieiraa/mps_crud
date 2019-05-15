package view;

import java.util.Scanner;

import util.UserLoginException;
import util.UserPasswordException;

public class RegisterUserScreen implements ScreenState {
    private static RegisterUserScreen instance;
    private Scanner scan;
    
    private RegisterUserScreen() {
        scan = new Scanner(System.in);
    }
    
    @Override
    public void showScreen(Screen screen) {
        while (true) {
            System.out.println("Login: ");
            String login = scan.next();
            System.out.println("Senha: ");
            String senha = scan.next();
            System.out.println("Nome: ");
            String nome = scan.next();
            System.out.println("Data de nascimento (dd/mm/aaaa): ");
            String data = scan.next();
            
            try {
                screen.getFacade().addUser(login, senha, nome, data);
            } catch (UserLoginException | UserPasswordException e) {
                System.out.println(e.getMessage());
                continue;
            }
            
            screen.setState(MainScreen.getInstance());
            break;
        }
    }
    
    public static RegisterUserScreen getInstance() {
        if (instance == null)
            instance = new RegisterUserScreen();
        
        return instance;
    }
}
