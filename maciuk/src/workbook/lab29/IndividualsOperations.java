package workbook.lab29;

/**
 * Created by Asus on 26.02.2015.
 */
public abstract class IndividualsOperations extends BankingOperation {
    private double moneyToCard;
    private double moneyFromCard;
    private double sum;

    public IndividualsOperations() {
    }

    @Override
    public double getMoneyToCard() {
        return moneyToCard;
    }

    @Override
    public void setMoneyToCard(double moneyToCard) {
        this.moneyToCard = moneyToCard;
    }

    @Override
    public double getMoneyFromCard() {
        return moneyFromCard;
    }

    @Override
    public void setMoneyFromCard(double moneyFromCard) {
        this.moneyFromCard = moneyFromCard;
    }

    @Override
    public double getSum() {
        return sum;
    }

    @Override
    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    double take(double moneyToCard) {
        return 0;
    }

    @Override
    double give(double moneyFromCard) {
        return 0;
    }
}
