package dop;

import java.security.spec.ECPoint;
import java.util.Scanner;

/**
 * Created by Рома on 17.02.2015.
 */
public class mathClassTesting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение \"Х\" ");
        int x = scan.nextInt();
        double expow = Math.pow(Math.E, Math.pow(x, 2));
        double cos1 = Math.cos(Math.pow(Math.E, x));
        double m = 1 / x;
        double sqrtX = Math.sqrt(m);
        double cubeRoot = Math.cbrt(cos1+expow+sqrtX);

        double cosPX = Math.cos(Math.PI*Math.pow(x,3));
        double log = Math.log(Math.pow((1 + x), 2));
        double znamenatel = Math.pow((cosPX+log),Math.sin(x));

        double y = cubeRoot/znamenatel;
        System.out.println("y = " + y);


    }
}
