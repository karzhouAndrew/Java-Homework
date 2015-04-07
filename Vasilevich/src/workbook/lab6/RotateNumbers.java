package workbook.lab6;

import java.util.Random;

/**
 * Created by Sam on 20.02.2015.
 * Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n
 */
public class RotateNumbers {

    public static void main(String[] args) {
        Random rand = new Random();
        int num = Math.abs(rand.nextInt(Integer.MAX_VALUE / 10)); // необходимо ограничивать рандом,
        // т.к. число после поворота может оказаться больше чем int max
        int mod = 10;
        int res = num;
        int arrLen = 0;
        System.out.println("Number =  " + num);
        while (res > 0) {
            res = res - (res % mod);
            mod *= 10;
            arrLen++;
        }

        System.out.println("Count =  " + arrLen);
        res = num;
        mod = 10;
        int resultNumber = 0;
        int arr[] = new int[arrLen];
        for (int ind = 0; ind < arrLen; ind++) {
            if (res > mod) {
                arr[arrLen - ind - 1] = res % mod;
                res -= arr[arrLen - ind - 1];
                arr[arrLen - ind - 1] = (arr[arrLen - ind - 1]) / (mod / 10);
                resultNumber += arr[arrLen - ind - 1] * Math.pow(10, arrLen - ind - 1);
            } else {
                arr[arrLen - ind - 1] = (res) / (mod / 10);
                resultNumber += (arr[arrLen - ind - 1] * Math.pow(10, arrLen - ind - 1));
                break;
            }
            mod *= 10;
        }

        System.out.println("Result = " + resultNumber);
    }
}
