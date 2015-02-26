package reflection;

import java.util.Random;

/**
 * Created by user on 25.02.2015.
 */
@ProductInfo(id = "12345")
public class Product {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + "\'}";

    }
}
