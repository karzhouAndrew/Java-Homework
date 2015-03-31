package classwork.HomeMath;

import static java.lang.Math.*;

/**
 * Created by Leonid on 17.02.2015.
 */
public class Formula {
    double y;

    public double formula(double x) {
        //numerator
        double a = cos(pow(E, x));
        double b = pow(E, pow(x, 2));
        double c = sqrt(1 / x);
        //denominator
        double d = cos(PI * pow(x, 3));
        double e = log(pow((1 + x), 2));

        return y = pow((a + b + c), 0.25) / pow((d + e), sin(x));
    }
}
