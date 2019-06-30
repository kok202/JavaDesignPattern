package state;

public class StateNoMoney implements State{

    @Override
    public boolean insertMoney(int money) {
        return true;
    }

    @Override
    public boolean returnMoney() {
        return false;
    }

    @Override
    public boolean chkMoneyExist() {
        return false;
    }
}
