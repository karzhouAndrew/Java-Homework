package workbook.lab10;

import java.util.Random;

/**
 * Created by Sam on 20.02.2015.
 * Имеется целое число, определить является ли оно простым, т.е. делится без остатка на само себя и 1
 */
public class IsSimpleVal {
    public static void main(String[] args) {
        Random rand = new Random();
        int val = rand.nextInt(100);
        int countVal = Math.round(val / 2) + 1;
        System.out.println("Value = " + val);
        for (int i = 2; i < countVal; i++) {
            if (val % i == 0) {
                System.out.println("Value is not simple. It divide with " + i);
                break;
            } else {
                if (i == (countVal - 1)) {
                    System.out.println("Value is simple!");
                }
            }
        }
    }
}
