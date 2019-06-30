package linux;

import framework.GUIButton;
import framework.GUIFactory;
import framework.GUITextArea;

public class LinuxGUIFactory implements GUIFactory{

    @Override
    public GUIButton createButton() {
        return new LinuxGUIButton();
    }

    @Override
    public GUITextArea createTextArea() {
        return new LinuxGUITextArea();
    }
    
}
