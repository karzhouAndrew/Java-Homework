package workbook.lab24;

/**
 * Created by vasilevich on 09.03.2015.
 * Создать иерархию классов, описывающих бытовую технику. Создать несколько объектов описанных классов, часть из них
 * включить в розетку. Иерархия должна иметь хотя бы три уровня
 */
public class TestDevices {
    public static void main(String[] args) {
        DeviceArray deviceArray = new DeviceArray();
        boolean switchOn = true;
        boolean switchOff = false;
        deviceArray.addDevice("Braun", "Iron", switchOn);
        deviceArray.addDevice("Philips", "Phone", switchOff);
        deviceArray.addDevice("LG", "TV", switchOn);
        System.out.println(deviceArray);
    }
}
