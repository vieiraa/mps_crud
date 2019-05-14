package view;

public class FilterScreen implements ScreenState {
    private static FilterScreen instance;
    
    private FilterScreen() {
        
    }
    
    @Override
    public void showScreen(Screen screen) {
        
    }
    
    public static FilterScreen getInstance() {
        if (instance == null)
            instance = new FilterScreen();
        
        return instance;
    }

}
