package workbook.lab24;

public class Model2014 extends Model2007 {
    private boolean internetConnection;


    Model2014(String modelName) {
        super(modelName);
        price = 700;
    }

    public boolean isInternetConnection() {
        return internetConnection;
    }

    public void setInternetConnection() {
        internetConnection = !internetConnection;
    }
}
