package classes.classwork2;

/**
 * Created by Natashka on 10.02.2015.
 */
public class job2 {
    public static void main(String[] args) {
        double a = 100.025;
        double b = 147.3245;
        double c = 42.032;
        double d = 2.896;
        if (a <= b && b <= c && c <= d) {
            a = b = c = d;
        } else if (a > b && b > c && c > d) {

        } else {
            a *= a;
            b *= b;
            c *= c;
            d *= d;
        }
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}


