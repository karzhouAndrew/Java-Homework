package workbook.lab2;

public class Time {
    public static void main(String[] args) {
        int s = 3700;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int d = h % 24;
        int day = (h - d) / 24;
        int w = day % 7;
        int week = (day - w) / 7;
        System.out.println(week + " week " + day + " day " + h + " hour " + min + " minutes " + sec + " seconds ");
    }
}