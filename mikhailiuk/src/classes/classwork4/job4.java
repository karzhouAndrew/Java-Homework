package classes.classwork4;


import java.util.Random;

/**
 * Created by Natashka on 10.02.2015.
 */
public class job4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randNumber = rand.nextInt(1000);
        if (randNumber < 100) {
            randNumber += 100;
        }
        System.out.print("Случайное число: " + randNumber);
        MagicNumber magicNum = new MagicNumber();
        magicNum.magicNumber(randNumber);
        LuckyNumber luckyNum = new LuckyNumber();
        luckyNum.luckyNumber(randNumber);
    }
}




