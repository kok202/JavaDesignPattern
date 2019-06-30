package designpattern06_builder;

public class DesignPattern06_Builder {

    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        Computer computer;
        
        factory.setBluePrint(new BluePrint_LgGram());
        factory.make();
        computer = factory.getComputer();
        System.out.println(computer.toString());
        
        factory.setBluePrint(new BluePrint_Mac());
        factory.make();
        computer = factory.getComputer();
        System.out.println(computer.toString());
    }
    
}
