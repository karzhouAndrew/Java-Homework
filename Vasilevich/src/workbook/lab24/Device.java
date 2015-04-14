package workbook.lab24;

/**
 * Created by vasilevich on 09.03.2015.
 */
public class Device extends DevicePower {
    private String brand;
    private String name;

    public Device(String brand, String name, boolean isSwitchOn) {
        this.brand = brand;
        this.name = name;
        this.setSwitchIn(isSwitchOn);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand ='" + brand + '\'' +
                ", name ='" + name + '\'' +
                ", power = " + isSwitchIn() +
                '}';
    }
}
