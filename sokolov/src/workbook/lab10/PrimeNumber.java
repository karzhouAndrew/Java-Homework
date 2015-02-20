package workbook.lab10;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 13, divider = 0;
        for (int i = 2; i <= number / 2 + 1; i++) {
            if (number % i == 0)
                divider += 1;
            if (divider != 0) {
                System.out.println("the number of " + number + " isn`t simple.");
                break;
            }
        }
        if (divider == 0)
            System.out.println("the number of " + number + " is simple.");
    }
} 