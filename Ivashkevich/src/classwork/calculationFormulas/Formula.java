package classwork.calculationFormulas;

import static java.lang.Math.*;

/**
 * Created by Leonid on 17.02.2015.
 */
public class Formula {


    public void formula(double x) {
        //numerator
        double a = cos(pow(E, x));
        double b = pow(E, pow(x, 2));
        double c = sqrt(1 / x);
        //denominator
        double d = cos(PI * pow(x, 3));
        double e = log(pow((1 + x), 2));

        double y = pow((a + b + c), 0.25) / pow((d + e), sin(x));
        System.out.println("Ответ " + y);
    }
}
