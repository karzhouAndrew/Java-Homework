package workbook2.lab10;


import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;

/**
 * Created by Leonid on 03.04.2015.
 */
public class Cashier {
    private String nameCashier;

    public Cashier(int numberTicket) {
        nameCashier = String.valueOf(CashierName.values()[numberTicket % CashierName.values().length]);
    }

    public void cater(Buyer buyer) throws InterruptedException {
        CashVoucher cashVoucher = new CashVoucher();
        cashVoucher.setNumberTicket(buyer.getNumberTicket());
        cashVoucher.setNameCashier(nameCashier);
        GregorianCalendar data = new GregorianCalendar();
        Date time = data.getTime();
        cashVoucher.setDate(time);
        Thread.sleep(buyer.getShoppingCart().size() * 50);
        Integer costOfPurchases = 0;
        for (Map.Entry entry : buyer.getShoppingCart().entrySet()) {
            cashVoucher.setShoppingList(entry.toString());
            Integer cost = (Integer) entry.getValue();
            costOfPurchases += cost;
        }
        cashVoucher.setCostOfPurchases(costOfPurchases);
        cashVoucher.setSignature(buyer.getSignature());
        System.out.println(cashVoucher);
    }
}
