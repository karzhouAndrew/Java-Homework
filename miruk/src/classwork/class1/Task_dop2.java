package classwork.class1;

import java.util.Scanner;

/**
 * Даны вещественные числа a, b, c, d. Если a <= b <= c <= d, то каждое число заменить наибольшим, если
 * a > b > c > d, то числа оставить без изменений, в противном случае – все числа заменить их квадратами.
 */
public class Task_dop2 {
    public static void main(String[] args) {
        float a, b, c, d;
        System.out.print("Введите вещественные числа: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextFloat();
        sc.close();
        if ((b >= a) && (c >= b) && (d >= c)) {
            float max = d;
            a = max;
            b = max;
            c = max;
        } else if ((a > b) && (b > c) && (c > d)) {
        } else {
            a *= a;
            b *= b;
            c *= c;
            d *= d;
        }
        System.out.println(a + ", " + b + ", " + c + ", " + d);
    }
}
