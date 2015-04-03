package workbook2.lab10;

/**
 * Created by vasilevich on 03.04.2015.
 */
public class CashierWindow {
    private String name;
    private static int ID;

    public CashierWindow(String name) {
        this.name = name + ID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double paimentProcedure(Buyer buyer) {
        double cash = 0;
        for (GoodItem item : buyer.getPurchase()) {
            cash += item.getItemCount() * item.getPrice();
        }
        return cash;
    }

}
