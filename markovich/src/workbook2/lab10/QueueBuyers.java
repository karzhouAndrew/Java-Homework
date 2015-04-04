package workbook2.lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueBuyers{
    private Queue<Buyer> buyers;

    private QueueBuyers(int capacity) {
        this.buyers = new LinkedBlockingDeque<>(capacity);
    }

    public static QueueBuyers createQueueBuyers(int capacity) {
        List<Buyer> buyerList = new ArrayList<Buyer>();
        for (int i = 0; i < capacity; i++) {
            buyerList.add(new Buyer());
        }
        QueueBuyers queueBuyers = new QueueBuyers(capacity);
        queueBuyers.buyers.addAll(buyerList);
        return queueBuyers;
    }

    public Buyer getBuyer() {
        return buyers.poll();
    }

    public int getNumberBuyers(){
        return buyers.size();
    }

    @Override
    public String toString() {
        return "QueueBuyers{" +
                "buyers=" + buyers +
                '}';
    }

}
