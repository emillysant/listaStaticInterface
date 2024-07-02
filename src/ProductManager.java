import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private static List<Product> products = new ArrayList<>();

    public static void addProduct(Product product) {
        products.add(product);
    }
    public static void removeProduct(String productName) {
        products.removeIf(product -> product.getName().equalsIgnoreCase(productName));
    }
    public static List<Product> listProducts() {
        return new ArrayList<>(products);
    }

}
