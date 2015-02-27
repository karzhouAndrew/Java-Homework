package workbook.lab8;

/**
 * Created by Asus on 21.02.2015.
 */
public class Eight {
    public static void main(String[] args) {
        double averageSum = 0;
        int sum = 0;
        int n = 0;
        int x = (int) (Math.random() * 20);
        while (x != 0) {
            int summer = 1;
            int d = 1;
            while (d <= x) {
                summer *= d;
                d++;
            }
            sum += summer;
            n++;
            x = (int)(Math.random() * 20);
        }
        if (n != 0) {
            averageSum = sum / n;
        } else {
            averageSum = 0;
        }
        System.out.println("Среднее:" + averageSum);
    }
}
