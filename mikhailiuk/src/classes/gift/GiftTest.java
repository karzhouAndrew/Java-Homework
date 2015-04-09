package classes.gift;

/**
 * Created by Natashka on 23.02.2015.
 */
public class GiftTest {
    public static void main(String[] args) {
        Candies candies=new Candies("Коровка",200,CandiesType.CHOCOLATE);
        Chocolate chocolate=new Chocolate("Alpen gold",80, "white");
        Wafers wafers=new Wafers("Bravo",100,true);
        System.out.println(chocolate.toString());
        System.out.println(candies.toString());
        System.out.println(wafers.toString());

    }
}
