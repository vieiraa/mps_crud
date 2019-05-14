package view;

public class MapScreen implements ScreenState {
    private static MapScreen instance;
    
    private MapScreen() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void showScreen(Screen screen) {
        // TODO Auto-generated method stub

    }
    
    public static MapScreen getInstance() {
        if (instance == null)
            instance = new MapScreen();
        
        return instance;
    }
}
