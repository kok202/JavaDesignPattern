package state;

public interface State {
    public boolean insertMoney(int money);
    public boolean returnMoney();
    public boolean chkMoneyExist();
}
