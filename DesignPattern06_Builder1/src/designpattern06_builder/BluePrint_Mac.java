package designpattern06_builder;

public class BluePrint_Mac extends BluePrint{
    private Computer computer;
    
    public BluePrint_Mac(){
        computer = new Computer("default", "default", "default");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i8");
    }

    @Override
    public void setRam() {
        computer.setRam("16g");
    }

    @Override
    public void setStorage() {
        computer.setStorage("512g ssd");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
    
}
