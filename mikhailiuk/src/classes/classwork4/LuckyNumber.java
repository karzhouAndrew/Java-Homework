package classes.classwork4;

/**
 * Created by Natashka on 09.03.2015.
 */
public class LuckyNumber {
    public void luckyNumber(int randNumber) {
        int[] digitArray = new int[3];
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < digitArray.length; i++) {
            digitArray[i] = randNumber % 10;
            randNumber = (randNumber - randNumber % 10) / 10;
            if (digitArray[0] == digitArray[i]) {
                count++;
            }
        }
        for (int i = 0; i < digitArray.length - 1; i++) {
            if (digitArray[i] - 1 == digitArray[i + 1]) {
                count1++;
            }
        }
        if ((count == digitArray.length) || (count1 == digitArray.length - 1)) {
            System.out.println(" Счастливое");
        } else {
            System.out.println(" Несчастливое");
        }
    }
}
