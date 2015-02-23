package gift;

public class Wafers extends Confection {

    private boolean stuffed;


    public Wafers(String name, int weight, boolean stuffed) {
        super(name, weight);
        this.stuffed = stuffed;
    }

    public boolean isStuffed() {
        return stuffed;
    }

    public void setStuffed(boolean stuffed) {
        this.stuffed = stuffed;
    }

    @Override
    public String toString() {
        return "Wafers{" +
                "stuffed=" + stuffed + "  " + super.toString() +
                "} ";
    }
}
