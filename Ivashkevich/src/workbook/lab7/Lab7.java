package workbook.lab7;

/*
 * Дано  любое натуральное  n. Верно ли, что все  цифры числа различны?
 */
public class Lab7 {
    public static void main(String[] args) {
        int number = 5555;
        int digit1 = (number - number % 1000);
        int digit2 = (number - digit1) - (number - digit1) % 100;
        int digit3 = (number - digit1 - digit2) - (number - digit1 - digit2) % 10;
        int digit4 = (number - digit1 - digit2 - digit3) - (number - digit1 - digit2 - digit3) % 1;
        if (digit1 / 1000 == digit2 / 100 && digit3 / 10 == digit4 && digit2 / 100 == digit4) {
            System.out.println("равны");
        } else {
            System.out.println("не равны");
        }
    }
}
