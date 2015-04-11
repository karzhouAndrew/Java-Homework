package workbook2.lab7;

/**
 * Created by Sam on 29.03.2015.
 */
public class Point {
    private int x;
    private int y;

    private String unit;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Point{x=" + x + unit + ", y=" + y + unit + '\'' + "}\n";
    }
}
