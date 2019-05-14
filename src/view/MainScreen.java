package view;

public class MainScreen implements ScreenState {
    private static MainScreen instance;
    
    private MainScreen() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void showScreen(Screen screen) {
        // TODO Auto-generated method stub

    }
    
    public static MainScreen getInstance() {
        if (instance == null)
            instance = new MainScreen();
        
        return instance;
    }
}
