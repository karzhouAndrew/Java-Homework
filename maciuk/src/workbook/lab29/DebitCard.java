package workbook.lab29;

/**
 * Created by Asus on 26.02.2015.
 */
public class DebitCard extends IndividualsOperations {
    private double moneyToCard;
    private double moneyFromCard;
    private double sum;

    public DebitCard() {
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
        System.out.println("Зачисление денежных средст прошло успешно");
        System.out.println("Остаток на счете = " + (sum + moneyToCard));
        sum = sum + moneyToCard;
        return sum + moneyToCard;

    }

    @Override
    double give(double moneyFromCard) {
        if(moneyFromCard <= sum) {
            System.out.println("Выдача денежных средст прошла успешно");
            System.out.println("Остаток на счете = " + (sum - moneyFromCard));
            sum = sum - moneyFromCard;
            return sum - moneyFromCard;
        }
        return sum;
    }
}
