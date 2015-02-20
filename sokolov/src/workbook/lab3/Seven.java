package workbook.lab3;

public class Seven {
    public static void main(String[] args) {
        int a = 107;
        int b = 100;
        int a1 = a % 10;
        int b1 = b % 10;
        if (a1 == 7) {
            System.out.println("the last figure of number a is 7");
        } else {
            System.out.println("the last figure of number a isn't 7");
        }
        if (b1 == 7) {
            System.out.println("the last figure of number b is 7");
        } else {
            System.out.println("the last figure of number b isn't 7");
        }
    }
}

