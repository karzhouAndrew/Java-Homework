package lab8;

/*
Вычислить факториал числа.
 */
public class averFact {
    public static void main(String[] args) {
        int factorial = 4;
        int x = 1;
        int i = 1;
        while (i <= factorial) {
            x *= i;
            i++;
        }
        System.out.println("факториал числа " + factorial + " = " + x);
    }
}
