package lab2;

/*
Имеется промежуток времени в секундах. Следует вывести его на страницу в виде недель, дней, часов, минут и секунд.
 */
public class DayWeek {
    public static void main(String[] args) {
        int s = 7683700;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int day = d % 7;
        int w = (d - day) / 7;
        System.out.println(w + " нед. " + day + " дн. " + hour + " ч. " + min + " мин. " + sec + " сек. ");
    }
}
