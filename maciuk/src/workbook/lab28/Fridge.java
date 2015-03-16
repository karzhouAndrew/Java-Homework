package workbook.lab28;

/**
 * Created by Asus on 26.02.2015.
 */
public class Fridge extends HomeAppliances {
    private double width;
    private double height;
    private double depth;

    public Fridge() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public Fridge(double weight, double volume) {
        super(weight, volume);
    }

    @Override
    public void work() {
        System.out.println("Холодильник включен");
    }

    @Override
    public double setVolume(double width, double height, double depth) {
        return super.setVolume(width, height, depth);
    }
}
