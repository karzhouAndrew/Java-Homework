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
        for (int i = 0; i < markCount; i++) {
            markArr[i] = rand.nextInt(11);
            System.out.println("Mark[" + i + "] = " + markArr[i]);
        }


        int maxMark = markArr[0];
        int maxMarkInd = 0;

        for (int i = 1; i < markCount; i++) {
            if (markArr[i] > maxMark) {
                maxMark = markArr[i];
                maxMarkInd = i;

            }
        }
        System.out.println("Answer mark index = " + maxMarkInd);
    }
}
