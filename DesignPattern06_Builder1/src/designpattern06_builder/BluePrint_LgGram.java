package designpattern06_builder;

public class BluePrint_LgGram extends BluePrint{
    private Computer computer;
    
    public BluePrint_LgGram(){
        computer = new Computer("default", "default", "default");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i7");
    }

    @Override
    public void setRam() {
        computer.setRam("8g");
    }

    @Override
    public void setStorage() {
        computer.setStorage("256g ssd");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
    
}
