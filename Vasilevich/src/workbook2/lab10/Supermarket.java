package workbook2.lab10;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by vasilevich on 03.04.2015.
 */
public class Supermarket {
    private int cashierWindowCount;
    private int buyerCount;
    private List<GoodItem> goodAssortment = new ArrayList<GoodItem>();
    private Queue<Buyer> buyerQueue;

    // касса магазина с наличными
    private volatile double supermarketCash;
    // данные для конечного переучета = на столько денег в магазине присутствует товара
    private final double finalCash;


    public Supermarket(int cashierWindowCount, int buyerCount) {
        this.cashierWindowCount = cashierWindowCount;
        this.buyerCount = buyerCount;

        Random random = new Random();
        goodAssortment.add(new GoodItem("Toilet paper", 1.65, 1000));
        goodAssortment.add(new GoodItem("Toothpaste", 3.2, 5000));
        goodAssortment.add(new GoodItem("Spoon", 1.2, 400));
        goodAssortment.add(new GoodItem("Fork", 1.3, 400));
        goodAssortment.add(new GoodItem("Knife", 15.6, 100));
        goodAssortment.add(new GoodItem("Plate", 2.5, 200));
        goodAssortment.add(new GoodItem("Cap", 3.1, 300));

        // подсчитываем товар для окончательного переучета после закрытия магазина
        double cash = 0;
        for (GoodItem item : goodAssortment) {
            cash += item.getPrice() * item.getItemCount();
        }
        this.finalCash = cash;

        // Создаем список покупателей
        buyerQueue = new ArrayDeque<Buyer>();
        for (int buyerInd = 0; buyerInd < buyerCount; buyerInd++) {
            int purchaseNum = random.nextInt(3) + 1;
            List<GoodItem> buyerOrderList = new ArrayList<GoodItem>();

            // Составляем корзину с покупками для покупателя из возможного ассортимента магазина и его количества
            for (int purchaseItem = 0; purchaseItem < purchaseNum; purchaseItem++) {
                int goodsIndNeedToBuyer = random.nextInt(goodAssortment.size());
                int goodsCountNeedToBuyer = random.nextInt(20);
                //уточняем сколько покупатель действительно может приобрести данного товара
                goodsCountNeedToBuyer = goodAssortment.get(goodsIndNeedToBuyer).decreaseItemCount(goodsCountNeedToBuyer);
                GoodItem goods = goodAssortment.get(goodsIndNeedToBuyer);
                buyerOrderList.add(new GoodItem(goods.getName(), goods.getPrice(), goodsCountNeedToBuyer));
            }
            buyerQueue.add(new Buyer("Buyer " + buyerInd, buyerOrderList));
        }
    }

    private synchronized void addMoneyToSupermarketCash(double money) {
        supermarketCash += money;
    }

    private Buyer getFreeBuyerFromOrder() {
        return buyerQueue.poll();
    }

    public void startWorkCashier() {
        ExecutorService poolBuyer = Executors.newFixedThreadPool(cashierWindowCount);

        for (int poolInd = 0; poolInd < cashierWindowCount; poolInd++) {
            poolBuyer.execute(new Runnable() {
                @Override
                public void run() {
                    CashierWindow cashier = new CashierWindow("Cashier ");

                    Buyer buyer = getFreeBuyerFromOrder();
                    while (buyer != null) {
                        System.out.println("Start  service " + cashier.getName() + " with " + buyer.getName());
                        double cash = cashier.paimentProcedure(buyer);
                        try {
                            Thread.currentThread().sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        addMoneyToSupermarketCash(cash);
                        System.out.println("Finish service " + cashier.getName() + " with " + buyer.getName() + " SUM = " + cash);
                        buyer = getFreeBuyerFromOrder();
                    }
                }
            });
        }
        try {
            poolBuyer.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkSupermarketCashAfterWork() {
        double cash = 0;
        for (GoodItem item : goodAssortment) {
            cash += item.getPrice() * item.getItemCount();
        }

        System.out.println("Касса магазина после закрытия = " + supermarketCash + "(наличные) + " + cash + "(в товаре)");
        cash += supermarketCash;
        System.out.println("Касса магазина после закрытия ВСЕГО = " + cash);
        System.out.println("Касса магазина для проверки   = " + this.finalCash);

        cash -= this.finalCash;
        System.out.println("Украдено денег  = " + cash);
    }


}
