package classwork.calculationFormulas;

import java.util.Scanner;

/**
 * Created by Leonid on 17.02.2015.
 */
public class Load {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\nВведите значение переменной x для первого уравнения ");
        double x = input.nextDouble();

        Formula formula = new Formula();
        formula.formula(x);

        System.out.println("\nВведите значение переменных для второго уравнения");
        System.out.print("\nВведите значение x ");
        x = input.nextDouble();
        System.out.print("\nВведите значение t ");
        double t = input.nextDouble();
        System.out.print("\nВведите значение s ");
        double s = input.nextDouble();
        input.close();

        Formula2 formula2 = new Formula2();
        formula2.formula2(x,t,s);
    }
}
