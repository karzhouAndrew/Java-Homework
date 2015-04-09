package workbook.Test5_5;

/**
 * Created by Natashka on 22.02.2015.
 */
public class Refrigerator extends CoolingAppliances {
    private boolean ZeroZone;
    private int zeroZoneTemp;

    public boolean getZeroZone() {
        return ZeroZone;
    }

    public void setZeroZone(boolean ZeroZone) {
        this.ZeroZone = ZeroZone;
    }

    public int getZeroZoneTemp() {
        return zeroZoneTemp;
    }

    public void setZeroZoneTemp(int zeroZoneTemp) {
        this.zeroZoneTemp = zeroZoneTemp;
    }

    @Override
    public void on() {
        super.on();
        System.out.println("Холодильник включен");
    }

    @Override
    public void off() {
        super.off();
        System.out.println("Холодильник выключен");
    }
}
