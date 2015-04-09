package workbook.Test5_4;

/**
 * Created by Natashka on 22.02.2015.
 */
public class SumCheck {
    public boolean sumCheck(Atm atm, int sum) {
        if ((sum % 10 != 0)&&(sum!=10)&&(sum!=30)) {
            System.out.println("Введите сумму, кратную 20");
            return false;
        } else if ((atm.getBanknote20() * 20 + atm.getBanknote50() * 50 + atm.getBanknote100() * 100) < sum) {
            System.out.println("Введите меньшую сумму, недостаточно банкнот");
            return false;
        }
        return true;
    }
}
