package designpattern04_singletone;

public class DesignPattern04_Singletone {

    public static void main(String[] args) {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();
        
        speaker1.volume = 15;
        System.out.println(speaker1.volume);
        System.out.println(speaker2.volume);
        
        speaker1.volume = 25;
        System.out.println(speaker1.volume);
        System.out.println(speaker2.volume);
    }
    
}
