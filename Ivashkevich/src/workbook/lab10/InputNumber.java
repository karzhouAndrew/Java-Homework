package workbook.lab10;

import java.util.Scanner;

/**
 * Created by Leonid on 26.02.2015.
 */
public class InputNumber {
    public double inputNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nВведите число:  ");
        int number = input.nextInt();
        input.close();
        return number;
    }
}
