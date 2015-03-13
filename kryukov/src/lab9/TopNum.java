package lab9;

/*
Имеется последовательность случайных чисел. Найти и вывести наибольшее из них.
 */
public class TopNum {
    public static void main(String[] args) {
        int n = 0;
        int numQty = 10;
        int x = (int) (Math.random() * 20);
        int y = x;
        int maxNum = 0;
        while (n < numQty) {
            System.out.print(x + " ");
            n++;
            x = (int) (Math.random() * 20);
            if (y > x) {
                maxNum = y;
            } else y = x;
        }
        System.out.println("максимальное число равно:" + maxNum);
    }
}
