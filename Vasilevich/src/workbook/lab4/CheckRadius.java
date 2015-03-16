package workbook.lab4;

/**
 * Created by Sam on 20.02.2015.
 * Имеется прямоугольное отверстие размерами a и b. Определить можно ли его закрыть круглой картонкой радиусом r
 */
public class CheckRadius {
    public static void main(String[] args) {
        double a = 6;
        double b = 8;
        double r = 5;
        if ((Math.pow((a / 2), 2) + Math.pow((b / 2), 2)) <= Math.pow(r, 2)) {
            System.out.println("Круг покрывает");
        } else {

            System.out.println("Круг не покрывает");
        }
    }
}
