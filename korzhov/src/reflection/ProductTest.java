package reflection;

/**
 * Created by user on 25.02.2015.
 */
public class ProductTest {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        ProductManager productManager = new ProductManager();
        Product product = productManager.createProduct();
        System.out.println(product);
    }
}
