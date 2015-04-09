package workbook.Test5_3;

/**
 * Created by Natashka on 22.02.2015.
 */
public class Time {
    private int hour;
    private int min;
    private int sec;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public Time(int sec) {
        this.sec = sec;
    }

    public void printTime() {
        System.out.println("Time is: " + hour + " часов " + min + " минут " + sec + " секунд");
    }

    public int seconds() {
        return sec + min * 60 + hour * 3600;
    }

    public static int compareTime(Time time1, Time time2) {
        int ok = -1;
        if (time1.getHour() == time2.getHour() && time1.getMin() == time2.getMin() && time1.getSec() == time2.getSec()) {
            ok = 1;
        }
        return ok;
    }
}
