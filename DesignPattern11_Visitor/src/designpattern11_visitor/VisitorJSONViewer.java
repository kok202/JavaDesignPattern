package designpattern11_visitor;

import java.util.ArrayList;

public class VisitorJSONViewer extends Visitor{
    @Override
    public void visit(ElementInteger element) {
        System.out.println("{data:" + element.getValue() + "}");
    }

    @Override
    public void visit(ElementString element) {
        System.out.println("{data:" + element.getContent() + "}");
    }
}
