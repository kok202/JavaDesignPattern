package Coffee;

public class BeverageAdding_Milk extends BeverageAdding_Abs{
    public BeverageAdding_Milk(Beverage currentBeverage){
        super(currentBeverage);
    }
    
    @Override
    public int getTotalPrice() {
        return getCurrentBeverage().getTotalPrice() + 1000;
    }
}
