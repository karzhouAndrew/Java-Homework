package gift;


public class Chocolate extends Confection {

    private String color;

    public Chocolate(String name, int weight, String color) {
        super(name, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "color=" + color + "  " + super.toString() +
                "} ";
    }
}
