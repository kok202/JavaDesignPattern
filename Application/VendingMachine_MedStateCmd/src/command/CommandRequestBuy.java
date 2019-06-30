package command;

import colleague.MoneyManager;

public class CommandRequestBuy implements Command{
    private MoneyManager colleague;

    public CommandRequestBuy(MoneyManager colleague) {
        this.colleague = colleague;
    }

    @Override
    public void execute(int data) {
        if(colleague.getState().chkMoneyExist() == false){
            System.out.println("돈을 먼저 넣어주세요.");
            return;
        }
        colleague.send("responseBuy", colleague.getMoney());
    }
    
    
}
