package workbook.lab23;

import java.util.Scanner;

/**
 * Created by Leonid on 24.02.2015.
 */
public class ServiceMan {
    private int pin = 2;
    private int inPin;

    public ServiceMan() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите пин код инкассатора ");
        inPin = in.nextInt();
        in.close();
    }

    public void service(Atm atm) {
        if (inPin == pin) {
            Scanner in = new Scanner(System.in);
            System.out.print("Внесите купюры номиналом 100 ");
            atm.setBanknote100(in.nextInt());
            System.out.print("Внесите купюры номиналом 50 ");
            atm.setBanknote50(in.nextInt());
            System.out.print("Внесите купюры номиналом 20 ");
            atm.setBanknote20(in.nextInt());
            in.close();
        } else {
            System.out.println("Ошибка аунтентификации");
        }
    }
}
