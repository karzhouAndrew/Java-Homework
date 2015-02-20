package workbook.task_2;

/**
 * Created by Алексей Андреенко on 05.02.2015.
 * Вывести промежуток времени заданный в секундах в формате (недель, дней, часов, минут, секунд)
 */
public class HourMinSec {
    public static void main(String[] args) {
        int s = 3333700;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int day = d % 7;
        int week = (d - day) / 7;
        System.out.println(week + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд");
    }
}
