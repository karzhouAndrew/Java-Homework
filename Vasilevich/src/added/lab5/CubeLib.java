package added.lab5;

/**
 * Created by Sam on 21.02.2015.
 */
public class CubeLib {
    private double sideLen;
    private String color;
    private double square;
    private double volume;

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    public void setSideLen(double sideLen) {
        this.sideLen = sideLen;
    }

    public double getSideLen() {
        return sideLen;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public CubeLib() {
        color = "Black";
        sideLen = 1;
    }

    public CubeLib(double sideLen, String color) {
        this.sideLen = sideLen;
        this.color = color;
    }

    @Override
    public String toString() {
        return "CubeLib{" +
                "sideLen=" + sideLen +
                ", color='" + color + '\'' +
                ", square=" + square +
                ", volume=" + volume +
                '}';
    }
}
