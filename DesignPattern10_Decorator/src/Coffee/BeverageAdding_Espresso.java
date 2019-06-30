package Coffee;

public class BeverageAdding_Espresso extends BeverageAdding_Abs{
    private static int count = 0;
    
    public BeverageAdding_Espresso(Beverage currentBeverage){
        super(currentBeverage);
    }
    
    @Override
    public int getTotalPrice() {
        return getCurrentBeverage().getTotalPrice() + getAddPrice();
    }
    
    private int getAddPrice(){
        count++;
        if(count > 1){
            return 700;
        }
        return 1000;
    }
}
