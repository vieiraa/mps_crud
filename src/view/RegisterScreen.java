package view;

public class RegisterScreen implements ScreenState {
    private static RegisterScreen instance;
    
    @Override
    public void showScreen(Screen screen) {
        // TODO Auto-generated method stub

    }
    
    public static RegisterScreen getInstance() {
        if (instance == null)
            instance = new RegisterScreen();
        
        return instance;
    }
}
