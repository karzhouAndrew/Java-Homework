package workbook.Test5_5;

/**
 * Created by Natashka on 22.02.2015.
 */
public class AirConditioner extends CoolingAppliances {
    private int coolingArea;

    public AirConditioner(int coolingArea) {
        this.coolingArea = coolingArea;
    }

    public AirConditioner() {
    }

    public int getCoolingArea() {
        return coolingArea;
    }

    public void setCoolingArea(int coolingArea) {
        this.coolingArea = coolingArea;
    }

    @Override
    public void on() {
        System.out.println("Кондиционер включен");
    }

    @Override
    public void off() {
        System.out.println("Кондиционер выключен");
    }
}
