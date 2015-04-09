package workbook.test1;

/**
 * Created by Natashka on 04.02.2015.
 */
public class Test {
    public static void main(String[] args) {
        int num = 34;
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num * num);
        } else if (num % 3 == 0) {
            System.out.println(++num);
        }


        System.out.println("число не делится без остатка ни на 3 ни на 5");
    }
}

