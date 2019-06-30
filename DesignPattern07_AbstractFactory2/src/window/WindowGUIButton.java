package window;

import framework.GUIButton;

public class WindowGUIButton implements GUIButton{

    @Override
    public void click() {
        System.out.println("Window button is clicked!");
    }
    
}
