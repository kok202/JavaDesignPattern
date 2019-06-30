package designpattern14_observer3;

import java.util.ArrayList;

public abstract class Observable {
    protected ArrayList<Observer> observers;
    
    Observable(){
        observers = new ArrayList<Observer>();
    }
    
    public void add(Observer observer){
        observers.add(observer);
    }
    
    public void delete(Observer observer){
        observers.remove(observer);
    }
    
    abstract public void notifyObserver();
}
