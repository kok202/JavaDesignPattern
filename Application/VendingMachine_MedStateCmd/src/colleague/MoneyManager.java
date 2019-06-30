package colleague;

import command.Command;
import command.CommandInsertMoney;
import command.CommandRequestBuy;
import command.CommandRequestPayed;
import command.CommandReturnMoney;
import java.util.HashMap;
import java.util.Map;
import mediator.Mediator;
import state.State;
import state.StateHasMoney;
import state.StateNoMoney;

public class MoneyManager extends Colleague {
    private int possessMoney;
    private State currentState;
    private StateHasMoney stateHasMoney;
    private StateNoMoney stateNoMoney;
    private Map<String, Command> handleMap;
    private Map<String, Command> commandMap;

    public MoneyManager(Mediator mediator) {
        super(mediator);
        possessMoney = 0;
        stateHasMoney = new StateHasMoney();
        stateNoMoney = new StateNoMoney();
        currentState = stateNoMoney;
        
        handleMap = new HashMap<String, Command>();
        handleMap.put("requestBuy", new CommandRequestBuy(this));
        handleMap.put("requestPayed", new CommandRequestPayed(this));
        
        commandMap = new HashMap<String, Command>();
        commandMap.put("insertMoney", new CommandInsertMoney(this));
        commandMap.put("returnMoney", new CommandReturnMoney(this));
    }
    
    public void addMoney(int money){
        possessMoney += money;
    }
    
    public int getMoney(){
        return possessMoney;
    }
    
    public void setMoney(int money){
        possessMoney = money;
    }
    
    public State getState(){
        return currentState;
    }
    
    public void setStateHasMoney(){
        currentState = stateHasMoney;
    }
    
    public void setStateNoMoney(){
        currentState = stateNoMoney;
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
}
