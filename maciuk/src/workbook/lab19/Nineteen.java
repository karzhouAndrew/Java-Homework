package workbook.lab19;

/**
 * Created by Asus on 21.02.2015.
 */
public class Nineteen {
    public static void main(String[] args) {
        String str = "Hello";
        for (int i = 0; i < 5; i++) {
            str += " World";
            System.out.println(str);
        }
        long startTime = System.nanoTime();
        System.out.println(startTime);
        System.out.println();
        StringBuilder str1 = new StringBuilder(str);
        for (int i = 0; i < 5; i++) {
            str1.append(" World");
            System.out.println(str1);
        }
        long endTime = System.nanoTime();
        System.out.println(startTime);
        long sum = endTime - startTime;
        System.out.println(sum);
    }
}

