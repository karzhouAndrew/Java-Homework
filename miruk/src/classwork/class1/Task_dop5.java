package classwork.class1;
//пример

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.*;

public class Task_dop5 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        sc.close();
        double a = (cos(pow(E, x)) + pow(E, pow(x, 2)) + sqrt(1 / x));
        double b = pow((cos(PI * pow(x, 3)) + log(pow((1 + x), 2))), sin(x));
        if ((b == 0)||(a <0)||(1/x<0)||(x==0)||(pow((1+x),2)>0)) {
            System.out.println("Число х выходит из области допустимых значений");
        } else {
            double y = (pow(a,0.25)) / b;
            System.out.println("y = " + y);
        }
    }
}
