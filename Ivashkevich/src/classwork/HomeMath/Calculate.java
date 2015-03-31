package classwork.HomeMath;

import java.util.Scanner;

/**
 * Created by Leonid on 17.02.2015.
 */
public class Calculate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\nВведите значение переменной x для первого уравнения ");
        double x = input.nextDouble();

        Formula formula = new Formula();
        double result = formula.formula(x);
        System.out.println("Ответ " + result);

        System.out.println("\nВведите значение переменных для второго уравнения");
        Scanner input1 = new Scanner(System.in);
        System.out.print("\nВведите значение x ");
        x = input1.nextDouble();
        System.out.print("\nВведите значение t ");
        double t = input1.nextDouble();
        System.out.print("\nВведите значение s ");
        double s = input1.nextDouble();

        Formula2 formula2 = new Formula2();
        result = formula2.formula2(x,t,s);
        System.out.println("Ответ " + result);

    }
}
