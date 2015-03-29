package workbook2.test7_8.entity;

import java.util.List;

/**
 * Created by Natashka on 19.03.2015.
 */
public class Point {
    private String name;
    private int coordinateX;
    private int coordinateY;
    private String units;

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return name + " " + coordinateX + units + ", " + coordinateY + units;
    }

    public void pointsPrinter(List<Point> listOfPoints) {
        for (Point point : listOfPoints) {
            System.out.println(point.toString());
        }
    }
}
