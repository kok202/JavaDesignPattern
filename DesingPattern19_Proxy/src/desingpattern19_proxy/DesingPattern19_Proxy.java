package desingpattern19_proxy;

public class DesingPattern19_Proxy {

    public static void main(String[] args) {
        Subject real = new SubjectReal();
        Subject proxy = new SubjectProxy();
        real.action1();
        real.action2();
        proxy.action1();
        proxy.action2();
    }
    
}
