package designpattern15_mediator;

public class ColleagueChat extends Colleague {

    @Override
    public void handle(String data) {
        System.out.println(this.getClass()+ "\t" + data);
    }
    
}
