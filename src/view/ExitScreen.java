package view;

public class ExitScreen implements ScreenState {
    private static ExitScreen instance;
    
    private ExitScreen() {
        
    }
    
    @Override
    public void showScreen(Screen screen) {
        
    }
    
    public static ExitScreen getInstance() {
        if (instance == null)
            instance = new ExitScreen();
        
        return instance;
    }
}
