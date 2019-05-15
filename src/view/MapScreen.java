package view;

import java.util.Scanner;

public class MapScreen implements ScreenState {
    private static MapScreen instance;
    private Scanner scan;
    
    private MapScreen() {
        scan = new Scanner(System.in);
    }
    
    @Override
    public void showScreen(Screen screen) {
        System.out.println("Mapa.");
        System.out.println("\n1. Voltar");
        System.out.println("\n0. Sair");
        switch (scan.nextInt()) {
        case 0:
            screen.setState(ExitScreen.getInstance());
            break;
        case 1:
            screen.setState(MainScreen.getInstance());
            break;
        default:
            System.out.println("Opcao invalida.");
            screen.setState(this);
        }
    }
    
    public static MapScreen getInstance() {
        if (instance == null)
            instance = new MapScreen();
        
        return instance;
    }
}
