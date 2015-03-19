package workbook2.lab2;

import java.util.Scanner;

public class Menu {

    public static void menu() {
        System.out.println("-------------------------------------------");
        System.out.println("1. Поприветствовать на английском языке. ");
        System.out.println("2. Поприветствовать на русском языке. ");
        System.out.println("3. Поприветствовать на белорусском языке. ");
        System.out.println("4. Поприветствовать на языке по умолчанию. ");
        System.out.println("5. Выход. ");
        System.out.println("-------------------------------------------");
    }

    public void getMenu() {
        String inputNumber;
        Scanner in = new Scanner(System.in);
        menu();
        do {
            System.out.println("Выберите пункт меню: ");
            inputNumber = in.next();
            PrintUnit.chooseLanguages(inputNumber);
        } while (!inputNumber.equals("5"));
    }
}