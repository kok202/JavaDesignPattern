package colleague;

import command.Command;
import command.CommandBuyProduct;
import command.CommandMoneyUpdated;
import command.CommandResponseBuy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mediator.Mediator;
import product.Product;

public class ProductManager extends Colleague{
    private int requestProductNum;
    ArrayList<Product> productList;
    private Map<String, Command> handleMap;
    private Map<String, Command> commandMap;
    
    public ProductManager(Mediator mediator) {
        super(mediator);
        productList = new ArrayList<Product>();
        productList.add(new Product("Hwanta", 1000));
        productList.add(new Product("Cider ", 1100));
        productList.add(new Product("Milkis", 1200));
        
        handleMap = new HashMap<String, Command>();
        handleMap.put("moneyUpdated", new CommandMoneyUpdated(this));
        handleMap.put("responseBuy", new CommandResponseBuy(this));
        
        commandMap = new HashMap<String, Command>();
        commandMap.put("buyProduct", new CommandBuyProduct(this));
    }

    public int getRequestProductNum() {
        return requestProductNum;
    }

    public void setRequestProductNum(int requestProductNum) {
        this.requestProductNum = requestProductNum;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    @Override
    public void handle(String command, int num) {
        Command cmd = handleMap.get(command);
        if(cmd != null){
            cmd.execute(num);
        }
    }

    @Override
    public void command(String command, int num) {
        Command cmd = commandMap.get(command);
        if(cmd != null){
            cmd.execute(num);
        }
    }
    
    public void view(){
        System.out.println("============================");
        for(Product product : productList)
            System.out.print("| "+product.getName() + " ");
        System.out.println("|");
        for(Product product : productList)
            System.out.print("|  "+product.getPrice() + "  ");
        System.out.println("|");
        for(Product product : productList)
            if(product.isLed() == true)
                System.out.print("|  ****  ");
            else
                System.out.print("|        ");
        System.out.println("|");
        System.out.println("============================");
    }
    
}
