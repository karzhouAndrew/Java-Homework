package workbook2.port;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Natashka on 02.04.2015.
 */
public class Berth {
    private static int counter = 1;
    private int id;

    public Berth() {
        id = counter;
        counter++;
    }

    public int getId() {
        return id;
    }

    public synchronized void serviceShip(Ship ship) {
        System.out.println("Причал №" + id);
        Warehouse warehouse = null;
        do {
            warehouse = Warehouse.getWarehouse();
        } while (warehouse == null);
        if (ship.isOnWarehouse()) {
            System.out.println("Корабль: " + ship.getId());
            if (ship.isLoad()) {
                warehouse.issue(ship);
                System.out.println("Загружен со склада" + ship.getCapacity());
            } else {
                warehouse.take(ship);
                System.out.println("Выгружен на склад" + ship.getCapacity());
            }
        }
    }
}
