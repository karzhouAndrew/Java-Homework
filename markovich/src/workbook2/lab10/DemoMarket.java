package workbook2.lab10;

/**
 * Напишите программу, моделирующую кассы в магазине. Существует несколько касс, работающих одновременно.
 * Каждый покупатель — от-дельный поток. Общее количество покупателей может быть больше чем количество касс,
 * но одновременно не может обрабатываться больше по-купателей, чем имеется рабочих касс.
 * У каждого покупателя есть набор то-варов, которые  должны быть выведены  в процессе обслуживания.
 */
public class DemoMarket {

    private static final int quantityBuyers = 10;

    public static void main(String[] args) throws InterruptedException {

        QueueBuyers queueBuyers = QueueBuyers.createQueueBuyers(quantityBuyers);

        System.out.println(queueBuyers);
        System.out.println("----------------------------------------");

        Thread thread1 = new Thread(new CashDesk(queueBuyers, quantityBuyers));
        Thread thread2 = new Thread(new CashDesk(queueBuyers, quantityBuyers));
        Thread thread3 = new Thread(new CashDesk(queueBuyers, quantityBuyers));

        thread1.start();
        thread2.start();
        thread3.start();

        Thread.sleep(2000);

        System.out.println("----------------------------------------");
        System.out.println("The number of customers in the queue - " +  queueBuyers.getNumberBuyers());
    }
}
