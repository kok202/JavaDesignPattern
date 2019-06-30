package command;

import colleague.MoneyManager;

public class CommandRequestPayed implements Command{
    private MoneyManager colleague;

    public CommandRequestPayed(MoneyManager colleague) {
        this.colleague = colleague;
    }

    @Override
    public void execute(int data) {
        colleague.addMoney(-data);
        if(colleague.getMoney() <= 0){
            colleague.setStateNoMoney();
        }
        colleague.send("moneyUpdated", colleague.getMoney());
    }
    
    
}
