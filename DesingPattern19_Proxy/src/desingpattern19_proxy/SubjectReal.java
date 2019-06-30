package desingpattern19_proxy;

public class SubjectReal implements Subject{

    @Override
    public void action1() {
        System.out.println("간단한 업무 by real");
    }

    @Override
    public void action2() {
        System.out.println("복잡한 업무 by real");
    }
    
}
