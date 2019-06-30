package command;

import colleague.ProductManager;
import product.Product;

public class CommandBuyProduct implements Command{
    private ProductManager colleague;

    public CommandBuyProduct(ProductManager colleague) {
        this.colleague = colleague;
    }

    @Override
    public void execute(int data) {
        if(data >= colleague.getProductList().size()){
            System.out.println("존재하지 않는 상품입니다.");
            return;
        }
        colleague.setRequestProductNum(data);
        Product target = colleague.getProductList().get(data);
        System.out.println(target.getName() + "를 사려고 시도합니다.");
        colleague.send("requestBuy", data);
    }
    
    
}
