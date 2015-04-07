package workbook.lab24;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vasilevich on 09.03.2015.
 */
public class DeviceArray{
    private List<Device> deviceList = new ArrayList<Device>();

    public DeviceArray() {
    }

    public void addDevice(String brand, String name, boolean isSwitchOn){
        deviceList.add(new Device(brand, name, isSwitchOn));
    }

    @Override
    public String toString() {
        return "DeviceArray{" +
                "deviceList=" + deviceList +
                '}';
    }
}
