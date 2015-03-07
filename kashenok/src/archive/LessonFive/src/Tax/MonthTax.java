package Tax;

import java.util.Scanner;

public class MonthTax {

    public static int MonthTax() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер вашег оподоходного налога: ");
        int Pay = scan.nextInt();
        return Pay;
    }


}

