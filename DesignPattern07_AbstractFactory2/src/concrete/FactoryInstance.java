package concrete;

import framework.GUIFactory;
import linux.LinuxGUIFactory;
import window.WindowGUIFactory;

public class FactoryInstance {
    
    public static GUIFactory getGUIFactory(){
        String osName = System.getProperty("os.name");
        if(osName.equals("Linux"))
            return new LinuxGUIFactory();
        else
            return new WindowGUIFactory();
    }
    
}
