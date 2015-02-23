import java.util.Random;

public class LastNumberSeven {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(1000000)+1;
        if ((number - 7) % 10 == 0) {
            System.out.println("Последней цифрой числа" + number +" является цифра \"7\"");
        } else {
            System.out.println("Последняя цифра числа "  + number + " - что угодно, но не \"7\"");
        }

        //или так:
        if (number % 10 == 7) {
            System.out.println("Последней цифрой числа" + number +" является цифра \"7\"");
        } else {
            System.out.println("Последняя цифра числа "  + number + " - что угодно, но не \"7\"");
        }
    }
}
