package workbook.lab25;

import java.util.Comparator;

/**
 * Created by Sam on 08.03.2015.
 */
public class CardComparator implements Comparator<CreditCard> {
    public int compare(CreditCard card1, CreditCard card2) {
        return (int) (card1.getCardNumber() - card2.getCardNumber());
    }


}
