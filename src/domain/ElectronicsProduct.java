package domain;

public class ElectronicsProduct extends ProductBase {
    public ElectronicsProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.println("Electronic product: " + name + " --> Price: " + price + " " + Store.getInstance().getCurrency());
    }
}
