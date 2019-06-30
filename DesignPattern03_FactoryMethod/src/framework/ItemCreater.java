package framework;

public abstract class ItemCreater {
    abstract protected void requestItemsInfo();
    abstract protected void createItemLog();
    abstract protected Item createItem();
    
    public Item create(){
        requestItemsInfo();
        Item item = createItem();
        createItemLog();
        return item;
    }
    
}
