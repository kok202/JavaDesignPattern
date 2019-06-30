package designpattern00_strategy;

public class Weapon_Sword implements Weapon{

    @Override
    public void attack() {
        System.out.println("공격 : 검");
    }
    
}
