package designpattern03_factorymethod;

import concrete.HpPotionCreater;
import concrete.MpPotionCreater;
import framework.Item;
import framework.ItemCreater;

public class DesignPattern03_FactoryMethod {
    public static void main(String[] args) {
        ItemCreater creater;
        
        creater = new HpPotionCreater();
        Item item1 = creater.create();
        item1.use();
        
        creater = new MpPotionCreater();
        Item item2 = creater.create();
        item2.use();
    }
}
