package workbook2.port;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * система порт
 */
public class PortTest {
    public static void main(String[] args) {
       BerthPool berthPool=new BerthPool();
        for (int i = 0; i < 20; i++) {
            new Thread(new Ship(berthPool)).start();
        }
    }
} 
