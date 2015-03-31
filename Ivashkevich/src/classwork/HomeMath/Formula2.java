package classwork.HomeMath;

import static java.lang.Math.*;


/**
 * Created by Leonid on 17.02.2015.
 */
public class Formula2 {
    double y;

    public double formula2(double x, double t, double s) {
        double f = sin(pow(x, t));
        return y = pow(f, 2) / sqrt(1 + pow(x, s));
    }
}
