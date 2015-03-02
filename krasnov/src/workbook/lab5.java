package workbook;

/**
 * Имеется число (любое), это число - сумма денег в рублях. Вывести это число, добавив к нему слово "рублей"
 * в правильном падеже
 */
public class lab5 {
    public static void main(String[] args) {
        int money = 314;

        switch (money % 100) {
            case 11:
                System.out.println(money + " рублей");
                break;
            case 12:
                System.out.println(money + " рублей");
                break;
            case 13:
                System.out.println(money + " рублей");
                break;
            case 14:
                System.out.println(money + " рублей");
                break;
            default:
                switch (money % 10) {
                    case 1:
                        System.out.println(money + " рубль");
                        break;
                    case 2:
                        System.out.println(money + " рубля");
                        break;
                    case 3:
                        System.out.println(money + " рубля");
                        break;
                    case 4:
                        System.out.println(money + " рубля");
                        break;
                    default:
                        System.out.println(money + " рублей");
                }
        }
    }
}
