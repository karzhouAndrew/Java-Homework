package homework;

import java.util.Random;

public class MassSumBetween {
    public static void main(String[] args) {

        Random rand = new Random();
        int [] mass = new int[rand.nextInt(20)+1];
        for (int i=0; i<mass.length; i++){
            mass[i]=rand.nextInt(30)+1;
            System.out.print(mass[i] +" ");

        }

        System.out.println();
        for (int i=1; i<mass.length; i++){
            int min = mass[0];
            if (mass[i]<min){
                min = mass[i];
            }

            System.out.print(min +" ");
        }

    }
}
