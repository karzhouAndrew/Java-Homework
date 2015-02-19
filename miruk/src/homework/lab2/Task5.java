package homework.lab2;

import java.util.Scanner;
public class Task5 {
    public static void main(String[] arg) {
        System.out.print("Введите количество рублей: ");
        Scanner sc = new Scanner(System.in);
        int rub = sc.nextInt();
        sc.close();
        String  ruble;
        if ((rub%10==1)&&(rub!=11)) {    ruble = " рубль ";
        }
        else if ((
                (rub%10==2)||(rub%10==4)||(rub%10==3))&&((rub!=12)||(rub!=13)||(rub!=14))) {
            ruble = " рубля ";
        }
        else {ruble = " рублей ";}

        System.out.println(rub + ruble);
    }
}
