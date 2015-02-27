package training.recursion.other;

/**
 * Created by Рома on 25.02.2015.
 */
public class FactTest {
    public static void main(String[] args) {
        Fact fact = new Fact();
        int n =5;
        fact.factorial(n);
        System.out.println("fact.factorial(n) = " + fact.factorial(n));
    }
}
