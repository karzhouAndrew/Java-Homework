package workbook2.port;

import java.util.Random;

/**
 * Created by Natashka on 02.04.2015.
 */
public class Ship implements Runnable {
    private int id;
    private static int counter = 1;
    private int capacity;
    private boolean load;
    private boolean onWarehouse;
    private BerthPool berthPool = null;

    public Ship(BerthPool berthPool) {
        this.berthPool = berthPool;
        id = counter;
        counter++;
        capacity = new Random().nextInt(1000);
        load = new Random().nextBoolean();
        onWarehouse = true;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isLoad() {
        return load;
    }

    public boolean isOnWarehouse() {
        return onWarehouse;
    }

    @Override
    public void run() {
        Berth berth = berthPool.getBerth();
        berth.serviceShip(this);
        berthPool.putBerth(berth);
    }
}

