package state;

public class StateHasMoney implements State{

    @Override
    public boolean insertMoney(int money) {
        return true;
    }

    @Override
    public boolean returnMoney() {
        return true;
    }

    @Override
    public boolean chkMoneyExist() {
        return true;
    }
}
