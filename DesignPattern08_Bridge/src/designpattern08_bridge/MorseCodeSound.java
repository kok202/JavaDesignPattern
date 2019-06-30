package designpattern08_bridge;

public class MorseCodeSound implements MorseCode{

    public void dot(){
        System.out.print("삡");
    }
    public void dash(){
        System.out.print("삐");
    }
    public void space(){
        System.out.print("음");
    }
    
}
