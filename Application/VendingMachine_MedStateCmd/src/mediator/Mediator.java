package mediator;

import colleague.Colleague;
import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
    protected List<Colleague> colleagues;

    public Mediator() {
        colleagues = new ArrayList<>();
    }
    
    public boolean addColleague(Colleague colleague){
        if(colleagues != null)
            return colleagues.add(colleague);
        return false;
    }
    
    public abstract void mediate(String command, int num);
}
