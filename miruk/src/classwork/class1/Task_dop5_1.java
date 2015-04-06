package classwork.class1;

import java.util.Scanner;

import static java.lang.Math.*;
/*пример*/

public class Task_dop5_1 {
    public static void main(String[] args) {
        System.out.print("Введите три числа: ");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float t = sc.nextFloat();
        float s = sc.nextFloat();
        sc.close();
        if (1 + pow(x, s) == 0) {
            System.out.println("Знаменатель равен 0");
        } else {
            double y = pow(sin(pow(x, t)), 2) / (sqrt(1 + pow(x, s)));
            System.out.println("y = " + y);
        }
    }
}
