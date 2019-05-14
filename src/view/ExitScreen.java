package view;

public class ExitScreen implements ScreenState {
    private static ExitScreen instance;
    
    private ExitScreen() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void showScreen(Screen screen) {
        // TODO Auto-generated method stub

    }
    
    public static ExitScreen getInstance() {
        if (instance == null)
            instance = new ExitScreen();
        
        return instance;
    }
}
