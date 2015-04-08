package workbook3.test456.entity;

/**
 * Created by Natashka on 07.04.2015.
 */
public class Expense {
    private int id;
    private String payDate;
    private int receiver;
    private double amount;

    public Expense(int id, String payDate, int receiver, double amount) {
        this.id = id;
        this.payDate = payDate;
        this.receiver = receiver;
        this.amount = amount;
    }

    public Expense() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public int getReceiver() {
        return receiver;
    }

    public void setReceiver(int receiver) {
        this.receiver = receiver;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", payDate='" + payDate + '\'' +
                ", receiver=" + receiver +
                ", amount=" + amount +
                '}';
    }
}
