package workbook2.lab10;

import java.util.Random;

public class Product {
    private String name;

    public Product() {
        this.name = generateProductName();
    }

    public String getName() {
        return name;
    }

    private String generateProductName() {
        Random random = new Random();
        return ProductNames.values()[random.nextInt(ProductNames.values().length)].toString();
    }

    @Override
    public String toString() {
        return "Product - " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (name != null ? !name.equals(product.name) : product.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
