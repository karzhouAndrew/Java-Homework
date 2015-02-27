package workbook.Test5_4;

/**
 * Created by Natashka on 22.02.2015.
 */
public class Atm {
    private int banknote20;
    private int banknote50;
    private int banknote100;

    public int getBanknote20() {
        return banknote20;
    }

    public void setBanknote20(int banknote20) {
        this.banknote20 = banknote20;
    }

    public int getBanknote50() {
        return banknote50;
    }

    public void setBanknote50(int banknote50) {
        this.banknote50 = banknote50;
    }

    public int getBanknote100() {
        return banknote100;
    }

    public void setBanknote100(int banknote100) {
        this.banknote100 = banknote100;
    }

    public Atm(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public void addBanknotes(int banknote20, int banknote50, int banknote100) {
        this.banknote20 += banknote20;
        this.banknote50 += banknote50;
        this.banknote100 += banknote100;
    }

    public void withdraw(Atm atm, int sum) {
        WithdrawMoney withdrawMoney = new WithdrawMoney();
        if (withdrawMoney.withdrawMoney(atm, sum)) {
            System.out.println("Операция прошла успешно");
        }
    }
}



