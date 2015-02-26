package workbook.lab29;

/**
 * Created by Asus on 26.02.2015.
 */
public abstract class BankingOperation {
    private double moneyToCard;
    private double moneyFromCard;
    private double sum;

    public BankingOperation() {
    }

    public double getMoneyToCard() {
        return moneyToCard;
    }

    public void setMoneyToCard(double moneyToCard) {
        this.moneyToCard = moneyToCard;
    }

    public double getMoneyFromCard() {
        return moneyFromCard;
    }

    public void setMoneyFromCard(double moneyFromCard) {
        this.moneyFromCard = moneyFromCard;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    abstract double take(double moneyToCard);
    abstract double give(double moneyFromCard);
}
