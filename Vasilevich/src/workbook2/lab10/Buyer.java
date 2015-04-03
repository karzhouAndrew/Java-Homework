package workbook2.lab10;

import java.util.List;

/**
 * Created by vasilevich on 03.04.2015.
 */
public class Buyer {
    private String name;
    private List<GoodItem> purchase;
    private volatile boolean isBuyerInOrder;

    public Buyer(String name, List<GoodItem> purchase) {
        this.name = name;
        this.purchase = purchase;
        isBuyerInOrder = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GoodItem> getPurchase() {
        return purchase;
    }

    public boolean isBuyerInOrder() {
        return isBuyerInOrder;
    }

    public void setBuyerInOrder(boolean isBuyerInOrder) {
        this.isBuyerInOrder = isBuyerInOrder;
    }

    public void setPurchase(List<GoodItem> purchase) {
        this.purchase = purchase;
    }
}
