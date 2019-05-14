package view;

public class LoginFacebookScreen implements ScreenState {
    private static LoginFacebookScreen instance;
    
    private LoginFacebookScreen() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void showScreen(Screen screen) {
        // TODO Auto-generated method stub

    }
    
    public static LoginFacebookScreen getInstance() {
        if (instance == null)
            instance = new LoginFacebookScreen();
        
        return instance;
    }

}
