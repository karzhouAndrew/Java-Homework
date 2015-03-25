package workbook.lab4;

/**
 * Имеется прямоугольное отверстие размерами a и b, определить,
 * можно ли его полностью закрыть круглой картонкой радиусом r
 */

public class Carton {
    public static void main(String[] args) {
        int radius = 10;
        int aSide = 6;
        int bSide = 9;
        double hypotenuse = Math.sqrt(Math.pow(aSide, 2) + Math.pow(bSide, 2));
        if (hypotenuse >= radius) {
            System.out.println("Да, можно польностью закрыть данной картонкой.");
        } else {
            System.out.println("Нет, нельзя закрыть.");
        }
    }
}
