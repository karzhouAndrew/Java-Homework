package workbook3.lab7.entity;

public class Expense {

    private int idExpense;
    private String paydate;
    private String receiver;
    private int value;

    public Expense() {
    }

    public Expense(int idExpense, String paydate, String receiver, int value) {
        this.idExpense = idExpense;
        this.paydate = paydate;
        this.receiver = receiver;
        this.value = value;
    }

    public int getIdExpense() {
        return idExpense;
    }

    public void setIdExpense(int idExpense) {
        this.idExpense = idExpense;
    }

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate(String paydate) {
        this.paydate = paydate;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "idExpense=" + idExpense +
                ", paydate='" + paydate + '\'' +
                ", receiver=" + receiver +
                ", value=" + value +
                '}';
    }
}
