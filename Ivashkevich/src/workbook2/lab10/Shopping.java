package workbook2.lab10;

import java.util.HashMap;

/**
 * Created by Leonid on 03.04.2015.
 */
public enum Shopping {
    BREAD, LOAF, OIL, PASTA, TOOTHPASTE, RAZOR, SOAP_BAR, MEAT, SAUSAGE, MILK;

    public static void getShopping(HashMap<String, Integer> shoppingList) {

        int positionNamePurchase;
        int price;
        for (int i = 0; i < Shopping.values().length - 4; i++) {
            int temp = (int) (Math.random() * 15000 + 5000);
            price = (temp - temp % 50);
            positionNamePurchase = (int) (Math.random() * 9);
            shoppingList.put(String.valueOf(Shopping.values()[positionNamePurchase]), price);
        }

    }
}
