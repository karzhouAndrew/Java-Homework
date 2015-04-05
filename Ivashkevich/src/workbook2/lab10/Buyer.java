package workbook2.lab10;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * Created by Leonid on 03.04.2015.
 */
public class Buyer implements Callable {

    private static int count;
    private int id;
    private HashMap<String, Integer> shoppingCart;
    private TicketWindow ticketWindow;
    private int numberTicket;

    public Buyer(TicketWindow ticketWindow) {

        this.ticketWindow = ticketWindow;
        count++;
        id = id + count;
        shoppingCart = new HashMap<String, Integer>();

    }

    public Map<String, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public String getSignature() {
        return "Buyer " + id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setShoppingCart(HashMap<String, Integer> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public int getNumberTicket() {
        return numberTicket;
    }

    public void setNumberTicket(int numberTicket) {
        this.numberTicket = numberTicket;
    }

    public void getShopping() {
        Shopping.getShopping(shoppingCart);
    }

    public void goToTicked() throws InterruptedException {
        ticketWindow.sayWithBuyer(this);
    }

    @Override
    public Object call() throws Exception {
        getShopping();
        try {
            goToTicked();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
