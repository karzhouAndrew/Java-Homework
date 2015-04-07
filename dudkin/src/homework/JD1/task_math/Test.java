package homework.JD1.task_math;

/**
 * Created by Admin on 15.02.2015.
 */
public class Test {
    public static void main(String[] args) {
        double x;
        Formula1 formula1 = new Formula1();
        double y = formula1.test1(4);
        System.out.println("Решение первой формулы " + y);
        Formula2 formula2 = new Formula2();
        y = formula2.test2(1, 2, 3);
        System.out.println("Решение второй формулы " + y);
    }
}
