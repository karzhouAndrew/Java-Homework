package homework.work3;

/*изменить пример с суммой чисел таким образом, чтобы расчитывалась не сумма,  а произведение*/

public class Task8 {
    public static void main(String[] args) {
        double averageProd = 0;
        double prod = 1;
        int n = 0;
        int x = (int) (Math.random() * 20);
        System.out.println(x);
        while (x != 0) {
            prod *= x;
            n++;
            x = (int) (Math.random() * 20);
            System.out.println(x);
        }
        if (n != 0) {
            averageProd = prod / n;
        } else {
            averageProd = 0;
        }
        System.out.println("Среднее: " + averageProd);
    }
}
