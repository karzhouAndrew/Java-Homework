package workbook.lab4;

/*
 *Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью закрыть круглой картонкой радиусом r.
 */
public class Lab4 {
    public static void main(String[] args) {
        int sideA = 3;
        int sideB = 7;
        int radius = 4;
        int diameter = radius*2;
        float hypotenuseLength = (float) Math.sqrt(sideA * sideA + sideB * sideB);
        if (hypotenuseLength <= diameter) {
            System.out.println(hypotenuseLength + " Закроет");
        } else {
            System.out.println(hypotenuseLength + " Не закроет");
        }


    }
}
