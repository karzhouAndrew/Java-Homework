package workbook.lab25;

public class CashBack extends Debit {
    private int interest;

    public CashBack(String nameOfTheOwner, long balance) {
        super(nameOfTheOwner, balance);
        interest = 5;
    }

    public long withdrawalOfMoney(long money) {
        if (balance - money >= 0) {
            balance += money * interest / 100 - money;
            System.out.println(nameOfTheOwner + ": Operation took place successfully.");
            return money;
        } else {
            System.out.println(nameOfTheOwner + ": The entered sum exceeds balance! " +
                    "Operation isn't possible.");
            return 0;
        }
    }

    @Override
    public String toString() {
        return nameOfTheOwner + " " + balance;
    }
}
