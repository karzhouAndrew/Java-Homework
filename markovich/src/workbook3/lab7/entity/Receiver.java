package workbook3.lab7.entity;

public class Receiver {
    private int idReceiver;
    private String nameReceiver;

    public Receiver() {
    }

    public Receiver(int idReceiver, String nameReceiver) {
        this.idReceiver = idReceiver;
        this.nameReceiver = nameReceiver;
    }

    public int getIdReceiver() {
        return idReceiver;
    }

    public void setIdReceiver(int idReceiver) {
        this.idReceiver = idReceiver;
    }

    public String getNameReceiver() {
        return nameReceiver;
    }

    public void setNameReceiver(String nameReceiver) {
        this.nameReceiver = nameReceiver;
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "idReceiver=" + idReceiver +
                ", nameReceiver='" + nameReceiver + '\'' +
                '}';
    }
}
