package classes.gift;

/**
 * Created by Natashka on 23.02.2015.
 */
public class Wafers extends Confection {
    private boolean stuffed;

    public Wafers(String name, int weight, boolean stuffed) {
        super(name, weight);
        this.stuffed = stuffed;
    }

    public Wafers(boolean stuffed) {
        this.stuffed = stuffed;
    }
    @Override
    public String toString() {
        return "Wafers{" +
                "type=" + stuffed +super.toString()+
                '}';
    }
}
