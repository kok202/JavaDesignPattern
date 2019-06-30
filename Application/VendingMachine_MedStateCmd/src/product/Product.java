package product;

public class Product {
    private String name;
    private int price;
    private boolean led;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        led = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isLed() {
        return led;
    }

    public void setLed(boolean led) {
        this.led = led;
    }
    
}
