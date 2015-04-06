package workbook2.port;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/**
 * Created by Natashka on 05.04.2015.
 */
public class BerthPool {
    private Semaphore semaphore=new Semaphore(10);
    private Queue<Berth> shipQueue =null;

    public BerthPool() {
        shipQueue=new LinkedBlockingQueue<Berth>(10);
        for (int i = 0; i < 10; i++) {
            shipQueue.add(new Berth());
        }
    }
  public Berth getBerth(){
      try {
          semaphore.acquire();
          return shipQueue.poll();
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      return null;
  }
    public void putBerth(Berth berth){
        shipQueue.offer(berth);
        semaphore.release();
    }
}
