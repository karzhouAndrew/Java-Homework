package workbook;

/**
 * Подсчитать факториал
 */
public class lab8 {
    public static void main(String[] args) {
        int num = 3;
        if (num < 0) {
            System.out.println("отрицательное число");
        } else if (num == 0 || num == 1) {
            System.out.println(num);
        } else {
            int result = 1;
            for (int i = 2; i <= num; i++)
                result *= i;
            System.out.println(result);
        }
    }
}
