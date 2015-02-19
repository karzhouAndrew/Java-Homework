package workbook.lab1;

/**
 * Created by Natashka on 13.02.2015.
 */
public class CubeTest {
    public static void main(String[] args) {
        double cubeVol1, cubeVol2, cubeArea1, cubeArea2;
        Cube cube1 = new Cube();
        Cube cube2 = new Cube(15, "red");
        CubeCalculator calculator = new CubeCalculator();
        CubePainting painter = new CubePainting();
        cubeArea1 = calculator.cubeAreaCalc(cube1.getSize());
        cubeVol1 = calculator.cubeVolCalc(cube1.getSize());
        System.out.println("Площадь первого куба " + cubeArea1 + " Обьем " + cubeVol1 + " Цвет " + cube1.getColor());
        cubeArea2 = calculator.cubeAreaCalc(cube2.getSize());
        painter.cubePainting(cube1, "blue");
        System.out.println("Цвет первого куба после перекраски " + cube1.getColor());
        cubeVol2 = calculator.cubeVolCalc(cube2.getSize());
        System.out.println("Площадь второго куба " + cubeArea2 + " Обьем " + cubeVol2 + " Цвет " + cube2.getColor());
    }
}
