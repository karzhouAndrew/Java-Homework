package gift;

import java.util.Random;

/**
 * Created by user on 23.02.2015.
 */
public class Packager {

    private final NamesGenerator namesGenerator = new NamesGenerator();
    private String name;
    private int level;

    public Packager() {
        name = NamesGenerator.generateName();
    }

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

    @Override
    public String toString() {
        return "Packager{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
