package workbook.lab27;

/**
 * Created by Asus on 23.02.2015.
 */
public class TestAtm {
    int twenty;
    int fifty;
    int hundred;

    boolean takeMoney(int sum) {
        if (sum <= hundred * 100) {
            System.out.println("Операция прошла успешна!");
            System.out.println("Сумма к выдаче = " + sum);
            System.out.println("Количество банкнот номиналом 100$: " + (sum / 100));
            if (sum - sum / 100 * 100 <= fifty * 50) {
                System.out.println("Количество купюр номиналом 50$: " + (sum - sum / 100 * 100) / 50);
                if (((sum - sum / 100 * 100) - (sum - sum / 100 * 100) / 50 * 50) <= twenty * 20) {
                    System.out.println("Количество купюр номиналом 20$: " + ((sum - sum / 100 * 100) - (sum - sum / 100 * 100) / 50 * 50) / 20);
                    return true;
                }
            }
            if (sum - (sum - sum / 100 * 100) / 50 <= twenty * 20) {
                System.out.println("Количество купюр номиналом 20$: " + (sum - (sum - sum / 100 * 100) / 50) / 20);

            }
            return true;
        }
        if (sum <= fifty * 50) {
            System.out.println("Операция прошла успешна!");
            System.out.println("Сумма к выдаче = " + sum);
            System.out.println("Количество банкнот номиналом 50$: " + (sum / 50));
            if (sum - sum / 50 * 50 <= twenty * 20) {
                System.out.println("Количество купюр номиналом 20$: " + (sum - sum / 50 * 50) / 20);
                return true;
            }
        }
        if (sum <= twenty * 20) {
            System.out.println("Операция прошла успешна!");
            System.out.println("Сумма к выдаче = " + sum);
            System.out.println("Количество купюр номиналом 20$: " + sum / 20);
            return true;
        }
        System.out.println("Операция не может быть выполнена");
        return false;
    }
}
