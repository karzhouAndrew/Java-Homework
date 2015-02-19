package classes.classwork4;


import java.util.Random;

/**
 * Created by Natashka on 10.02.2015.
 */
public class job4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randNumber = rand.nextInt(1000);
        if (randNumber < 100) {
            randNumber += 100;
        }
        int[] digitArray = new int[3];
        int count = 0;
        int count1 = 0;
        System.out.print("Случайное число: " + randNumber);
        if (randNumber == 781 || randNumber == 302 || randNumber == 409 || randNumber == 941) {
            System.out.println(" Магическое");
        } else {
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
}




