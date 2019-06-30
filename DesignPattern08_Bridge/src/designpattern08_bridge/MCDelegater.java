package designpattern08_bridge;

public class MCDelegater {
    private MorseCode morseCode;

    public MCDelegater(MorseCode morseCode) {
        this.morseCode = morseCode;
    }
    
    public void dot(){
        morseCode.dot();
    }
    public void dash(){
        morseCode.dash();
    }
    public void space(){
        morseCode.space();
    }
}
