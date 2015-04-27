package workbook.lab25;

public class Credit extends CashCards {
    private long limit;

    public Credit(String nameOfTheOwner, long balance) {
        super(nameOfTheOwner, balance);
        limit = 4000000;
    }

    long withdrawalOfMoney(long money) {
        if (balance + money < -limit) {
            System.out.println(nameOfTheOwner + ": The entered sum exceeds limit! " +
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
