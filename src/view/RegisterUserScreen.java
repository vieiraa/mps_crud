package view;

public class RegisterUserScreen implements ScreenState {
    private static RegisterUserScreen instance;
    
    private RegisterUserScreen() {
        
    }
    
    @Override
    public void showScreen(Screen screen) {
        
    }
    
    public static RegisterUserScreen getInstance() {
        if (instance == null)
            instance = new RegisterUserScreen();
        
        return instance;
    }
}
