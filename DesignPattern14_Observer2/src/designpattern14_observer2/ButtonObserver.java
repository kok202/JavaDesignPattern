package designpattern14_observer2;

import java.util.Observable;
import java.util.Observer;

public class ButtonObserver implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observer catch onClickSignal " + o);
    }
    
}
