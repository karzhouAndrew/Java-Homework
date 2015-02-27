package workbook.lab23;

/**
 * Created by Asus on 21.02.2015.
 */
import static java.lang.Math.*;
public class Formula {
    public static void main(String[] args) {
        double y;
        double x = 2;
        double t = 3;
        double s = 2.5;
        double e = 4;
        y = pow(sin(pow(x, t)), 2)/ sqrt(1 + pow(x, s));
        System.out.println(y);
        y = pow(((cos(pow(e, x))) + pow(e, pow(x, 2)) + sqrt(1/x)),(0.25))/ pow((cos(PI * pow(x, 3)) + log10(pow((1 + x), 2))), sin(x));
        System.out.println(y);
    }
}
