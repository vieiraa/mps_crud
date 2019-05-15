package view;

public class ExitScreen implements ScreenState {
    private static ExitScreen instance;
    
    private ExitScreen() {
        
    }
    
    @Override
    public void showScreen(Screen screen) {
        System.out.println("Ate mais");
    }
    
    public static ExitScreen getInstance() {
        if (instance == null)
            instance = new ExitScreen();
        
        return instance;
    }
}
