package lab11;

/*
Найти сумму первых n челых чисел, которые делятся на 3.
 */
public class SumDiv {
    public static void main(String[] args) {
        int n = 4;
        int sum = 0;
        int j = 0;
        for (int i = 0; i <= n; i++) {
            if (j % 3 == 0) {
                j += 3;
            }
            sum += j;
            System.out.print(j + " ");
        }
        System.out.println("= " + sum);
    }
}
