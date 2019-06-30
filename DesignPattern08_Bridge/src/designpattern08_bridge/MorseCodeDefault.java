package designpattern08_bridge;

public class MorseCodeDefault implements MorseCode{

    public void dot(){
        System.out.print(".");
    }
    public void dash(){
        System.out.print("-");
    }
    public void space(){
        System.out.print(" ");
    }
    
}
