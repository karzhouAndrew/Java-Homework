package workbook.lab25;

public abstract class CashCards {
    protected String nameOfTheOwner;
    protected long balance;

    CashCards() {
    }

    CashCards(String nameOfTheOwner, long balance) {
        this.nameOfTheOwner = nameOfTheOwner;
        this.balance = balance;
    }

    abstract long withdrawalOfMoney(long money);

    public void replenishmentBalance(long money) {
        balance += money;
        System.out.println(nameOfTheOwner + ": Your balance is refilled.");
    }
}



