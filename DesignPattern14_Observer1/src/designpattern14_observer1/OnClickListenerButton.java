package designpattern14_observer1;

public class OnClickListenerButton implements OnClickListener{

    @Override
    public void onClick(Button button) {
        System.out.println(button + " s Clicked!");
    }
    
}
