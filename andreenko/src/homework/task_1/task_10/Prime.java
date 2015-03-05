package homework.task_1.task_10;

/**
 * Created by Администратор on 08.02.2015.
 * Имеется целое число, определить является ли оно простым, т.е. делится без остатка только на 1 и на себя.
 */
public class Prime {
    public static void main(String[] args) {
        int n = 11;
        int i;
        boolean isComp = false;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                isComp = true;
                break;
            }
        }
        if (isComp) {
            System.out.println("Число составное");
        } else {
            System.out.println("Число простое");
        }
    }
}
