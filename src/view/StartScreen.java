package view;

import java.util.Scanner;

public class StartScreen implements ScreenState {
    private static StartScreen instance;
    private Scanner scan;
    
    private StartScreen() {
        scan = new Scanner(System.in);
    }
    
    @Override
    public void showScreen(Screen screen) {
        System.out.println("1. Login pelo app");
        System.out.println("2. Login pelo Facebook");
        System.out.println("3. Registrar");
        System.out.println("0. Sair");
        int option = scan.nextInt();
        switch (option) {
        case 0:
            screen.setState(ExitScreen.getInstance());
            break;
        case 1:
            screen.setState(LoginScreen.getInstance());
            break;
        case 2:
            screen.setState(LoginFacebookScreen.getInstance());
            break;
        case 3:
            screen.setState(RegisterUserScreen.getInstance());
            break;
        default:
            System.out.println("Opcao invalida");
            screen.setState(this);
        }
    }
    
    public static StartScreen getInstance() {
        if (instance == null)
            instance = new StartScreen();
        
        return instance;
    }
}
