package lab10;

/*
Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на себя и на 1.
 */
public class SimpNum {
    public static void main(String[] args) {
        int n = 127;
        for (int i = 2; i <= 9; i++) {
            if (n % i == 0) {
                System.out.println("Число " + n + " НЕ является простым");
                break;
            }
        }
    }
}
