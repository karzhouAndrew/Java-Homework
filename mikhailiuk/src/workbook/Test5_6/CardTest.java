package workbook.Test5_6;

/**
 * Created by Natashka on 25.02.2015.
 */
public class CardTest {
    public static void main(String[] args) {
        BankCard bankCard = new ChipCard("0321654987");
        bankCard.writingCardData(bankCard);
        bankCard.printCardData(bankCard);
        bankCard = new CoBrandingCard("Petr", "Petrov", "01/16","9874 6541 6587 1456", "321",  "Masercard Standart", "0000",
                "0123336655", "Korona", 2);
        bankCard.printCardData(bankCard);
        BankCard bankCard1=new CoBrandingCard("456987123","ProStore",5);
        bankCard1.writingCardData(bankCard1);
        bankCard1.printCardData(bankCard1);
    }
}
