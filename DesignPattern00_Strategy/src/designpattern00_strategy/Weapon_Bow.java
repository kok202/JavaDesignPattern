package designpattern00_strategy;

public class Weapon_Bow implements Weapon{

    @Override
    public void attack() {
        System.out.println("공격 : 활");
    }
    
}
