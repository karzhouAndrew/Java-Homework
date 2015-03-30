package workbook.classesAndInterfaces.task06;

public class Maestro implements Resident, NonResident {
    private Type cardType;
    private Currency cardCurr;
    private String bank;
    private String cardOwner;
    private String cardNumber;

    public Maestro(Type cardType, Currency cardCurr, String bank, String cardOwner, String cardNumber) {
        this.cardType = cardType;
        this.cardCurr = cardCurr;
        this.bank = bank;
        this.cardOwner = cardOwner;
        this.cardNumber = cardNumber;
    }

    public Type getCardType() {
        return cardType;
    }

    public void setCardType(Type cardType) {
        this.cardType = cardType;
    }

    public Currency getCardCurr() {
        return cardCurr;
    }

    public void setCardCurr(Currency cardCurr) {
        this.cardCurr = cardCurr;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void printOwner() {
        System.out.println("Card owner is " + this.getCardOwner());
    }
}
