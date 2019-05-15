package view;

import java.util.Scanner;

public class MainScreen implements ScreenState {
    private static MainScreen instance;
    private Scanner scan;
    
    private MainScreen() {
        scan = new Scanner(System.in);
    }
    
    @Override
    public void showScreen(Screen screen) {
        if (screen.getFacade().getLoggedUser() == null) {
            screen.setState(StartScreen.getInstance());
            return;
        }
        
        screen.getFacade().listUserEvents(screen.getFacade().getLoggedUser().getLogin());
        
        System.out.println("1. Filtrar eventos");
        System.out.println("2. Ver mapa");
        System.out.println("3. Listar todos os eventos");
        System.out.println("0. Sair");
        
        int op = scan.nextInt();
        switch (op) {
        case 0:
            screen.setState(ExitScreen.getInstance());
            break;
        case 1:
            screen.setState(FilterScreen.getInstance());
            break;
        case 2:
            screen.setState(MapScreen.getInstance());
            break;
        case 3:
            screen.getFacade().listAllEvents();
            screen.setState(this);
            break;
        default:
            System.out.println("Opcao invalida.");
            screen.setState(this);
        }
    }
    
    public static MainScreen getInstance() {
        if (instance == null)
            instance = new MainScreen();
        
        return instance;
    }
}
