package desingpattern20_command;

import java.util.LinkedList;
import java.util.List;

public class DesingPattern20_Command {

    public static void main(String[] args) {
        List<Command> list = new LinkedList<>();
        list.add(new CommandWork(5));
        list.add(new CommandWork(2));
        list.add(new CommandWork(3));
        list.add(new CommandWork(10));
        
        for(int i = 0; i < list.size(); i++){
            list.get(i).execute();
        }
    }
    
}
