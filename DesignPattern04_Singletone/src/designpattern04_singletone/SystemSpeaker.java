package designpattern04_singletone;

public class SystemSpeaker {
    static private SystemSpeaker instance;
    public int volume = 5;
    
    private SystemSpeaker(){
        
    }
    
    public static SystemSpeaker getInstance(){
        if(instance == null){
            instance = new SystemSpeaker();
            System.out.println("새로 생성");
        }
        else {
            System.out.println("이미 생성");
        }
        return instance;
    }
}
