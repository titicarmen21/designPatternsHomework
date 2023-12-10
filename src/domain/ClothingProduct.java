package domain;

public class ClothingProduct extends ProductBase {
    public ClothingProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.println("Clothing product: " + name + " --> Price: " + price + " " + Store.getInstance().getCurrency());
    }
}