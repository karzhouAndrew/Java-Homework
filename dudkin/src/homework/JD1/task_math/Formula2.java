package homework.JD1.task_math;

/**
 * Created by Admin on 15.02.2015.
 */

import static java.lang.Math.*;

public class Formula2 {
    double y;

    public double test2(double x, double t, double s) {
        y = pow(sin(pow(x, t)), 2) / sqrt(1 + pow(x, s));
        return y;
    }
}
