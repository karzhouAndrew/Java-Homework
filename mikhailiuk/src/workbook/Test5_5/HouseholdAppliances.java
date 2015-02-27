package workbook.Test5_5;

/**
 * Created by Natashka on 22.02.2015.
 */
public abstract class HouseholdAppliances {

    private int power;
    private double weight;
    private boolean On;

    public boolean isOn() {
        return On;
    }

    public void setOn(boolean on) {
        On = on;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public abstract void on();

    public abstract void off();
}
