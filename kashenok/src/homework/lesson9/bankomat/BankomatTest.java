package homework.lesson9.bankomat;

import javax.swing.*;
import java.util.Scanner;

public class BankomatTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*System.out.println("Укажите изначальное количество купюр, номиналом 20 USD:");
        int twentyUSD = scan.nextInt();
        System.out.println("Укажите изначальное количество купюр, номиналом 50 USD:");
        int fifteenUSD=scan.nextInt();
        System.out.println("Укажите изначальное количество купюр, номиналом 100 USD:");
        int hundredUSD=scan.nextInt();
        */
        Bankomat priorbank = new Bankomat(10, 10, 10);

        System.out.println("Количество купюр в банкомате "+ priorbank +": \n 20 USD: " + priorbank.twentyUSD + "\n 50 USD: " + priorbank.fifteenUSD + "\n 100 USD: " + priorbank.hundredUSD);

        System.out.println();

/*
        System.out.println("Укажите  количество купюр, номиналом 20 USD, 50 USD и 100 USD соответственно для добавления:");
        int addTwentyUSD = scan.nextInt();
        priorbank.twentyUSD = priorbank.addTwentyUSD(priorbank.twentyUSD, addTwentyUSD);

        int addFifteenUSD = scan.nextInt();
        priorbank.fifteenUSD = priorbank.addFifteenUSD(priorbank.twentyUSD, addFifteenUSD);

        int addHundredUSD = scan.nextInt();
        priorbank.hundredUSD = priorbank.addHundredUSD(priorbank.twentyUSD, addHundredUSD);

*/
        System.out.println(" Для пополнения баланса введите номинал купюр (20, 50 или 100): ");
        int nom = scan.nextInt();
        if (nom != 20 && nom != 50 && nom != 100) {
            System.out.println("Вы ввели недопустимое значение, попробуйте снова...");
        } else {
            System.out.println("введите количество купюр: ");
            int col = scan.nextInt();
            if (nom == 20) {
                priorbank.twentyUSD = priorbank.addTwentyUSD(priorbank.twentyUSD, col);
            } else if (nom == 50) {
                priorbank.fifteenUSD = priorbank.addFifteenUSD(priorbank.twentyUSD, col);
            } else if (nom == 100) {
                priorbank.hundredUSD = priorbank.addHundredUSD(priorbank.twentyUSD, col);
            } else {
            }
            System.out.println("Количество купюр в банкомате: \n 20 USD: " + priorbank.twentyUSD + "\n 50 USD: " + priorbank.fifteenUSD + "\n 100 USD: " + priorbank.hundredUSD);
        }


        System.out.println("Введите желаемую сумму для снятия со счета: ");
        int getsum = scan.nextInt();
        priorbank.getUSD(getsum,priorbank.twentyUSD, priorbank.fifteenUSD, priorbank.hundredUSD);

        System.out.println("Количество купюр в банкомате: \n 20 USD: " + priorbank.twentyUSD + "\n 50 USD: " + priorbank.fifteenUSD + "\n 100 USD: " + priorbank.hundredUSD);



    }
}
