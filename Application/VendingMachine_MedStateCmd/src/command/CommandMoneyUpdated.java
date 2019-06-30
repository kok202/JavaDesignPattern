package command;

import colleague.ProductManager;
import product.Product;

public class CommandMoneyUpdated implements Command{
    private ProductManager colleague;

    public CommandMoneyUpdated(ProductManager colleague) {
        this.colleague = colleague;
    }

    @Override
    public void execute(int data) {
        for(Product product : colleague.getProductList()){
            if(product.getPrice() <= data){
                product.setLed(true);
            }else{
                product.setLed(false);
            }
        }
    }
    
    
}
