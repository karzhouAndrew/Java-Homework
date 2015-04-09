package workbook.test2;

/**
 * Created by Natashka on 03.02.2015.
 */
public class Test2 {
    public static void main(String[] args) {
        int s = 123456789;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int day = d % 7;
        int week = (d - day) / 7;
        System.out.println(week + " недель" + day + " дней" + hour + " часов" + min + " минут" + sec + " секунд");
    }
}
