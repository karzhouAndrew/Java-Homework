package added.lab3;

/**
 * Created by Sam on 21.02.2015.
 * Определить, какую наибольшую степень числа 100 можно вычислить, пользуясь типом int.
 */

public class MaxPow {
    public static void main(String[] args) {
        double maxInt = Integer.MAX_VALUE;
        double modVal = 100;
        double res = 0;
        int powVal = 0;
        while (res < maxInt) {
            powVal++;
            res = Math.pow(modVal, powVal);
        }
        powVal--;
        res = Math.pow(modVal, powVal);
        System.out.println("Max int = " + maxInt + "\nRes val = " + res);
        System.out.println("Max power = " + powVal);
    }
}
