package workbook.task5;

/**
 * Created by Admin on 09.02.2015.
 */
public class Task5 {
    public Task5() {
    }

    public static void main(String[] args) {
        int x = 223;
        switch (x % 100) {
            case 11:
                System.out.println(x + " рублей ");
                break;
            case 12:
                System.out.println(x + " рублей ");
                break;
            case 13:
                System.out.println(x + " рублей ");
                break;
            case 14:
                System.out.println(x + " рублей ");
                break;
            case 15:
                System.out.println(x + " рублей ");
                break;
            default:
                switch (x % 10) {
                    case 0:
                        System.out.println(x + " рублей ");
                        break;
                    case 1:
                        System.out.println(x + " рубль ");
                        break;
                    case 2:
                        System.out.println(x + " рубля ");
                        break;
                    case 3:
                        System.out.println(x + " рубля ");
                        break;
                    case 4:
                        System.out.println(x + " рубля ");
                        break;
                    case 5:
                        System.out.println(x + " рублей ");
                        break;
                    case 6:
                        System.out.println(x + " рублей ");
                        break;
                    case 7:
                        System.out.println(x + " рублей ");
                        break;
                    case 8:
                        System.out.println(x + " рублей ");
                        break;
                    case 9:
                        System.out.println(x + " рублей ");
                }
        }

    }
}
