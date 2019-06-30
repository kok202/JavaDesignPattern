package designpattern11_visitor;

import java.util.ArrayList;

public class DesignPattern11_Visitor {

    public static void main(String[] args) {
        VisitorXMLViewer xmlViewer = new VisitorXMLViewer();
        VisitorJSONViewer jsonViewer = new VisitorJSONViewer();
        ElementInteger element1 = new ElementInteger(20181021);
        ElementString element2 = new ElementString("하루 맑음");
        element1.accept(xmlViewer);
        element2.accept(xmlViewer);
        element1.accept(jsonViewer);
        element2.accept(jsonViewer);
    }
    
}
