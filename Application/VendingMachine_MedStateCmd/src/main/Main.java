
package main;

import java.util.Scanner;
import mediator.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine drinkMachine = new VendingMachine();
        
        // insertMoney 1000
        // returnMoney 0
        // buyProduct 0
        Scanner scan = new Scanner(System.in);
        while(true){
            drinkMachine.view();
            String command = scan.next();
            int num = scan.nextInt();
            drinkMachine.command(command, num);
        }
    }
    
}
