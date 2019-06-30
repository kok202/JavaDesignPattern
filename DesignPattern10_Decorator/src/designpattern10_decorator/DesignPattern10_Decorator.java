package designpattern10_decorator;

import Coffee.Beverage;
import Coffee.BeverageAdding_Espresso;
import Coffee.BeverageAdding_Milk;
import Coffee.BeverageBase;
import java.util.Scanner;

public class DesignPattern10_Decorator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Beverage beverage = new BeverageBase();
        Boolean loop = true;
        while(loop){
            System.out.println("음료의 현재 가격 : " + beverage.getTotalPrice());
            System.out.println("1 : 에스프레소 / 2 : 우유 ");
            switch(scan.nextInt()){
            case 1:
                beverage = new BeverageAdding_Espresso(beverage);
                break;
            case 2:
                beverage = new BeverageAdding_Milk(beverage);
                break;
            default:
                loop = false;
                break;
            }
        }
        System.out.println("음료의 현재 가격 : " + beverage.getTotalPrice());
    }
    
}
