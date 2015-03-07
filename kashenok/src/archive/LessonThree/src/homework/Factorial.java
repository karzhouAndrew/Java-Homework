package homework;

import java.util.Random;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите число, для которого следует вычислить факториал: ");
        long x = input.nextLong();
        System.out.println("Вы ввели число: " + x);

        int p = rand.nextInt(100);
        long start = 1;
        for (int i=2; i<=x;i++){
            start*=i;
        }

if (x<=0){
    System.out.print("Вы ввели отрицательное число, либо ноль");
}

        System.out.print("Факториал числа р: " + x + " равен " + start);

    }
}
