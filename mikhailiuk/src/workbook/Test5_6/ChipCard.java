package workbook.Test5_6;

/**
 * Created by Natashka on 25.02.2015.
 */
public class ChipCard extends BankCard {
    private String chipData;

    public String getChipData() {
        return chipData;
    }

    public void setChipData(String chipData) {
        this.chipData = chipData;
    }

    public ChipCard() {
    }

    public ChipCard(String chipData) {
        this.chipData = chipData;
    }

    public ChipCard(String holderName, String holderSurname, String termOfValidity, String cardNumber, String cvcCode, String cardType, String pin, String chipData) {
        super(holderName, holderSurname, termOfValidity, cardNumber, cvcCode, cardType, pin);
        this.chipData = chipData;
    }

    @Override
    public void printCardData(BankCard bankCard) {
        super.printCardData(bankCard);
        System.out.println("Данные чипа " + getChipData());
    }
}
