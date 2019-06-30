package designpattern16_state;

public class StateOn implements State{
    public void on(){
        System.out.println("동작 안함");
    }
    public void off(){
        System.out.println("불 꺼짐");
    }
}
