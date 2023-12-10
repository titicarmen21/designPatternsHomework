package domain;

public abstract class ProductBase implements Product {
    protected String name;
    protected double price;

    public ProductBase(String name, double price) {
        this.name = name;
        this.price = price;
    }
}