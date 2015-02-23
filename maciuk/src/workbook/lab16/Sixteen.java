package workbook.lab16;

/**
 * Created by Asus on 21.02.2015.
 */
public class Sixteen {
    public static void main(String[] args) {
        String str = "Конкатенация строк - это, соединение, строк: при помощи оператора - х";
        int n = 0;
        int p = 0;
        int d = 0;
        int f = 0;
        int g = 0;
        while (p != -1) {
            p = str.indexOf('-', p);
            if (p != -1) {
                p++;
                n++;
            }
        }
        System.out.println("Количество тире = " + n);
        p = 0;
        while (p != -1) {
            p = str.indexOf(',', p);
            if (p != -1) {
                p++;
                d++;
            }
        }
        System.out.println("Количество запятых = " + d);
        p = 0;
        while (p != -1) {
            p = str.indexOf(':', p);
            if (p != -1) {
                p++;
                f++;
            }
        }
        System.out.println("Количество двоеточий = " + f);
        p = 0;
        while (p != -1) {
            p = str.indexOf('.', p);
            if (p != -1) {
                p++;
                g++;
            }
        }
        System.out.println("Количество точек = " + g);
        System.out.println("Общее количество знаков препинания = " + (n + f + d + g));
    }
}

