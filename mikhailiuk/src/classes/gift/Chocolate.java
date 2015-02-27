package classes.gift;

/**
 * Created by Natashka on 23.02.2015.
 */
public class Chocolate extends Confection {
    private String color;

    public Chocolate(String name, int weight, String color) {
        super(name, weight);
        this.color = color;
    }

    public Chocolate(String color) {
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
                "type=" + color +super.toString()+
                '}';
    }
}
