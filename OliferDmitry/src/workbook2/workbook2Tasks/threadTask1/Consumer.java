package workbook2.workbook2Tasks.threadTask1;

import java.util.ArrayList;
import java.util.List;

public class Consumer {
    private Name name;
    private List<Food> foodList;
    private int queueNumber;

    public Consumer() {
        this.name = Name.values()[(int)(Math.random() * Name.values().length)];
        this.foodList = randomFoodList();
        this.queueNumber = chooseQueue();
    }

    private List<Food> randomFoodList() {
        List<Food> foods = new ArrayList<Food>();
        int items = (int)(Math.random()*5) + 1;
        for (; items > 0; items--) {
            int foodLength = Food.values().length;
            foods.add(Food.values()[(int)(Math.random()*foodLength)]);
        }
        return foods;
    }

    private static int chooseQueue() {
        return (int)(Math.random() * Main.CHECKOUT_QUANTITY) + 1;
    }

    public int getQueueNumber() {
        return queueNumber;
    }

    @Override
    public String toString() {
        return  name +
                ", Queue#" + queueNumber +
                ", foodList=" + foodList;
    }
}
