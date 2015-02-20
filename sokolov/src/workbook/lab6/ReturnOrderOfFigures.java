package workbook.lab6;

public class ReturnOrderOfFigures {
    public static void main(String[] args) {
        int n = 10;
        int number = 32140;
        System.out.println("Initial number:\n" + number);
        System.out.print("The received number:\n");
        while (number / n != 0) {
            System.out.print((number % n) / (n / 10));
            n *= 10;
        }
        System.out.println((number % n) / (n / 10));
    }
}
