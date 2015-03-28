package workbook.lab5;

/*
 * Имеется целое число (любое), это число — сумма денег в рублях. Вывести это число, добавив к нему слово «рублей» в правильном падеже.
 */
public class Lab5 {
    public static void main(String[] args) {

        int money = 101;
        int x = (money % 10);
        int y = (money % 100);
        if (x == 1 && y != 11) {
            System.out.println(money + " рубль");
        } else if (y == 11 || y == 12 || y == 13 || y == 14 || x == 1 || x == 5 || x == 6 || x == 7 || x == 8 || x == 9 || x == 0) {
            System.out.println(money + " рублей");
        } else if (x == 2 || x == 3 || x == 4) {
            System.out.println(money + " рубля");
        }
    }
}
