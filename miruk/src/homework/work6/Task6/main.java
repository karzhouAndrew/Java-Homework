package homework.work6.Task6;

/**
 Создать иерархию классов, описывающих банковские карточки.
 Иерархия должна иметь хотя бы три уровня.

 */
public class main {
    public static void main(String[] args) {
        CreditCard card = new CreditCard("Visa","Credit",5);
        System.out.println(card.getType()+", "+card.getSystem());
    }
}
