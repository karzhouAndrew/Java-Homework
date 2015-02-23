package homework.lesson9.homeAppliances;

public class CitchenAppliances extends LargeTechnics {

    double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        System.out.println("price = " + price);
    }
}
