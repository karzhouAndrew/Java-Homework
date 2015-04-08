package workbook3.test456.entity;

/**
 * Created by Natashka on 07.04.2015.
 */
public class Receiver {
    private int id;
    private String receiverName;

    public Receiver(int id, String receiverName) {
        this.id = id;
        this.receiverName = receiverName;
    }

    public Receiver() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "id=" + id +
                ", receiverName='" + receiverName + '\'' +
                '}';
    }
}
