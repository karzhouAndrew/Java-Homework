package workbook.Test5_5;

/**
 * Created by Natashka on 22.02.2015.
 */
public class Freezer extends CoolingAppliances {
    private int storageTime;

    public Freezer(int storageTime) {
        this.storageTime = storageTime;
    }

    public Freezer() {
    }

    public int getStorageTime() {
        return storageTime;
    }

    public void setStorageTime(int storageTime) {
        this.storageTime = storageTime;
    }
    @Override
    public void on (){
        System.out.println("Морозильник Включен");
    }

    @Override
    public void off() {
        System.out.println("Морозильник Выключен");
    }
}
