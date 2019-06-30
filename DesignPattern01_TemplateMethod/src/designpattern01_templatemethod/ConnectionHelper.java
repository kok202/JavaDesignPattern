package designpattern01_templatemethod;

public abstract class ConnectionHelper {
    protected abstract String doSecurity(String string);
    protected abstract boolean doAuthentication(String id, String password);
    protected abstract void doConnection(String string);
    
    public String requestConnection(String encode)
    {
        String decode = doSecurity(encode);
        if(!doAuthentication("AAA", "123"))
            return "request Fail";
        doConnection("userName");
        return "request Success";
    }
}
