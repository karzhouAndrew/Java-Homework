package workbook.lab2;

/**
 * Created by Asus on 21.02.2015.
 */
public class Two {
    public static void main(String[] args) {
        int s = 3700;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 60;
        int d = (h - hour) / 24;
        int day = d % 24;
        int week = (d - day) / 7;
        System.out.println(week + "недель" + " " + day + "дней" + " " + hour + "часов" + " " + min + "минут" + " " + sec + "секунд");
    }
}
