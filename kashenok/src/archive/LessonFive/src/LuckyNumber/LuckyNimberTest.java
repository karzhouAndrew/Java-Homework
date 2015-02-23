package LuckyNumber;

/**
 * Created by Рома on 13.02.2015.
 */
public class LuckyNimberTest {
    public static void main(String[] args) {

        int num = Number.GetNumber();
        int firstDigit = Digitizer.FirstNumberOnDigits(num);
        int secondDigit = Digitizer.SecondNumberOnDigits(num);
        int thirdDigit=Digitizer.ThirdNumberOnDigits(num);


/*  System.out.println(Digitizer.FirstNumberOnDigits(num));
        System.out.println(Digitizer.SecondNumberOnDigits(num));
        System.out.println(Digitizer.ThirdNumberOnDigits(num));    */

        new LuckyOrNot(num, firstDigit,secondDigit,thirdDigit);

    }
}
