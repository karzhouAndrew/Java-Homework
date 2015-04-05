package workbook2.lab10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Напишите программу, моделирующую кассы в магазине. Существует несколько касс,
 * работающих одновременно. Каждый покупатель — отдельный поток. Общее количество
 * покупателей может быть больше чем количество касс, но одновременно не может
 * обрабатываться больше по-купателей, чем имеется рабочих касс. У каждого покупателя
 * есть набор товаров, которые  должны быть выведены  в процессе обслуживания.
 * -----------------------------------
 * Date= Sun Apr 05 14:17:33 FET 2015
 * Cashier= NATALIA
 * numberTicket: 1
 *
 * shoppingList:
 * TOOTHPASTE=19700
 * BREAD=9200
 * SOAP_BAR=8250
 * PASTA=13050
 * costOfPurchases= 50200
 * signature= Buyer 7
 * -----------------------------------
 */
public class Load {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<TicketWindow> ticketWindowConcurrentLinkedQueue = new LinkedBlockingQueue<TicketWindow>();
        ticketWindowConcurrentLinkedQueue.add(new TicketWindow());
        ticketWindowConcurrentLinkedQueue.add(new TicketWindow());
        ticketWindowConcurrentLinkedQueue.add(new TicketWindow());

        ExecutorService pool = Executors.newFixedThreadPool(ticketWindowConcurrentLinkedQueue.size());
        for (int i = 0; i < 1000; i++) {
            TicketWindow t = ticketWindowConcurrentLinkedQueue.take();
            pool.submit(new Buyer(t));
            ticketWindowConcurrentLinkedQueue.put(t);

        }
        pool.shutdown();
    }
}
