package workbook.Test5_5;

/**
 * Created by Natashka on 22.02.2015.
 */
public class AppliancesTest {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator();
        CoolingAppliances coolingAppliances = new Freezer();
        AirConditioner airConditioner = new AirConditioner();
        coolingAppliances.on();
        coolingAppliances.setMinTemp(-20);
        System.out.println(coolingAppliances.getMinTemp());
        refrigerator.setZeroZoneTemp(1);
        System.out.println(refrigerator.getZeroZoneTemp());
        refrigerator.on();
        airConditioner.on();
        airConditioner.off();
        coolingAppliances = airConditioner;
        coolingAppliances.on();
    }
}
