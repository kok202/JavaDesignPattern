package designpattern12_chainrespons2;

public class Defense_Armor implements Defense{

    private Defense nextDefense;
    private int defValue;

    public Defense_Armor() {
    }

    public Defense_Armor(int defValue) {
        this.defValue = defValue;
    }
    
    @Override
    public void defense(Attack attack) {
        process(attack);
        if(nextDefense != null)
            nextDefense.defense(attack);
    }
    
    public void process(Attack attack){
        int amount = attack.getAmount();
        amount -= defValue;
        attack.setAmount(amount);
        
    }

    public void setNextDefense(Defense nextDefense) {
        this.nextDefense = nextDefense;
    }
    
    
}
