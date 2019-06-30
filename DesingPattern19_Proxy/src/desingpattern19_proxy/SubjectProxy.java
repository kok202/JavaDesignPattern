package desingpattern19_proxy;

public class SubjectProxy implements Subject{
    private Subject real;

    public SubjectProxy() {
        real = new SubjectReal();
    }
    
    @Override
    public void action1() {
        System.out.println("간단한 업무 by proxy");
    }

    @Override
    public void action2() {
        real.action2();
    }
    
}
