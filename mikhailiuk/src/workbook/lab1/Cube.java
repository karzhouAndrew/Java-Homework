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

    public Cube(double size, String color) {
        this.size = size;
        this.color = color;
    }


    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}