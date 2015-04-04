package workbook2.checkpoint;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Natashka on 02.04.2015.
 */
public class Checkpoint {
    private static int counter = 1;
    private int id;
    private StringBuilder checkTape;
    private Lock lock = new ReentrantLock();

    public Checkpoint() {
        id = counter;
        counter++;
    }

    public StringBuilder getCheckTape() {
        return checkTape;
    }

    public void setCheckTape(StringBuilder checkTape) {
        this.checkTape = checkTape;
    }

    public int getId() {
        return id;
    }

    public void check(Buyer buyer) {
        lock.lock();
        try {
            checkTape = new StringBuilder();
            ArrayList<Goods> bucket = buyer.getBucket();
            double total = 0;
            checkTape.append(buyer.toString()).append("\r\n");
            for (Goods goods : bucket) {
                checkTape.append(goods).append(" ").append(goods.getPrice()).append("\r\n");
                total += goods.getPrice();
            }
            checkTape.append("Total: ").append(total).append("\r\n");
            System.out.println(checkTape.toString());
        } catch (Exception e) {
            System.out.println("Проблемы на кассе " + id);
        } finally {
            lock.unlock();
        }
    }
}