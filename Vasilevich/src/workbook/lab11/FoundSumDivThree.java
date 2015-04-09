package workbook.lab11;

import java.util.Random;

/**
 * Created by Sam on 20.02.2015.
 * Найти сумму n целых чисел которые делятся на 3
 */
public class FoundSumDivThree {
    public static void main(String[] args) {
        int maxInt = 2147483647;
        Random rand = new Random();
        int startVal = Math.abs(rand.nextInt(100));
        System.out.println("Start value = " + startVal);
        int sum = 0;
        int countValToCalc = 7; // n первых чисел
        for (int ind = startVal; ind < maxInt; ind++) {
            if (ind % 3 == 0) {
                sum += ind;
                System.out.println("Value[" + ((ind - startVal) / 3) + "] = " + ind);
                countValToCalc--;
                if (countValToCalc == 0) {
                    break;
                }
            }
        }
        System.out.println("Answer = " + sum);
    }
}
