package workbook.lab25;

/**
 * Создать иерархию классов, описывающих банковские карточки.
 * Иерархия должна иметь хотя бы три уровня.
 */
public class OperationsWithCC {
    public static void main(String[] args) {
        Debit debit = new Debit("Vasja",20000);
        Credit credit = new Credit("Rembo",0);
        CashBack cashBack = new CashBack("Skrudg",30000);

        System.out.println(debit);
        System.out.println(credit);
        System.out.println(cashBack);
        System.out.println();
        debit.withdrawalOfMoney(30000);
        credit.withdrawalOfMoney(30000);
        cashBack.withdrawalOfMoney(30000);
        System.out.println();
        debit.replenishmentBalance(50000);
        credit.replenishmentBalance(50000);
        cashBack.replenishmentBalance(50000);
        System.out.println();
        System.out.println(debit);
        System.out.println(credit);
        System.out.println(cashBack);

    }
}
