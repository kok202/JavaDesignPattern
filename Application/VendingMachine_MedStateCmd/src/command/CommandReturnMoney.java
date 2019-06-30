package command;

import colleague.MoneyManager;

public class CommandReturnMoney implements Command{
    private MoneyManager colleague;

    public CommandReturnMoney(MoneyManager colleague) {
        this.colleague = colleague;
    }

    @Override
    public void execute(int data) {
        if(colleague.getState().returnMoney() == false){
            System.out.println("돈이 들어있지 않습니다.");
            return;
        }
        
        System.out.println("돈이 반환 되었습니다.");
        colleague.setMoney(0);
        colleague.setStateNoMoney();
        colleague.send("moneyUpdated", colleague.getMoney());
    }
    
    
}
