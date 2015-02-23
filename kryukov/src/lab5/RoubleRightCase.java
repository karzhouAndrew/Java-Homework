package lab5;

/*
Имеется целое число (любое), это число - сумма денег в рублях. Вывести это число, добавив к нему слово "рублей" в правильном падеже.
 */
public class RoubleRightCase {
    public static void main(String[] args) {
        int s = 111;
        if (s == 1) {
            System.out.println(s + " рубль");
        } else if (2 <= s && s < 5) {
            System.out.println(s + " рубля");
        } else if (5 <= s && s <= 19) {
            System.out.println(s + " рублей");
        } else if (s%10==0){
            System.out.println(s + " рублей");
        } else if (s % 100 == 11 || s % 100 == 12 || s % 100 == 13 || s % 100 == 14 || s % 100 == 15 || s % 100 == 16 || s % 100 == 17 || s % 100 == 18 || s % 100 == 19 || s % 100 == 20) {
            System.out.println(s + " рублей");
        } else if (s % 10 == 1) {
            System.out.println(s + " рубль");
        } else if (s % 10 == 2 || s % 10 == 3 || s % 10 == 4) {
            System.out.println(s + " рубля");
        } else if (s % 10 == 5 || s % 10 == 6 || s % 10 == 7 || s % 10 == 8 || s % 10 == 9) {
            System.out.println(s + " рублей");
        }
    }
}
