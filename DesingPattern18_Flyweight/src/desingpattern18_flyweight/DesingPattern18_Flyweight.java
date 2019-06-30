package desingpattern18_flyweight;

public class DesingPattern18_Flyweight {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        
        Flyweight flyweight = factory.getFlyweight("A");
        flyweight = factory.getFlyweight("B");
        flyweight = factory.getFlyweight("A");
        flyweight = factory.getFlyweight("C");
    }
    
}
