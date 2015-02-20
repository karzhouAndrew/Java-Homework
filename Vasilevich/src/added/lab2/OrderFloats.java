package added.lab2;

/**
 * Created by Sam on 21.02.2015.
 * Даны вещественные числа a, b, c, d. Если a <= b <= c <= d, то каждое число заменить наибольшим,
 * если  a > b > c > d,  то числа оставить без изменений,  в противном случае – все числа заменить их квадратами.
 */
public class OrderFloats {
    public static void main(String[] args) {
        double val1 = 12.12;
        double val2 = 44.23;
        double val3 = 34.34;
        double val4 = 45.45;

        if ((val1 <= val2) && (val2 <= val3) && (val3 <= val4)) {
            val1 = val2 = val3 = val4;
        } else {
            if ((val1 > val2) && (val2 > val3) && (val3 > val4)) {

            } else {
                val1 *= val1;
                val2 *= val2;
                val3 *= val3;
                val4 *= val4;
            }
        }
        System.out.println("val1 = " + val1 + "\nval2 = " + val2 + "\nval3 = " + val3 + "\nval4 = " + val4);

    }
}
