package designpattern07_abstractfactory2;

import concrete.FactoryInstance;
import framework.GUIButton;
import framework.GUIFactory;
import framework.GUITextArea;
import linux.LinuxGUIFactory;

public class DesignPattern07_AbstractFactory2 {

    public static void main(String[] args) {
        GUIFactory factory = FactoryInstance.getGUIFactory();
        GUIButton button = factory.createButton();
        GUITextArea textArea = factory.createTextArea();
        button.click();
        System.out.println(textArea.getText());
    }
    
}
