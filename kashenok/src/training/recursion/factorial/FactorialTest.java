package training.recursion.factorial;

import training.recursion.factorial.Factorial;

/**
 * Created by Рома on 25.02.2015.
 */
public class FactorialTest {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        int n=8;
        fact.factorial(n);
        System.out.println("fact = " + fact.factorial(n));
    }
}
