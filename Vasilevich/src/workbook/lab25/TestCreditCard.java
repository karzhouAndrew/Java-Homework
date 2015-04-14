package workbook.lab25;

/**
 * Created by vasilevich on 03.03.2015.
 * Создать иерархию классов, описывающих банковские карточки. Иерархия должна иметь хотя бы три уровня.
 */
public class TestCreditCard {
    public static void main(String[] args) {
        OwnerCardList ownerCardList = new OwnerCardList();
        OwnerCard owner1 = ownerCardList.addOwnerCard();
        OwnerCard owner2 = ownerCardList.addOwnerCard();
        long creditCardNumber1 = owner1.addCreditCard(0, (short) 1234);
        long creditCardNumber2 = owner1.addCreditCard(0, (short) 4356);
        long creditCardNumber3 = owner1.addCreditCard(0, (short) 5216);
        CreditCard creditCard1 = owner1.getCreditCard(creditCardNumber1);
        CreditCard creditCard2 = owner1.getCreditCard(creditCardNumber2);
        CreditCard creditCard3 = owner1.getCreditCard(creditCardNumber3);

        System.out.println("Sum at credit card2 = " + creditCard2.showSumMoneyAtCard());
        if (creditCard2.login((short) 4356)) {
            // Доступ к карте открыт. Можно проводить операции
            System.out.println("Sum at credit card2 = " + creditCard2.showSumMoneyAtCard());
            creditCard2.putMoneyToCard(200000);
            System.out.println("Sum at credit card2 = " + creditCard2.showSumMoneyAtCard());
            creditCard2.logout();
        }
        // Доступ к карте закрыт
        System.out.println("Sum at credit card2 = " + creditCard2.showSumMoneyAtCard());

        System.out.println("Sum at credit card3 = " + creditCard3.showSumMoneyAtCard());
        if (creditCard3.login((short) 5216)) {
            // Доступ к карте открыт. Можно проводить операции
            System.out.println("Sum at credit card3 = " + creditCard3.showSumMoneyAtCard());
            creditCard3.putMoneyToCard(35567);
            System.out.println("Sum at credit card3 = " + creditCard3.showSumMoneyAtCard());
            creditCard3.logout();
        }
        // Доступ к карте закрыт
        System.out.println("Sum at credit card3 = " + creditCard3.showSumMoneyAtCard());

    }
}
