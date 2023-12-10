import domain.Product;
import domain.Store;
import factory.ClothingProductFactory;
import factory.ElectronicsProductFactory;
import factory.ProductFactory;

public class Main {
    public static void main(String[] args) {

        Store storeConfig = Store.getInstance();
        storeConfig.setStoreName("Mixed Store");
        storeConfig.setCurrency("RON");

        ProductFactory electronicsFactory = new ElectronicsProductFactory();
        ProductFactory clothingFactory = new ClothingProductFactory();

        //creeare produs
        Product electronicProduct = electronicsFactory.createProduct("Laptop", 1229.99);
        Product clothingProduct1 = clothingFactory.createProduct("Dress", 60.00);
        Product clothingProduct2 = clothingFactory.createProduct("Skirt", 52.00);

        // afișare produse
        electronicProduct.display();
        clothingProduct1.display();
        clothingProduct2.display();
    }
}