package view;

import java.util.Scanner;

import infra.LocationFilter;
import infra.MonthFilter;
import infra.PriceFilter;

public class FilterScreen implements ScreenState {
    private static FilterScreen instance;
    private Scanner scan;
    private MonthFilter mf;
    private PriceFilter pf;
    private LocationFilter lf;
    
    private FilterScreen() {
        scan = new Scanner(System.in);
        mf = new MonthFilter();
        pf = new PriceFilter();
        lf = new LocationFilter();
    }
    
    @Override
    public void showScreen(Screen screen) {
        System.out.println("1. Filtrar por localidade");
        System.out.println("2. Filtrar por preço");
        System.out.println("3. Filtrar por mes");
        System.out.println("4. Voltar");
        System.out.println("0. Sair");
        
        System.out.println("Digite uma opção: ");
        
        switch (scan.nextInt()) {
        case 0:
            screen.setState(ExitScreen.getInstance());
            break;
        case 1:
            System.out.println("Digite a localização desejada: ");
            String l = scan.next();
            lf.filter(screen.getFacade().getLoggedUser().getEvents(), l);
            break;
        case 2:
            System.out.println("Digite o preço desejada: ");
            String p = scan.next();
            pf.filter(screen.getFacade().getLoggedUser().getEvents(), p);
            break;
        case 3:
            System.out.println("Digite o mês desejada: ");
            String m = scan.next();
            mf.filter(screen.getFacade().getLoggedUser().getEvents(), m);
            break;
            
        default:
            System.out.println("Opção invalida.");
        }
        
        screen.setState(this);
    }
    
    public static FilterScreen getInstance() {
        if (instance == null)
            instance = new FilterScreen();
        
        return instance;
    }

}
