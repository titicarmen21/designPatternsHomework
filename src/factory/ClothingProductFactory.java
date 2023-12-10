package factory;

import domain.ClothingProduct;
import domain.Product;

public class ClothingProductFactory implements ProductFactory {
    @Override
    public Product createProduct(String name, double price) {
        return new ClothingProduct(name, price);
    }
}