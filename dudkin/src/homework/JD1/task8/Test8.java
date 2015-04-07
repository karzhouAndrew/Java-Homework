package homework.JD1.task8;

public class Test8 {
    public static void main(String[] args) {
        long factorial = 1;
        int x = (int) (Math.random() * 20);
        System.out.println("X равен: " + x);
        if (x != 0) {
            while (x != 0) {
                factorial *= (long) x;
                --x;
            }
        } else {
            System.out.print(factorial + " ");
        }

        System.out.print("Факториал числа X: " + factorial);
    }
}
