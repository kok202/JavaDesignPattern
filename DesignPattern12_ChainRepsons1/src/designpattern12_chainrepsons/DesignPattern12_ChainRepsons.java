package designpattern12_chainrepsons;

public class DesignPattern12_ChainRepsons {
    public static void main(String[] args) {
        Calculator plus = new CalculatorPlus();
        Calculator minus = new CalculatorMinus();
        
        plus.setNextCalculator(minus);
        Request request1 = new Request(1,2,"+");
        Request request2 = new Request(10,2,"-");
        plus.process(request1);
        plus.process(request2);
    }
    
}
