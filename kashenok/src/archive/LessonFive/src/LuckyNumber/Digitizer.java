package LuckyNumber;

public class Digitizer {
    public static int FirstNumberOnDigits(int num) {

        int firstDigit = num / 100;
        return firstDigit;

    }

    public static int ThirdNumberOnDigits(int num) {

        int thirdDigit = num % 10;
        return thirdDigit;
    }

    public static int SecondNumberOnDigits(int num) {


        int secondDigit = (num - (num % 10))/10 - (num / 100) * 10;
        return secondDigit;

    }
}