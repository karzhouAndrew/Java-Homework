package workbook2.checkpoint;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Natashka on 02.04.2015.
 */
public class Buyer implements Runnable {
    private ArrayList<Goods> bucket = null;
    private CheckpointPool pool = null;
    private static int counter = 1;
    private int id;

    public Buyer(CheckpointPool pool) {
        this.pool = pool;
        id = counter;
        counter++;
        bucket = new ArrayList<Goods>();
        Goods[] food = Goods.values();
        Random random = new Random();
        int numberOfGoods = random.nextInt(5) + 1;
        for (int i = 0; i < numberOfGoods; i++) {
            bucket.add(food[random.nextInt(food.length)]);
        }
        new Thread(this) {
        }.start();
    }

    public ArrayList<Goods> getBucket() {
        return bucket;
    }

    @Override
    public void run() {
        Checkpoint checkpoint = null;
        try {
            checkpoint = pool.getCheckpoint();
            checkpoint.check(this);
        } catch (Exception e) {
            if (checkpoint != null) {
                System.out.println("Проблемы с доступом в кассу" + checkpoint.getId());
            }
        } finally {
            if (checkpoint != null) {
                pool.putCheckpoint(checkpoint);
            }
        }
    }

    @Override
    public String toString() {
        return "Buyer " + id;
    }
}
