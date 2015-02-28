package classwork.calculationFormulas;

import static java.lang.Math.*;


/**
 * Created by Leonid on 17.02.2015.
 */
public class Formula2 {


    public void formula2(double x, double t, double s) {
        double f = sin(pow(x, t));
        double y = pow(f, 2) / sqrt(1 + pow(x, s));
        System.out.println("Ответ " + y);
    }
}
