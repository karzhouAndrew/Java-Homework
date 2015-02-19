package workbook.test4;

/**
 * Created by Natashka on 05.02.2015.
 */
public class Test4 {
    public static void main(String[] args) {
        float side1 = 6.7f;
        float side2 = 8.5f;
        float radius = 5.2f;
        if ((side1 * side1 + side2 * side2) <= 4 * radius * radius) {
            System.out.println("Прямоугольное отверстие размерами " + side1 + " на " + side2 + " можно закрыть кругом с радиусом " + radius);
        } else {
            System.out.println("Прямоугольное отверстие размерами " + side1 + " на " + side2 + " нельзя закрыть кругом с радиусом " + radius);
        }
    }
}
