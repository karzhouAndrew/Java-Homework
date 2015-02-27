package workbook.lab28;

/**
 * Created by Asus on 26.02.2015.
 */
public abstract class HomeAppliances extends Appliances {
    public HomeAppliances() {
    }

    public HomeAppliances(double weight, double volume) {
        super(weight, volume);
    }

    @Override
    public abstract void work();

    @Override
    public double setVolume(double width, double height, double depth) {
        return super.setVolume(width, height, depth);
    }
}
