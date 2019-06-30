package window;

import framework.GUIButton;
import framework.GUIFactory;
import framework.GUITextArea;

public class WindowGUIFactory implements GUIFactory{

    @Override
    public GUIButton createButton() {
        return new WindowGUIButton();
    }

    @Override
    public GUITextArea createTextArea() {
        return new WindowGUITextArea();
    }
    
}
