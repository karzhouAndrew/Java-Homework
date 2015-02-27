package workbook.lab4;

/**
 * Created by Asus on 21.02.2015.
 */
public class Four {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int r = 2;
        if (r + r >= (a * a + b * b) / (r + r)) {
            System.out.println("Круглая картонка полностью закрывает прямоугольное отверстие");
        } else {
            System.out.println("Круглая картонка не закрывает полностью прямоугольное отверстие");
        }
    }
}