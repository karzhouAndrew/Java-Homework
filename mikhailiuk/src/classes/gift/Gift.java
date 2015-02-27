package classes.gift;

/**
 * Created by Natashka on 23.02.2015.
 */
public class Gift {
    private int itemsNumber;
    private int quantityAddedItems;
    private Confection[] items;

    public Gift(int itemsNumber) {
        items = new Confection[itemsNumber];
        this.itemsNumber = itemsNumber;
    }

    public int getItemsNumber() {
        return itemsNumber;
    }

    public void addItemToGift(Confection confection) {
        while (quantityAddedItems < itemsNumber) {
            items[quantityAddedItems] = confection;
            quantityAddedItems++;
        }
        return;
    }
}
