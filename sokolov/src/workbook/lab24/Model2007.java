package workbook.lab24;

public class Model2007 extends Model2000 {
    private int timer;

    Model2007() {

    }

    public Model2007(String modelName) {
        super(modelName);
        price = 200;
        timer = -1;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }
}
