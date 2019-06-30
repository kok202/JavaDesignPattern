package designpattern01_templatemethod;

public class ConnectionDefault extends ConnectionHelper{

    @Override
    protected String doSecurity(String string) 
    {
        System.out.println("Default : do Security (nope)");
        return "----";
    }

    @Override
    protected boolean doAuthentication(String id, String password) 
    {
        System.out.println("Default : do Authentication");
        return true;
    }

    @Override
    protected void doConnection(String string) 
    {
        System.out.println("Default : do Connection");
    }
    
}
