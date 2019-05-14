package view;

public class StartScreen implements ScreenState {
    private static StartScreen instance;
    
    private StartScreen() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void showScreen(Screen screen) {
        
    }
    
    public static StartScreen getInstance() {
        if (instance == null)
            instance = new StartScreen();
        
        return instance;
    }
}
