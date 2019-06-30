package designpattern15_mediator;

public class MediatorChat extends Mediator{

    @Override
    public void mediate(String data) {
        for(Colleague colleague : colleagues)
            colleague.handle(data);
    }
    
}
