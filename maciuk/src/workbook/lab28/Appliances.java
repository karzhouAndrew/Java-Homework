package workbook.lab28;

/**
 * Created by Asus on 26.02.2015.
 */
public abstract class Appliances {
    private double weight;
    private double volume;
    private double width;
    private double height;
    private double depth;


    public Appliances() {
    }

    public Appliances(double weight, double volume) {
        this.weight = weight;
        this.volume = volume;
    }

    public abstract void work();

    public double setVolume(double width, double height, double depth) {
        return width * height * depth;
    }

}
