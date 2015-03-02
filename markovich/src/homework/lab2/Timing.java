package homework.lab2;

public class Timing {
    public static void main(String[] args) {
        int s = 15553450;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hours = h % 24;
        int d = (h - hours) / 24;
        int days = d % 7;
        int w = (d - days) / 7;
        System.out.println(w + " weeks " + days + " days " + hours + " hours " + min + " minutes " + sec + " seconds");
    }
}