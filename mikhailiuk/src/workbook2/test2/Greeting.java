package workbook2.test2;

import java.util.ResourceBundle;
import java.util.Scanner;

/**
 программа приветствия на английском русском белорусском, английский по умолчанию или при неправильном вводе.
 */
public class Greeting {
    public static void main(String[] args) {
        System.out.println("enter language code (2 letter: en, ru, be) ");
        Scanner scanner = new Scanner(System.in);
        String language = scanner.nextLine();
        language = language.toLowerCase();
        System.out.println("enter country code (2 letter: GB, RU, BY) ");
        String country = scanner.nextLine();
        country = country.toUpperCase();
        scanner.close();
        InputCheck inputCheck = new InputCheck();
        ResourceBundle resourceBundle = ResourceBundle.getBundle("workbook2.test2.MessagesBundle", inputCheck.localeCheck(language, country));
        System.out.println(resourceBundle.getString("greeting"));
    }
}
