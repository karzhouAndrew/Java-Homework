package classwork.workWithFile.task6;

import java.util.Scanner;

/**
 * Created by Leonid on 13.03.2015.
 */
public class InputDataType {
    private InputDataType() {
    }

    public static Integer input() {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        if (input.toUpperCase().equals("INT")) {
            System.out.println("Целые числа: ");
            return  1;
        }
        if (input.toUpperCase().equals("DOUBLE")) {
            System.out.println("Числа с плавающей запятой: ");
            return  2;
        }
        if (input.toUpperCase().equals("WORD")) {
            System.out.println("Слова: ");
            return  3;
        }
        if (input.toUpperCase().equals("SYMBOL")) {
            System.out.println("Символы: ");
           return  4;
        }
        if (input.toUpperCase().equals("EXIT")) {
            return  5;
        }

        return 6;
    }
}
