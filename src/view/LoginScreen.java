package view;

public class LoginScreen implements ScreenState {
    private static LoginScreen instance;
    
    private LoginScreen() {
        
    }
    
    @Override
    public void showScreen(Screen screen) {
        
    }
    
    public static LoginScreen getInstance() {
        if (instance == null)
            instance = new LoginScreen();
        
        return instance;
    }
}
