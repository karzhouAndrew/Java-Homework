package workbook2.checkpoint;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

/**
 * Created by Natashka on 02.04.2015.
 */
public class CheckpointPool {
    private Semaphore semaphore = new Semaphore(3);
    private Queue<Checkpoint> queue = null;

    public CheckpointPool() {
        queue = new LinkedList<Checkpoint>();
        queue.add(new Checkpoint());
        queue.add(new Checkpoint());
        queue.add(new Checkpoint());
    }

    public Checkpoint getCheckpoint() {
        try {
            semaphore.acquire();
            return queue.poll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return null;
    }

    public void putCheckpoint(Checkpoint checkpoint) {
        queue.offer(checkpoint);
        semaphore.release();
    }
}
