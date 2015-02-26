package workbook.lab19;

/**
 * Created by Leonid on 16.02.2015.
 */
public class TaskManager {
    public void testLoadTimeString() {
        String str = "строка для многократного сложения ";
        for (int i = 1; i < 1000; i++) {
            str += str;
        }
        System.out.print("     Продолжительность конкатенации методом сложения и String (мсек): ");
    }

    public void testLoadTimeStringBuilder() {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < 1000; i++) {
            str.append("строка для многократного сложения ");
        }

        System.out.print("Продолжительность конкатенации методом append и StringBuilder (мсек): ");
    }
}