package workbook.lab22;

/**
 * Created by Asus on 21.02.2015.
 */
public class CubeTest {
    public static void main(String[] args) {
        Cube c = new Cube(23, "blue");
        System.out.println("Объем куба " + c.volumeCube());
        System.out.println("Площадь куба " + c.areaCube());
        System.out.println("Цвет куба " + c.color);
    }
}
