package designpattern11_visitor;

public class ElementString extends Element{
    private String content;

    public ElementString(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
}
