package workbook.lab23;

import java.util.Scanner;

/**
 * Created by Leonid on 24.02.2015.
 */
public class Client {
    private int pin = 1;
    private int cashClient = 1200;
    private int inPin;
    private int input;

    public Client() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите пин код клиента ");
        inPin = in.nextInt();
    }

    public void withdrawMoney(Atm atm) {

        if (pin == inPin && atm.atmStatus()) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите сумму для снятия: ");
            input = in.nextInt();
            if (atm.inputStatus(input)) {
                if (atm.transaction(input, cashClient)) {
                    cashClient -= input;
                }
            } else {
                System.out.println("Некорректная сумма");
            }
        }


        if (pin != inPin)

        {
            System.out.println("Ошибка аунтентификации");
        }

    }


    public void getBalance() {
        if (pin == inPin) {
            System.out.println("Остаток на счету: "+ cashClient);

        } else {
            System.out.println("Ошибка аунтентификации");
        }

    }

    public void putMoney() {
        if (pin == inPin) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите сумму для вклада: ");
            input = in.nextInt();
            if (pin == inPin) {
                cashClient += input;
                System.out.println("Операция проведена успешно");
            } else {
                System.out.println("Ошибка аунтентификации");
            }
        }
    }


}
