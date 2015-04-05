package workbook2.lab10;

/**
 * Created by Leonid on 03.04.2015.
 */
public class TicketWindow {
    private Cashier cashier;
    private static int count;
    private int numberTicket;

    public int getNumberTicket() {
        return numberTicket;
    }

    public void setNumberTicket(int numberTicket) {
        this.numberTicket = numberTicket;
    }

    public TicketWindow() {
        count++;
        numberTicket = numberTicket + count;
        cashier = new Cashier(numberTicket);

    }

    public synchronized void sayWithBuyer(Buyer buyer) throws InterruptedException {
        buyer.setNumberTicket(numberTicket);
        cashier.cater(buyer);

    }
}
