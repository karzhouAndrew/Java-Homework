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
        int out = 0;
        String input = in.next();
        if (input.toUpperCase().equals("INT")) {
            System.out.println("Целые числа: ");
            out = 1;
        }
        if (input.toUpperCase().equals("DOUBLE")) {
            System.out.println("Числа с плавающей запятой: ");
            out = 2;
        }
        if (input.toUpperCase().equals("WORD")) {
            System.out.println("Слова: ");
            out = 3;
        }
        if (input.toUpperCase().equals("SYMBOL")) {
            System.out.println("Символы: ");
            out = 4;
        }
        if (input.toUpperCase().equals("EXIT")) {
            out = 5;
        }
        return out;
    }
}
