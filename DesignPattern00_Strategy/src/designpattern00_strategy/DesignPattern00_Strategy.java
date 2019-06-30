package designpattern00_strategy;

public class DesignPattern00_Strategy {

    public static void main(String[] args) {
        Client user = new Client();
        user.attack();
        user.setWeapon(new Weapon_Bow());
        user.attack();
        user.setWeapon(new Weapon_Sword());
        user.attack();
        user.setWeapon(new Weapon_Axe());
        user.attack();
    }
    
}
