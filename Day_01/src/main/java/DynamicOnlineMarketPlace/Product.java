package DynamicOnlineMarketPlace;

abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - " + name + ": $" + price;
    }
}
class Books extends Product{
    public Books(String name, double price) {
        super(name, price);
    }
}
class Clothing extends Product{
    public Clothing(String name, double price) {
        super(name, price);
    }
}
class Gadgets extends Product{
    public Gadgets(String name, double price) {
        super(name, price);
    }
}
