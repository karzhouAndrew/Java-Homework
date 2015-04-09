package workbook.Test5_6;

/**
 * Created by Natashka on 25.02.2015.
 */
public abstract class BankCard {
    private String holderName;
    private String holderSurname;
    private String termOfValidity;
    private String cardNumber;
    private String cvcCode;
    private String cardType;
    private String pin;

    public BankCard() {
    }

    public BankCard(String holderName, String holderSurname, String termOfValidity, String cardNumber, String cvcCode,
                    String cardType, String pin) {
        this.holderName = holderName;
        this.holderSurname = holderSurname;
        this.termOfValidity = termOfValidity;
        this.cardNumber = cardNumber;
        this.cvcCode = cvcCode;
        this.cardType = cardType;
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getTermOfValidity() {
        return termOfValidity;
    }

    public void setTermOfValidity(String termOfValidity) {
        this.termOfValidity = termOfValidity;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardType() {
        return cardType;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderSurname() {
        return holderSurname;
    }

    public void setHolderSurname(String holderSurname) {
        this.holderSurname = holderSurname;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvcCode() {
        return cvcCode;
    }

    public void setCvcCode(String cvcCode) {
        this.cvcCode = cvcCode;
    }

    public BankCard writingCardData(BankCard bankCard) {
        setCardNumber("1234 5678 9000 1234");
        setCvcCode("012");
        setHolderName("Ivan");
        setHolderSurname("Ivanov");
        setTermOfValidity("02/17");
        setCardType("Visa Electron");
        setPin("0321");
        return bankCard;
    }

    public void printCardData(BankCard bankCard) {
        System.out.println("Номер карточки " + getCardNumber());
        System.out.println("CVC код " + getCvcCode());
        System.out.println("Имя владельца " + getHolderName());
        System.out.println("Фамилия владельца " + getHolderSurname());
        System.out.println("Срок действия " + getTermOfValidity());
        System.out.println("Тип карточки " + getCardType());
        System.out.println("PIN " + getPin());
    }
}
