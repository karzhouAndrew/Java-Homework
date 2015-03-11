package homework.work6.Task5;

/**
 * Created by Tonya on 05.03.2015.
 */
public class Microwalve extends Device {
    private int power;
    public Microwalve(){
        super();
        power = 0;
    }
    public Microwalve(int power, boolean enable){
        super(enable);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
