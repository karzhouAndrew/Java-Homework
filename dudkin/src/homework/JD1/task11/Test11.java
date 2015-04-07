package homework.JD1.task11;

public class Test11 {
    public static void main(String[] args) {
        int n = 6;
        int sum = 0;

        for (int i = 1; n != 0; ++i) {
            if (i % 3 == 0) {
                --n;
                sum += i;
            }
        }

        System.out.println("Сумма " + sum);
    }
}
