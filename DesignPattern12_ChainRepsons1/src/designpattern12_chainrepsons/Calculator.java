package designpattern12_chainrepsons;

public abstract class Calculator {
    private Calculator nextCalculator = null;
    
    public void setNextCalculator(Calculator nextCalculator){
        this.nextCalculator = nextCalculator;
    }
    
    public boolean process(Request request){
        if(operator(request)){
            return true;
        }else {
            if(nextCalculator == null)
                return false;
            return nextCalculator.process(request);
        }
    }
    
    protected abstract boolean operator(Request request);
}
