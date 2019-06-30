package designpattern09_composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{
    List<Component> children = new ArrayList<>();

    public Folder(String fileName) {
        super(fileName);
    }
    
    public boolean addComponent(Component component){
        return children.add(component);
    }
    
    public boolean removeComponent(Component component){
        return children.remove(component);
    }
    
    public Component getChild(int index){
        return children.get(index);
    }
}
