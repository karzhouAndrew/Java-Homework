package homework;

import java.util.Random;

public class MaxMarkIndex {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] marks = new int[rand.nextInt(30) + 1];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = rand.nextInt(10) + 1;
            System.out.println("Оценка " + i + " ученика: " + marks[i]);
        }

        System.out.println();
        int maxMark = marks[0];

        for (int i = 1; i < marks.length; i++) {
            int maxMarkIndex = i;
            if (maxMark < marks[maxMarkIndex]) {
                maxMark = marks[maxMarkIndex];
                maxMarkIndex=i;
                System.out.println("maxMarkIndex " + maxMarkIndex);
            }


        }

        System.out.println("Максимльная оценка в классе: " + maxMark);

    }


}


