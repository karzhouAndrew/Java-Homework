package gift;

/**
 * Created by user on 23.02.2015.
 */
public class GiftTest {
    public static void main(String[] args) {
        Packager packager = new Packager("Valera", 80);
        Gift gift = packager.createGift(2);
        System.out.println(gift.getWeight());
    }
}
