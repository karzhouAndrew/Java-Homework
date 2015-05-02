package workbook2.workbook2Tasks.threadTask1;

import java.util.List;

public class Checkout implements Runnable {
    private int ID;
    private Thread checkoutThread;
    private List<Consumer> consumerList;

    public Checkout(int ID) {
        this.ID = ID;
        checkoutThread = new Thread(this);
        checkoutThread.start();
    }

    public int getID() {
        return ID;
    }
    @Override
    public void run() {
        startWork();
    }

    private void startWork() {
        consumerList = Main.listArray[this.getID() - 1];
        while (consumerList.size() > 0)
        System.out.println(consumerList.remove(0));
    }

}
