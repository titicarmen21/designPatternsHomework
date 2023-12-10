package factory;

import domain.ElectronicsProduct;
import domain.Product;

public class ElectronicsProductFactory implements ProductFactory {
    @Override
    public Product createProduct(String name, double price) {
        return new ElectronicsProduct(name, price);
    }
}