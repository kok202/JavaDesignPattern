package colleague;

import mediator.Mediator;

public abstract class Colleague {
    private Mediator mediator;
    
    public Colleague(Mediator mediator){
        this.mediator = mediator;
        this.mediator.addColleague(this);
    }
    
    public void send(String command, int num){
        mediator.mediate(command, num);
    }
    
    abstract public void handle(String command, int num);
    abstract public void command(String command, int num);
}
