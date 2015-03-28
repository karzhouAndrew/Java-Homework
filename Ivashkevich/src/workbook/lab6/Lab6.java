package workbook.lab6;

import java.util.Scanner;

/*
 * Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n.
 */
public class Lab6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\nВведите число:      ");
        int num = input.nextInt();
        int temp = 0;
        int i = 0;
        System.out.print("в обратном порядке: ");

        while (num > 0) {
            temp = num % 10;
            num /= 10;
            System.out.print(temp);
        }

    }
}

