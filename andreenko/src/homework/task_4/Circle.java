package homework.task_4;

/**
 * Created by Алексей Андреенко on 05.02.2015.
 * Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью закрыть круглой картонкой радиусом r.
 */
public class Circle {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int r = 8;
        double c = Math.sqrt((a * a) + (b * b));
        if (c > r * 2) {
            System.out.println("Прямоугольное отверстие " + a + "см на " + b + "см не закроется круглой картонкой радиусом " + r + "см");
        } else {
            System.out.println("Прямоугольное отверстие " + a + "см на " + b + "см закроется круглой картонкой радиусом " + r + "см");
        }
    }
}
