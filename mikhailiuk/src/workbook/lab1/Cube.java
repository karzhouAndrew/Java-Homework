package workbook.lab1;

/**
 * Created by Natashka on 13.02.2015.
 */
public class Cube {
    private double size;
    private String color;

    public Cube() {
        size = 10;
        color = "black";
    }

    public Cube(double size1, String color1) {
        size = size1;
        color = color1;
    }

    public void setSize(double size1) {
        size = size1;
    }

    public void setColor(String color1) {
        color = color1;
    }

    public double getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
