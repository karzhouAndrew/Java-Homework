package workbook2.checkpoint;

/**
 * Created by Natashka on 02.04.2015.
 */
public enum Goods {
    CHICKEN(1.95), APPLES(0.23), WATER(0.12), COCA_COLA(1.02), PORK(3.54), POTATO(0.36), BREAD(0.78), MILK(0.65);
    private double price;

    Goods(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
