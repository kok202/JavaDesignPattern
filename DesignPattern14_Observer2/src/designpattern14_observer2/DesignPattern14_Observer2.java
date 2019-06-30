package designpattern14_observer2;

import java.util.Observable;
import java.util.Observer;

public class DesignPattern14_Observer2 {

    public static void main(String[] args) {
        Button button = new Button();
        button.addObserver(new ButtonObserver());
        button.onClick();
        button.onClick();
        button.onClick();
    }
    
}
