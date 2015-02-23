package homework.work2;

import java.util.Scanner;

/*иммеется прямоугольное отверстие размерами а*b, определить, можно ли его полностью закрыть круглой картонкой радиусом r*/

public class Task4 {
    public static void main(String[] arg) {
        System.out.print("Введите стороны прямоугольника: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.print("Введите радиус круглой картонки: ");
        int r = sc.nextInt();
        sc.close();
        float c = a * a + b * b;
        double d = Math.pow(c, 0.5) / 2;
        if (r >= d) {
            System.out.println("Прямоугольное отверстие можно накрыть круглой картонкой");
        } else {
            System.out.println("Прямоугольное отверстие нельзя накрыть круглой картонкой");
        }
    }
}
