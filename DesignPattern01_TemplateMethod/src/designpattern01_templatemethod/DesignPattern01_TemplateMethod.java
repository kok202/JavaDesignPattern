package designpattern01_templatemethod;

public class DesignPattern01_TemplateMethod {

    public static void main(String[] args) {
        ConnectionHelper helper = new ConnectionDefault();
        int connection = 1;
        switch(connection)
        {
            case 0:
                helper = new ConnectionDefault();
                break;
            case 1:
                helper = new ConnectionSecurity();
                break;
        }
        helper.requestConnection("인코드 정보");
    }
    
}
