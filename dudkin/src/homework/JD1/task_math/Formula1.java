package homework.JD1.task_math;

import static java.lang.Math.*;

/**
 * Created by Admin on 15.02.2015.
 */

public class Formula1 {
    final double PI = 3.14159;
    double y;

    public double test1(double x) {
        double numerator;
        double denominator;
        numerator = sqrt(sqrt(cos(exp(pow(x, 2))) + exp(pow(x, 2)) + sqrt(1 / x)));
        denominator = pow((cos(PI * pow(x, 3))) + log(pow(1 + x, 3)), sin(x));
        y = numerator / denominator;
        return y;
    }
}