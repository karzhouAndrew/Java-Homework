package homework;

import java.util.Scanner;

public class DivisionOnThreeSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество первых \"n \" чисел, которые будем делить на три: ");
        int n = input.nextInt();
        int k = 1;
        int sum=0;
        for (int i=1; k<=n; i++){
            if (i%3==0){
                System.out.println(k + "-й элемент, делящийся на 3 равен: " + i);
                sum+=i;
                k++;
            }


        }
        System.out.println("Сумма " + n + "первых чисел, делящихся на 3 равна: " + sum);
    }
}
