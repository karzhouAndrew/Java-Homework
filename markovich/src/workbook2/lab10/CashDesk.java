package workbook2.lab10;

import java.util.Map;

public class CashDesk implements Runnable {
    private static int idCashDesk = 0;
    private QueueBuyers buyerQueue;
    private int capacity;
    private String name;

    public CashDesk(QueueBuyers queueBuyers, int capacity) {
        this.name = generateCashDeskName();
        this.buyerQueue = queueBuyers;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    private String generateCashDeskName() {
        return "CashDesk #" + ++idCashDesk;
    }

    private void serveBuyer() {
        for (int i = 0; i < capacity; i++) {
            Buyer buyer = buyerQueue.getBuyer();
            if (buyer == null) {
                return;
            }
            System.out.println(this.getName() + " begins to service the buyer " + buyer.getName());

            Map<Product, Integer> productList = buyer.getProductList();
            for (Map.Entry<Product, Integer> product : productList.entrySet()) {
                System.out.println("\t\tAt " +
                        this.getName() + " " +
                        buyer.getName() + " paid " +
                        product.getKey() + " in the amount of " +
                        product.getValue() + " pieces");
            }

            System.out.println(this.getName() + " has been serving customer " + buyer.getName());
        }
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void run() {
        serveBuyer();
    }
}
