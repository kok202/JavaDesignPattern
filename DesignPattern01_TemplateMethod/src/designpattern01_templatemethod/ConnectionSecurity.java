package designpattern01_templatemethod;

public class ConnectionSecurity extends ConnectionHelper{

    @Override
    protected String doSecurity(String string) 
    {
        System.out.println("Security : do Security");
        return "----";
    }

    @Override
    protected boolean doAuthentication(String id, String password) 
    {
        System.out.println("Security : do Authentication");
        return true;
    }

    @Override
    protected void doConnection(String string) 
    {
        System.out.println("Security : do Connection");
    }
    
}
