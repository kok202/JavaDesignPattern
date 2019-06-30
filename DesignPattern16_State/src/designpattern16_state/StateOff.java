package designpattern16_state;

public class StateOff implements State{
    public void on(){
        System.out.println("불 켜짐");
    }
    public void off(){
        System.out.println("동작 안함");
    }
}
