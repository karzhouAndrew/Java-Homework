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
        Check check = new Check();
        check.setNumberTicket(buyer.getNumberTicket());
        check.setNameCashier(nameCashier);
        GregorianCalendar data = new GregorianCalendar();
        Date time = data.getTime();
        check.setDate(time);
        Thread.sleep(buyer.getShoppingCart().size() * 50);
        Integer costOfPurchases = 0;
        for (Map.Entry entry : buyer.getShoppingCart().entrySet()) {
            check.setShoppingList(entry.toString());
            Integer cost = (Integer) entry.getValue();
            costOfPurchases += cost;
        }
        check.setCostOfPurchases(costOfPurchases);
        check.setSignature(buyer.getSignature());
        System.out.println(check);
    }
}
