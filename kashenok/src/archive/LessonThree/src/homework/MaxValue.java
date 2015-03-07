package homework;

import java.util.Random;

public class MaxValue {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] mass = new int[rand.nextInt(20) + 1];
        System.out.print("Генерируем случайную послеоватнльность случайных чисел: ");
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(100) + 1;
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[j] > mass[maxIndex]) {
                    maxIndex = j;
                }
                int temp = mass[i];
                mass[i] = mass[maxIndex];
                mass[maxIndex] = temp;
            }

        }


        System.out.print("Максимальный элемент последовательности случайных чисел равен: " + mass[0]);

        System.out.println();
        for (int i=0; i<mass.length; i++){
            System.out.print(mass[i] +" ");
        }
    }
}
