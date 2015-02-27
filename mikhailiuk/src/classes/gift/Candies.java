package classes.gift;

/**
 * Created by Natashka on 23.02.2015.
 */
public class Candies extends Confection {
    private CandiesType type;

    public Candies(String name, int weight, CandiesType type) {
        super(name, weight);
        this.type = type;

    }

    public CandiesType getType() {
        return type;
    }

    public void setType(CandiesType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Candies{" +
                "type=" + type +super.toString()+
                '}';
    }
}
