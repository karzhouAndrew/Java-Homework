package workbook2.lab10;

/**
 * Created by vasilevich on 03.04.2015.
 */
public class GoodItem {
    private String name;
    private double price;
    private int itemCount;

    public GoodItem(String name, double price, int itemCount) {
        this.name = name;
        this.price = price;
        this.itemCount = itemCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    // метод возвращает количество товара который реально взял покупатель (не более того что в наличии)
    public int decreaseItemCount(int itemCount) {
        if (this.itemCount >= itemCount) {
            this.itemCount -= itemCount;
        } else {
            itemCount = this.itemCount;
            this.itemCount = 0;
        }
        return itemCount;
    }
}
