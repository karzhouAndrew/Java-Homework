package workbook.lab28;

/**
 * Created by Asus on 26.02.2015.
 */
public class Microwave extends HomeAppliances {
    private double width;
    private double height;
    private double depth;
    public Microwave() {
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

    public Microwave(int weight, int volume) {
        super(weight, volume);
    }

    @Override
    public void work() {
        System.out.println("Микроволновка включена");
    }

    @Override
    public double setVolume(double width, double height, double depth) {
        return super.setVolume(width, height, depth);
    }
}
