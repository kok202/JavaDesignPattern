package designpattern12_chainrepsons;

public class CalculatorPlus extends Calculator{

    @Override
    protected boolean operator(Request request) {
        if(request.getOperator().equals("+")){
            int result = request.getA() + request.getB();
            System.out.println(result);
            return true;
        }
        return false;
    }
    
}
