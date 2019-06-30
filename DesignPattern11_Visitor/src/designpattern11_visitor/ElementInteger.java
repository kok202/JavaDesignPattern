package designpattern11_visitor;

public class ElementInteger extends Element{
    private int value;

    public ElementInteger(int image) {
        this.value = image;
    }

    public int getValue() {
        return value;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
}
