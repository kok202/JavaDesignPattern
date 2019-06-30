package calculation_enum;

import java.util.Scanner;
import operation.Operation;
import operation.OperationSet;

public class Calculation_Enum {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            int num1 = scan.nextInt();
            String op = scan.next();
            int num2 = scan.nextInt();
            Operation operate = OperationSet.getOperationByName(op);
            
            int result = operate.calc(num1, num2);
            System.out.println(result);
        }
    }
    
}
