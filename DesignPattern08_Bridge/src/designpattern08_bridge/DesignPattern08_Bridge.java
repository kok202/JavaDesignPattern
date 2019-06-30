package designpattern08_bridge;

public class DesignPattern08_Bridge {

    public static void main(String[] args) {
        MCPrinter code = new MCPrinter(new MorseCodeDefault());
        code.k().o().k().num2().num0().num2();
        System.out.println("");
        
        code = new MCPrinter(new MorseCodeSound());
        code.k().o().k().num2().num0().num2();
        System.out.println("");
    }
    
}
