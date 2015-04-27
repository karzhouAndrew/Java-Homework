package workbook.lab24;

public class Model2000 {
    public String modelName;
    boolean connectedToTheSocket;
    double price;

    public Model2000() {
    }

    public Model2000(String modelName) {
        this.modelName = modelName;
        connectedToTheSocket = false;
        price = 100;
    }

    public void isConnectedToTheSocket() {
        String str = toString();
        if (connectedToTheSocket) {
            System.out.println(str + " is connected.");
        } else
            System.out.println(str + " isn`t connected.");
    }

    public void setConnectedToTheSocket() {
        connectedToTheSocket = !connectedToTheSocket;
    }

    @Override
    public String toString() {
        return modelName;
    }


}
