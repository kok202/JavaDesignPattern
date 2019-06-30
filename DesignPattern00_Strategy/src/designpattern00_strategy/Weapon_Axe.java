package designpattern00_strategy;

public class Weapon_Axe implements Weapon{

    @Override
    public void attack() {
        System.out.println("공격 : 도끼");
    }
    
}
