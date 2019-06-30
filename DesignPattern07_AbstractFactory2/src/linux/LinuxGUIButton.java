package linux;

import framework.GUIButton;

public class LinuxGUIButton implements GUIButton{

    @Override
    public void click() {
        System.out.println("Linux button is clicked!");
    }
    
}
