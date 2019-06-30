package designpattern06_builder2;

public class DesignPattern06_Builder2 {

    public static void main(String[] args) {
        Computer com = ComputerBuilder
                .start()
                .setCpu("i7")
                .setRam("8g")
                .setStorage("256g ssd")
                .build();
        System.out.println(com.toString());
    }
    
}
