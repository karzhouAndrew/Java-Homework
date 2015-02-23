package gift;

/**
 * Created by user on 23.02.2015.
 */
public class Packager {

    private String name;
    private int level;

    public Packager(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public Gift createGift(int itemsNumber) {
        Gift gift = new Gift(itemsNumber);
        gift.addItemToGift(new Candies("Коровка", 200, CandiesType.CHOCOLATE));
        gift.addItemToGift(new Chocolate("AlpenGold", 80, "White"));
        gift.addItemToGift(new Wafers("Bravo", 300, true));
        return gift;
    }

    public int weightGift(Gift gift) {
        int totalWeight = 0;
        for (Confection confection : gift.getItems()) {
            totalWeight += confection.getWeight();
        }
        return totalWeight;
    }
}
