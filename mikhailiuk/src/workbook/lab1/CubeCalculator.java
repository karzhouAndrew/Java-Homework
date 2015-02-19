package workbook.lab1;

/**
 * Created by Natashka on 13.02.2015.
 */
public class CubeCalculator {
    double area;
    double volume;

    public double cubeAreaCalc(double size) {
        area = size * size;
        return area;
    }

    public double cubeVolCalc(double size) {
        volume = size * size * size;
        return volume;
    }
}
