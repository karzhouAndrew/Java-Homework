package workbook.Test5_4;

/**
 * Created by Natashka on 22.02.2015.
 */
public class WithdrawMoney {
    public boolean withdrawMoney(Atm atm, int sum) {
        int used100 = 0;
        int used50 = 0;
        int used20 = 0;
        SumCheck sumCheck = new SumCheck();
        if (sumCheck.sumCheck(atm, sum)) {
            while ((sum % 50 != 0) && (atm.getBanknote20() > 0) && (used20 * 20 < sum)) {
                used20++;
                atm.setBanknote20(atm.getBanknote20() - 1);
                sum -= 20;
            }
            if (sum % 50 != 0) {
                System.out.println("Введите сумму, кратную 50, недостаточно купюр по 20");
                return false;
            }
            while ((sum % 100 != 0) && (atm.getBanknote50() > 0) && (used50 * 50 < sum)) {
                used50++;
                atm.setBanknote50(atm.getBanknote50() - 1);
                sum -= 50;
            }
            if (sum % 100 != 0) {
                System.out.println("Введите сумму, кратную 100, недостаточно купюр по 50");
                return false;
            }
            if (sum <= atm.getBanknote100() * 100) {
                used100 = sum / 100;
                atm.setBanknote100(atm.getBanknote100() - used100);
                System.out.println("Выдано " + used100 + " купюр по 100 " + used50 + " купюр по 50 " + used20 + " купюр по 20");
                return true;
            }
            used100 = atm.getBanknote100();
            sum -= used100 * 100;
            atm.setBanknote100(0);
            if (atm.getBanknote50() > 1) {
                while ((atm.getBanknote50() > 0) && (sum > 0)) {
                    used50++;
                    atm.setBanknote50(atm.getBanknote50() - 1);
                    sum -= 50;
                }
            } else if (atm.getBanknote20() > 4) {
                while ((atm.getBanknote20() > 0) && (sum > 0)) {
                    used20++;
                    atm.setBanknote20(atm.getBanknote20() - 1);
                    sum -= 20;
                }
            }
            if (sum == 0) {
                System.out.println("Выдано " + used100 + " купюр по 100 " + used50 + " купюр по 50 " + used20 + " купюр по 20");
                return true;
            }
        }
        return false;
    }
}
