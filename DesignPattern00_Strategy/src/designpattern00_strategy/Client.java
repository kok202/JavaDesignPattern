package designpattern00_strategy;

public class Client {
    public Weapon myWeapon;
    
    public void setWeapon(Weapon weapon)
    {
        myWeapon = weapon;
    }
    
    public void attack()
    {
        if(myWeapon != null)
        {
            // 델리게이트
            myWeapon.attack();
        }
        else
        {
            System.out.println("맨손 공격");
        }
    }
}
