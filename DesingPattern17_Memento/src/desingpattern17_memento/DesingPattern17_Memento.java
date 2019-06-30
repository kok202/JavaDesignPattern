package desingpattern17_memento;

import memento.Memento;
import memento.Originator;
import java.util.Stack;

public class DesingPattern17_Memento {

    public static void main(String[] args) {
        Stack<Memento> mementos = new Stack<>();
        
        Originator originator = new Originator();
        originator.setState("state 1");
        mementos.push(originator.createMemento());
        originator.setState("state 2");
        mementos.push(originator.createMemento());
        originator.setState("state 3");
        mementos.push(originator.createMemento());
        
        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());
        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());
        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());
    }
    
}
