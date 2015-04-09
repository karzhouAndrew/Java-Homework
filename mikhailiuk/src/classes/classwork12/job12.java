package classes.classwork12;

/**
 * Created by Natashka on 09.02.2015.
 */
public class job12 {
    public static void main(String[] args) {
        int degree = 0;
        for (int i = 0; Math.pow(100, i) <= Integer.MAX_VALUE; i++) {
            degree = i;
        }
        System.out.println(degree);
    }
}
