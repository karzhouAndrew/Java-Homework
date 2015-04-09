package workbook.Test5_5;

/**
 * Created by Natashka on 22.02.2015.
 */
public class CoolingAppliances extends HouseholdAppliances {
    private int minTemp;

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public CoolingAppliances(int minTemp) {
        this.minTemp = minTemp;
    }

    public CoolingAppliances() {
    }

    @Override
    public void on() {
        setOn(true);
    }

    @Override
    public void off() {
        setOn(false);
    }
}
