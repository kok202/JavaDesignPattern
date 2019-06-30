package mediator;

import colleague.Colleague;
import colleague.MoneyManager;
import colleague.ProductManager;

public class VendingMachine extends Mediator{
    MoneyManager moneyManager = new MoneyManager(this);
    ProductManager productManager = new ProductManager(this);
    
    @Override
    public void mediate(String command, int num) {
        for(Colleague colleague : colleagues)
            colleague.handle(command, num);
    }
    
    public void view(){
        productManager.view();
    }
    
    public void command(String command, int num){
        for(Colleague colleague : colleagues)
            colleague.command(command, num);
    }
}
