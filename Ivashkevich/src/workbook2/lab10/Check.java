package workbook2.lab10;

import java.util.Date;

/**
 * Created by Leonid on 05.04.2015.
 */
public class Check {
    private int numberTicket;
    private String nameCashier;
    private Date date;
    private StringBuilder shoppingList = new StringBuilder();
    private int costOfPurchases;
    private String signature;

    public StringBuilder getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(String shopping) {
        shoppingList.append(shopping);
        shoppingList.append("\n");
    }

    public String getNameCashier() {
        return nameCashier;
    }

    public void setNameCashier(String nameCashier) {
        this.nameCashier = nameCashier;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCostOfPurchases() {
        return costOfPurchases;
    }

    public void setCostOfPurchases(int costOfPurchases) {
        this.costOfPurchases = costOfPurchases;
    }

    public int getNumberTicket() {
        return numberTicket;
    }

    public void setNumberTicket(int numberTicket) {
        this.numberTicket = numberTicket;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "-----------------------------------\n" +
                "Date= " + date +
                "\nCashier= " + nameCashier +
                "\nnumberTicket: " + numberTicket +
                "\n\nshoppingList:\n" + shoppingList +
                "costOfPurchases= " + costOfPurchases +
                "\nsignature= " + signature +
                "\n-----------------------------------"
                ;
    }
}