package designpattern14_observer2;

import java.util.Observable;

public class Button extends Observable{
    public void onClick(){
        setChanged();
        System.out.println("Button onclick was called");
        notifyObservers();
    }
}
