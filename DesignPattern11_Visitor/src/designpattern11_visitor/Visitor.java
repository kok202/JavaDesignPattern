package designpattern11_visitor;

public abstract class Visitor {
    abstract public void visit(ElementInteger element);
    abstract public void visit(ElementString element);
}
