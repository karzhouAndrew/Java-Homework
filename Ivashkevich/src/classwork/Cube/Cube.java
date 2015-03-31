package classwork.Cube;

/**
 * Created by Leonid on 13.02.2015.
 */
public class Cube {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void calcVolume(double side) {
        double volume = (Math.pow(side, 3));
        System.out.println("Объем фигуры:               " + volume);
    }

    public void calcArea(double side) {
        double area = (Math.pow(side, 2) * 6);
        System.out.println("Площадь поверхности фигуры: " + area);
    }

    @Override
    public String toString() {
        return "\nCube{" + "color='" + color + '\'' + '}';
    }
}
