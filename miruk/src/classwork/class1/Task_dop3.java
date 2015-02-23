package classwork.class1;

/**
 * Определить, какую наибольшую степень числа 100 можно вычислить, пользуясь типом int
 */
public class Task_dop3 {
    public static void main(String[] args) {
        final int number = 100;
        int step = 0;
        int result = 0;

        while (result < Integer.MAX_VALUE) {
            result = (int) Math.pow(number, step);
            step++;
        }

        System.out.println(step);

    }
}
