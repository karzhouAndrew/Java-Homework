package workbook.lab8;

public class Factorial {
    public static void main(String[] argv) {
        int number = 10, factorial = 1;
        for (int i = 1; i <= number; i++)
            factorial *= i;
        System.out.println("the factorial of " + number + " is equal " + factorial);
    }
}
    