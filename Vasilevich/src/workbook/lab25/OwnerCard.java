package workbook.lab25;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 * Created by vasilevich on 03.03.2015.
 */

public class OwnerCard {
    private String firstName;
    private String lastName;
    private TreeSet<CreditCard> creditCardSet = new TreeSet<CreditCard>(new CardComparator());

    public OwnerCard(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private long generateCreditCardNumber() {
        Random random = new Random();
        return Math.abs(random.nextLong());
    }


    public long addCreditCard(long creditCardNumber, short pinCode) {
        if (creditCardNumber == 0) {
            creditCardNumber = generateCreditCardNumber();
            while (creditCardNumber == 0) {
                creditCardNumber = generateCreditCardNumber();
            }
        }
        String fullName = firstName + ' ' + lastName;
        CreditCard card = new CreditCard(creditCardNumber, fullName, pinCode);
        creditCardSet.add(card);
//        if (creditCardSet.add(card)){
        return creditCardNumber;
//        }
//        return 0;
    }

    public CreditCard getCreditCard(long cardNumber) {
        Iterator<CreditCard> cardIterable = creditCardSet.iterator();
        while (cardIterable.hasNext()) {
            CreditCard card = cardIterable.next();
            if (card.equals(new CreditCard(cardNumber, "", (short) 0))) {
                return card;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OwnerCard ownerCard = (OwnerCard) o;

        if (firstName != null ? !firstName.equals(ownerCard.firstName) : ownerCard.firstName != null) return false;
        if (lastName != null ? !lastName.equals(ownerCard.lastName) : ownerCard.lastName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}
