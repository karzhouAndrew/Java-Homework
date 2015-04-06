package workbook2.port;

/**
 * Created by Natashka on 02.04.2015.
 */
public class Warehouse {
    public static final int WAREHOUSE_VOLUME = 10000;
    private int capacity;
    private static Warehouse warehouse;

    private Warehouse() {
    }

    public static synchronized Warehouse getWarehouse() {
        if (warehouse == null) {
            warehouse = new Warehouse();
        }
        return warehouse;
    }

    public synchronized void take(Ship ship) {
        int freeSpace = WAREHOUSE_VOLUME - capacity;
        while (ship.getCapacity() > freeSpace) {
            try {
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (ship.getCapacity() < freeSpace) {
            capacity += ship.getCapacity();
        } else {
            System.out.println("Разгрузка вовремя не удалась " + ship.getId());
        }
    }

    public synchronized void issue(Ship ship) {
        while (capacity < ship.getCapacity()) {
            try {
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (capacity > ship.getCapacity()) {
            capacity -= ship.getCapacity();
        } else {
            System.out.println("Загрузка вовремя не удалась " + ship.getId());
        }
    }
}

