package workbook.lab12;

import java.util.Random;

/**
 * Created by Sam on 20.02.2015.
 * В задаче на поиск максимальной оценки вывести не саму оценку, а ее номер
 */
public class FindMaxVal {
    public static void main(String[] args) {
        Random rand = new Random();
        int markCount = 10;

        int markArr[] = new int[markCount];
        for (int ind = 0; ind < markCount; ind++) {
            markArr[ind] = rand.nextInt(11);
            System.out.println("Mark[" + ind + "] = " + markArr[ind]);
        }


        int maxMark = markArr[0];
        int maxMarkInd = 0;

        for (int ind = 1; ind < markCount; ind++) {
            if (markArr[ind] > maxMark) {
                maxMark = markArr[ind];
                maxMarkInd = ind;

            }
        }
        System.out.println("Answer mark index = " + maxMarkInd);
    }
}
