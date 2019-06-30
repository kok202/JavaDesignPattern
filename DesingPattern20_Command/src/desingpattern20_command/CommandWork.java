package desingpattern20_command;

public class CommandWork implements Command{
    public int data;

    public CommandWork(int data) {
        this.data = data;
    }
    
    public void execute(){
        System.out.println(data + " was called");
    }
}
