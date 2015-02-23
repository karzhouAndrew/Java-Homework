package gift;

/**
 * Created by user on 23.02.2015.
 */
public class Gift {

    private int itemsNumber;
    private int quantityAddedItems;
    private Confection[] items;

    public Gift(int itemsNumber) {
        items = new Confection[itemsNumber];
        this.itemsNumber = itemsNumber;
    }

    public void addItemToGift(Confection confection) {
        if (quantityAddedItems >= itemsNumber) {
            System.out.println("Твой подарок переполнен");
            return;
        }
        items[quantityAddedItems++] = confection;
    }

    public int getWeight() {
        int totalWeight = 0;
        for (Confection confection : items) {
            totalWeight += confection.getWeight();
        }
        return totalWeight;
    }

}
