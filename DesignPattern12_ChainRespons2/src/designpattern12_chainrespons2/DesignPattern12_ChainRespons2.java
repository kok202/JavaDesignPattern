
package designpattern12_chainrespons2;

public class DesignPattern12_ChainRespons2 {

    public static void main(String[] args) {
        Attack attack = new Attack(100);
        Defense_Armor armor1 = new Defense_Armor(10);
        Defense_Armor armor2 = new Defense_Armor(15);
        Defense_Armor armor3 = new Defense_Armor(){
            @Override
            public void defense(Attack attack){
                int amount = attack.getAmount();
                amount /= 2;
                attack.setAmount(amount);
            }
        };
        armor1.setNextDefense(armor2);
        armor2.setNextDefense(armor3);
        armor1.defense(attack);
        System.out.println(attack.getAmount());
    }
    
}
