package factory;

import domain.Product;

public interface ProductFactory {    //use factory design pattern
    Product createProduct(String name, double price);
}