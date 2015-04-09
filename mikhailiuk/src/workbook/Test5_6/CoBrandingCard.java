package workbook.Test5_6;

/**
 * Created by Natashka on 25.02.2015.
 */
public class CoBrandingCard extends ChipCard {
private String brand;
    private int discount;

    public CoBrandingCard(String brand, int discount) {
        this.brand = brand;
        this.discount = discount;
    }

    public CoBrandingCard(String chipData, String brand, int discount) {
        super(chipData);
        this.brand = brand;
        this.discount = discount;
    }

    public CoBrandingCard(String holderName, String holderSurname, String termOfValidity, String cardNumber, String cvcCode, String cardType, String pin, String chipData, String brand, int discount) {
        super(holderName, holderSurname, termOfValidity, cardNumber, cvcCode, cardType, pin, chipData);
        this.brand = brand;
        this.discount = discount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public void printCardData(BankCard bankCard) {
        super.printCardData(bankCard);
        System.out.println("Бренд "+ getBrand()+" скидка "+getDiscount());
    }
}
