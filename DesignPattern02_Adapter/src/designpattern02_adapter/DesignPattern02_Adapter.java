package designpattern02_adapter;

public class DesignPattern02_Adapter 
{

    public static void main(String[] args) {
        MathAdapter adapter = new MathAdaptee();
        System.out.println(adapter.twice(30f));
    }
    
}
