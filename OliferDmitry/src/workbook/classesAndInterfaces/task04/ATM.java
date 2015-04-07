package workbook.classesAndInterfaces.task04;

public class ATM {
    private int quantity20;
    private int quantity50;
    private int quantity100;

    public ATM(int quantity100, int quantity50, int quantity20) {
        this.quantity20 = quantity20;
        this.quantity50 = quantity50;
        this.quantity100 = quantity100;
        printATMResult();
    }

    public void addMoney(int quantity100, int quantity50, int quantity20) {
        this.quantity100 += quantity100;
        this.quantity50 += quantity50;
        this.quantity20 += quantity20;
        System.out.println("You added " + (quantity100 * 100 + quantity50 * 50 + quantity20 * 20));
        printATMResult();
    }

    public void getMoney(int sum) {
        int quantity100 = 0, quantity50 = 0, quantity20 = 0;
        if (sum / 100 >2 && sum / 50 > 2) {
            quantity100 = sum / 150 - 1;
            quantity50 = sum / 150 - 1;
        } else {
            quantity100 = sum / 100;
            quantity50 = (sum - quantity100 * 100) / 50;
        }
        quantity20 = (sum - quantity100 * 100 - quantity50 * 50) / 20;

        int totalReceived = quantity100 * 100 + quantity50 * 50 + quantity20 * 20;

        if (totalReceived == sum) {
            System.out.println("You received " + totalReceived + ":\n" + quantity100 + " by [100]\n" + quantity50 + " by [50]\n" + quantity20 + " by [20]\n");
        } else System.out.println("Input valid amount");

        this.quantity100 -= quantity100;
        this.quantity50 -= quantity50;
        this.quantity20 -= quantity20;
        printATMResult();
    }

    public void printATMResult () {
        System.out.println("Total inside ATM: " + (this.quantity100 * 100 + this.quantity50 * 50 + this.quantity20 * 20) + "\n");
    }
}
