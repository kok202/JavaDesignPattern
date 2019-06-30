package designpattern08_bridge;

public class MCPrinter extends MCDelegater{

    public MCPrinter(MorseCode morseCode) {
        super(morseCode);
    }
    
    //kok202
    public MCPrinter k(){
        dash(); dot(); dash(); space();
        return this;
    }
    
    public MCPrinter o(){
        dash(); dash(); dash(); space();
        return this;
    }
    
    public MCPrinter num2(){
        dot(); dot(); dash(); dash(); dash(); space();
        return this;
    }
    
    public MCPrinter num0(){
        dash(); dash(); dash(); dash(); dash(); space();
        return this;
    }
}
