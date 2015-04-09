package workbook.lab25;

/**
 * Created by vasilevich on 03.03.2015.
 */
public class CreditCard extends CardProcess {
    private final long cardNumber;
    private final String cardOwner;
    private final short pinCode;

    public CreditCard(long cardNumber, String cardOwner, short pinCode) {
        this.cardNumber = cardNumber;
        this.cardOwner = cardOwner;
        this.pinCode = pinCode;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public boolean login(short pinCode) {
        return super.loginCard(pinCode, this.pinCode);
    }

    public boolean logout() {
        return super.logoffCard();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditCard that = (CreditCard) o;

        if (cardNumber != that.cardNumber) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (cardNumber ^ (cardNumber >>> 32));
        result = 31 * result + (cardOwner != null ? cardOwner.hashCode() : 0);
        return result;
    }
}
