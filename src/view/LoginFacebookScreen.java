package view;

public class LoginFacebookScreen implements ScreenState {
    private static LoginFacebookScreen instance;
    
    private LoginFacebookScreen() {
        
    }
    
    @Override
    public void showScreen(Screen screen) {
        
    }
    
    public static LoginFacebookScreen getInstance() {
        if (instance == null)
            instance = new LoginFacebookScreen();
        
        return instance;
    }

}
