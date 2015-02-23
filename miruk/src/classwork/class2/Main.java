package classwork.class2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1   Вычислить площадь граней куба");
        System.out.println("2   Вычислить объем");
        System.out.println("3   Покрасить куб в цвет");
        System.out.println("4   Выход");
        Kub kub = new Kub();
        Сalculation calculation = new Сalculation();
        float number=0;
        while (number!=4){
        Scanner sc = new Scanner(System.in);
        number = sc.nextFloat();
        if (number == 1) {
            kub.square = calculation.getSquare(kub.a);
            System.out.println(kub.toString());
        } else if (number == 2) {
            kub.volume = calculation.getVolume(kub.a);
            System.out.println(kub.toString());
        } else if (number == 3) {
            kub.color = calculation.getColor(kub);
            System.out.println(kub.toString());
        } }
        if (number == 4) {
            System.exit(0);
        }
    }
}
