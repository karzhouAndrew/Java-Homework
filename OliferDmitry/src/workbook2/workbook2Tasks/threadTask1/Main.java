package workbook2.workbook2Tasks.threadTask1;

import java.util.LinkedList;
import java.util.List;

public class Main {
    static final int CHECKOUT_QUANTITY = 3;
    static int consumerQuantity = 300;
    public static List<Consumer>[] listArray = new List[CHECKOUT_QUANTITY];

    public static void main(String[] args) {
        Checkout[] checkout  = new Checkout[CHECKOUT_QUANTITY];
        Consumer[] consumer = new Consumer[consumerQuantity];

        for (int  i = 0; i < CHECKOUT_QUANTITY; i++) {
            listArray[i] = new LinkedList<Consumer>();
            checkout[i] = new Checkout(i + 1);
        }
        for (int  i = 0; i < consumerQuantity; i++) {
            consumer[i] = new Consumer();
            int queueNumber = consumer[i].getQueueNumber() - 1;
            listArray[queueNumber].add(consumer[i]);
        }



    }
}
