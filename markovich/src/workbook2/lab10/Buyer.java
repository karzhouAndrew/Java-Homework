package workbook2.lab10;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Buyer {
    private String name;
    private Map<Product, Integer> productList;

    public Buyer() {
        this.name = generateBuyerName();
        this.productList = generateProductsList();
    }

    public String getName() {
        return name;
    }

    public Map<Product, Integer> getProductList() {
        return productList;
    }

    private String generateBuyerName() {
        Random random = new Random();
        return BuyerNames.values()[random.nextInt(BuyerNames.values().length)].toString();
    }

    private Map<Product, Integer> generateProductsList() {
        Map<Product, Integer> prodList = new HashMap<>();
        for (int i = 0; i < randBetween(1, 11); i++) {
            prodList.put(new Product(), randBetween(1, 5));
        }
        return prodList;
    }

    private int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    @Override
    public String toString() {
        return "\nBuyer / name - " + name + ", productList = " + productList;
    }
}
