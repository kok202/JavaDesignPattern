package designpattern14_observer1;

public class DesignPattern14_Observer1 {

    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(new OnClickListenerButton());
        button.onClick();
    }
    
}
