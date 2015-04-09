package workbook.labmath1;

import static java.lang.Math.*;

/**
 * Created by Natashka on 16.02.2015.
 */
public class MathCalc {
    private int x;
    private int t;
    private int s;

    public void setT(int t) {
        this.t = t;
    }

    public void setS(int s) {
        this.s = s;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double yCalc() {
        double y = (pow((cos(exp(x)) + exp(pow(x, 2)) + sqrt(1 / x)), 0.25)) / (pow((cos(PI * pow(x, 3)) + log(pow((x + 1), 2))), sin(x)));
        return y;
    }

    public double yCalc1() {
        double y = sin(pow(x, t)) / sqrt((1 + pow(x, s)));
        return y;
    }
}
