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


}
