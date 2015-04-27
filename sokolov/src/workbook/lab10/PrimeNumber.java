package workbook.lab10;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 8;
        boolean simple = true;
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println("the number of " + number + " isn`t simple.");
                simple = false;
                break;
            }
        }
        if (simple) {
            System.out.println("the number of " + number + " is simple.");
        }
    }
}