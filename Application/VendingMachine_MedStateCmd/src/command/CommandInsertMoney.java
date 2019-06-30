package command;

import colleague.MoneyManager;

public class CommandInsertMoney implements Command{
    private MoneyManager colleague;

    public CommandInsertMoney(MoneyManager colleague) {
        this.colleague = colleague;
    }

    @Override
    public void execute(int data) {
        System.out.println("돈이 투입 되었습니다.");
        colleague.addMoney(data);
        colleague.setStateHasMoney();
        colleague.send("moneyUpdated", colleague.getMoney());
    }
    
    
}
