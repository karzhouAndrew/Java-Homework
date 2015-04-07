package added.lab6;

import static java.lang.Math.*;

/**
 * Created by Sam on 21.02.2015.
 * Написать программу, вычисляющую значение функции для различных
 * значений аргумента x, задавая его как целое число.
 * Даны две формулы
 */
public class CalcFunc {
    public static void main(String[] args) {

        int valX = 5;
        int valT = 6;
        int valS = 2;
        double resY = calcFirst(valX);
        System.out.println("Result 1 = " + resY);
        resY = calcSecond(valX, valT, valS);
        System.out.println("Result 2 = " + resY);
    }

    private static double calcFirst(int valX) {
        double resY;
        double val1 = cos(pow(E, valX)) + pow(E, pow(valX, 2)) + sqrt(1 / valX);
        val1 = pow(val1, 0.25);
        double val2 = pow((cos(PI * pow(valX, 3)) + log(pow(1 + valX, 2))), sin(valX));
        resY = val1 / val2;
        return resY;
    }

    private static double calcSecond(int valX, int valT, int valS) {
        double resY;
        double val1 = pow(sin(pow(valX, valT)), 2);
        double val2 = sqrt(1 + pow(valX, valS));
        resY = val1 / val2;
        return resY;
    }

}
