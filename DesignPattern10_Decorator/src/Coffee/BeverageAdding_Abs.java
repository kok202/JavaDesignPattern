package Coffee;

public abstract class BeverageAdding_Abs implements Beverage{
    private Beverage currentBeverage;
    
    public BeverageAdding_Abs(Beverage currentBeverage){
        super();
        this.currentBeverage = currentBeverage;
    }
    
    @Override
    public int getTotalPrice() {
        return currentBeverage.getTotalPrice();
    }
    
    protected Beverage getCurrentBeverage(){
        return currentBeverage;
    }
}
