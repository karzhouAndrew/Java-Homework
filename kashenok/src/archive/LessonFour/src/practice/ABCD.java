package practice;

import javax.swing.*;
import java.util.Scanner;

public class ABCD {
    public static void main(String[] args) {

        String ainter = JOptionPane.showInputDialog("Введите значение числа а: ");
        float a = Float.parseFloat(ainter);
        String binter = JOptionPane.showInputDialog("Введите значение числа b: ");
        float b = Float.parseFloat(binter);
        String cinter = JOptionPane.showInputDialog("Введите значение числа c: ");
        float c = Float.parseFloat(cinter);
        String dinter = JOptionPane.showInputDialog("Введите значение числа d: ");
        float d = Float.parseFloat(dinter);


/*
        float a = (float) Math.random();
        float b = (float) Math.random();
        float c = (float) Math.random();
        float d = (float) Math.random();
*/
        System.out.println("a=" + a + " " + "b=" + b + " " + "c=" + c + " " + "d=" + d + " ");
        System.out.println();



        if (a <= b && b <= c && c <= d) {
            a = d;
            b = d;
            c = d;
            System.out.println("a=" + a + " " + "b=" + b + " " + "c=" + c + " " + "d=" + d + " ");


        } else if (a > b && b > c && c > d) {
            System.out.println("a=" + a + " " + "b=" + b + " " + "c=" + c + " " + "d=" + d + " ");



        } else {
            a *= a;
            b *= b;
            c *= c;
            d *= d;
            System.out.println("a=" + a + " " + "b=" + b + " " + "c=" + c + " " + "d=" + d + " ");

        }

    }
}
