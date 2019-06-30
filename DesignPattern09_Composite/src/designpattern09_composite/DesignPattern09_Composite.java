package designpattern09_composite;

public class DesignPattern09_Composite {

    public static void main(String[] args) {
        Folder root = new Folder("root");
        Folder home = new Folder("home");
        Folder kok202 = new Folder("kok202");
        Folder music = new Folder("music");
        Folder picture = new Folder("picture");
        
        File pic1 = new File("pic1");
        File pic2 = new File("pic2");
        File pic3 = new File("pic3");
        File music1 = new File("music1");
        File music2 = new File("music2");
        
        root.addComponent(home);
        home.addComponent(kok202);
        kok202.addComponent(music);
        kok202.addComponent(picture);
        music.addComponent(music1);
        music.addComponent(music2);
        picture.addComponent(pic1);
        picture.addComponent(pic2);
        picture.addComponent(pic3);
        
    }
}
