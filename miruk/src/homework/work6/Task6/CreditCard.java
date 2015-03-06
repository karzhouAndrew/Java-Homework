package homework.work6.Task6;

/**
 * Created by Tonya on 05.03.2015.
 */
public class CreditCard extends TypeCard {
    private int percent;

    public CreditCard(String system,String type, int percent){
        super(type, system);
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
