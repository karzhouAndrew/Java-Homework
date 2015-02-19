package homework.lab2;

import java.util.Scanner;
public class Task7 {
    public static void main(String[] arg) {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int one = number%10;
        int two = (number%100)/10;
        int three = (number%1000)/100;
        int four = (number%10000)/1000;
        if ((one!=two)&&(one!=three)&&(one!=four)&&(two!=three)&&(two!=four)&&(three!=four))
        {System.out.println("Все цифры числа " + number + " различны.");}
        else {System.out.println("Есть повторяющиеся цифры в числе " + number );}
    }
}

