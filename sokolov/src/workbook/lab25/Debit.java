package workbook.lab25;

public class Debit extends CashCards {

    public Debit(String nameOfTheOwner, long balance) {
        super(nameOfTheOwner, balance);
    }

    public long withdrawalOfMoney(long money) {
        if (balance - money < 0) {
            System.out.println(nameOfTheOwner + ": The entered sum exceeds balance! " +
                    "Operation isn't possible.");
            return 0;
        } else {
            balance -= money;
            System.out.println(nameOfTheOwner + ": Operation took place successfully.");
            return money;
        }
    }

    @Override
    public String toString() {
        return nameOfTheOwner + " " + balance;
    }
}
