package workbook.lab29;

/**
 * Создать иерархию классов, описывающих банковские карточки.
 * Иерархия должна иметь хотя бы три уровня.
 */
public class Test {
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        double moneyToCard = 5000;
        double moneyFromCard = 450;
        debitCard.take(moneyToCard);
        debitCard.give(moneyFromCard);
    }
}
