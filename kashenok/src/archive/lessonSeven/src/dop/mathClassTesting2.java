package dop;

import java.util.Scanner;

/**
 * Created by Рома on 18.02.2015.
 */
public class mathClassTesting2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение \"Х\" ");
        int x = scan.nextInt();
        System.out.println("Введите значение \"t\" ");
        int t = scan.nextInt();
        System.out.println("Введите значение \"S\" ");
        int s = scan.nextInt();

        double chislitel = Math.pow(Math.sin(Math.pow(x,t)),2);
        double znamenatel = Math.sqrt((1+Math.pow(x,s)));

        double y = chislitel/znamenatel;

        System.out.println("y = " + y);
    }
}
