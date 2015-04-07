package workbook2.lab10;

import java.util.concurrent.*;

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
        BlockingQueue<TicketWindow>ticketWindowArrayBlockingQueue = new ArrayBlockingQueue<TicketWindow>(3);
        ticketWindowArrayBlockingQueue.add(new TicketWindow());
        ticketWindowArrayBlockingQueue.add(new TicketWindow());
        ticketWindowArrayBlockingQueue.add(new TicketWindow());

        ExecutorService pool = Executors.newFixedThreadPool(ticketWindowArrayBlockingQueue.size());
        for (int i = 0; i < 10; i++) {
            TicketWindow t = ticketWindowArrayBlockingQueue.take();
            pool.submit(new Buyer(t));
            ticketWindowArrayBlockingQueue.put(t);

        }
        pool.shutdown();
    }
}
