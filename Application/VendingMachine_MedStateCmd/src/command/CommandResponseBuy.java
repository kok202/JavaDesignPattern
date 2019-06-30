package command;

import colleague.ProductManager;
import product.Product;

public class CommandResponseBuy implements Command{
    private ProductManager colleague;

    public CommandResponseBuy(ProductManager colleague) {
        this.colleague = colleague;
    }

    @Override
    public void execute(int data) {
        Product target = colleague.getProductList().get(colleague.getRequestProductNum());
        if(target.getPrice() <= data){
            System.out.println(target.getName() + "를 구입하였습니다.");
            colleague.send("requestPayed", target.getPrice());
        }
        else{
            System.out.println("돈이 모자랍니다.");
        }
    }
}
