package reflection;

import java.lang.annotation.Annotation;

/**
 * Created by user on 25.02.2015.
 */
public class ProductManager {

    public Product createProduct() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class<Product> clazz = Product.class;
        Product product =  clazz.newInstance();
        if(clazz.isAnnotationPresent(ProductInfo.class)){
            ProductInfo productAnnotation = clazz.getAnnotation(ProductInfo.class);
            product.setId(productAnnotation.id());
        }
        return product;

    }
}
