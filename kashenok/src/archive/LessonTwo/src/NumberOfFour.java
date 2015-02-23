import java.util.Random;

public class NumberOfFour {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(10000) + 999;
        String str = Integer.toString(number);
        int lenght = str.length();
        char buf[] = new char[lenght];
        str.getChars(0, lenght, buf, 0);

        if (buf[0] == buf[1] || buf[0] == buf[2] || buf[0] == buf[3] || buf[1] == buf[2] || buf[1] == buf[3] || buf[2] == buf[3]) {
            System.out.println("В веденном числе имеются совпадения " + str);
        } else {
            System.out.println("Совпадений нет " + str);
        }

        for (int i = 0; i < lenght; i++) {
            char z = buf[i];
            for (int k = i + 1; k <= lenght; k++) {
                if (z == buf[k]) {
                    System.out.println("Имеются совпадения");
                }
                else {};

            }
            System.out.println("Совпадений нет");
        }
    }
}
