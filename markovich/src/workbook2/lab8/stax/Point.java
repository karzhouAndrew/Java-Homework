package workbook2.lab8.stax;

public class Point {
    private String unit;
    private int coordinateX;
    private int coordinateY;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

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

    @Override
    public String toString() {
        return "Point: " + this.coordinateX + this.unit + ", " + this.coordinateY + this.unit;
    }
}
