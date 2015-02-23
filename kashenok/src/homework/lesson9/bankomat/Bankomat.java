package homework.lesson9.bankomat;

import java.util.Scanner;

public class Bankomat {
    static int twentyUSD;
    static int fifteenUSD;
    static int hundredUSD;
static int i=1;

    public Bankomat(int twentyUSD, int fifteenUSD, int hundreedUSD) {
        Bankomat.twentyUSD = twentyUSD;
        Bankomat.fifteenUSD = fifteenUSD;
        Bankomat.hundredUSD = hundreedUSD;
    }

    public int addTwentyUSD(int twentyUSD, int col) {
        return (twentyUSD + col);
    }

    public int addFifteenUSD(int fifteenUSD, int col) {
        return (fifteenUSD + col);
    }

    public int addHundredUSD(int hundredUSD, int col) {
        return (hundredUSD + col);
    }


    public boolean getUSD(int quantity, int twentyUSD, int fifteenUSD, int hundredUSD) {
        int total = twentyUSD * 20 + fifteenUSD * 50 + hundredUSD * 100;
        int partOfHundred = quantity % 100;
        int partOfFifteen = quantity % 50;
        int partOfTweuny = quantity % 20;

        if (quantity / 100 <= hundredUSD & quantity % 100 == 50 & quantity <= total) {
            total = total - quantity;
            this.hundredUSD = hundredUSD - quantity / 100;
            this.fifteenUSD = fifteenUSD - 1;
            return true;
        } else if (quantity / 100 > hundredUSD & quantity % 100 == 50 & quantity <= total) {
            total = total - quantity;
            quantity = (quantity / 100 - hundredUSD) * 100 + quantity % 100;
            this.hundredUSD = 0;


            if (quantity / 50 <= fifteenUSD) {
                this.fifteenUSD = fifteenUSD - quantity / 50;
            } else if (quantity / 50 >= fifteenUSD) {
/*                for (int i = 1; i <= twentyUSD; i++)
                {quantity-=20;

                }
*/
                while (quantity / 50 == fifteenUSD * 50) {
                    quantity = quantity - 20;
                    i++;
                }
                this.twentyUSD = twentyUSD - i;
                this.fifteenUSD = 0;

            }


        }

        //else if ()



 /*       // случай для сумм, кратных 100 у.е.
        if (partOfHundred == 0 & hundredUSD * 100 >= quantity) {
            total = total - quantity;
            this.hundredUSD = hundredUSD - quantity / 100;
            System.out.println("Со счета было снято " + quantity + " USD");
            return true;
        }
        // для сумм, кратных 50 у.е. и не превышающих количество купюр, номиналом 100 у.е.
        else if (quantity >= 100 & partOfHundred == 50 & total >= quantity & (quantity - 50) <= hundredUSD * 100) {
            total = total - quantity;
            this.hundredUSD = hundredUSD - quantity / 100;
            this.fifteenUSD = fifteenUSD - 1;
        }
        // Для 70 у.е.
        else if (quantity <= 100 & quantity >= 50 & partOfFifteen == 20) {
            total = total - quantity;
            this.fifteenUSD = fifteenUSD - 1;
            this.twentyUSD = twentyUSD - 1;
        }
        // Для 90 у.е.
        else if(quantity <= 100 & quantity >= 50 & partOfFifteen == 40){
            total = total - quantity;
            this.fifteenUSD = fifteenUSD - 1;
            this.twentyUSD = twentyUSD - 2;
        }



        return true;
*/


        return true;
    }


}



