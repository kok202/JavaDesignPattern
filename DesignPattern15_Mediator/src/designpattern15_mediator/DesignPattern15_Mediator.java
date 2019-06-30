package designpattern15_mediator;

public class DesignPattern15_Mediator {

    public static void main(String[] args) {
        Mediator mediator = new MediatorChat();
        
        Colleague colleague1 = new ColleagueChat();
        Colleague colleague2 = new ColleagueChat();
        Colleague colleague3 = new ColleagueChat();
        
        colleague1.join(mediator);
        colleague2.join(mediator);
        colleague3.join(mediator);
        
        colleague1.sendData("AAA");
        colleague2.sendData("BBB");
        colleague3.sendData("CCC");
        
    }
    
}
