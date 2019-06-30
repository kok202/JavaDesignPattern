package designpattern11_visitor;

import java.util.ArrayList;

public class VisitorXMLViewer extends Visitor{
    @Override
    public void visit(ElementInteger element) {
        System.out.println("<data>" + element.getValue() + "</data>");
    }

    @Override
    public void visit(ElementString element) {
        System.out.println("<data>" + element.getContent() + "</data>");
    }
}
