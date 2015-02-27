package workbook.lab30;

/**
 * Created by Asus on 26.02.2015.
 */
public class Time {
    private int second;
    private int minute;
    private int hour;

    public Time(int second) {
        this.second = second;
    }

    public Time(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    int quantitySecond(){
        return second + minute * 60 + hour * 3600;
    }
    public static void compareTime(Time a, Time b){
        if(a.quantitySecond() == b.quantitySecond()){
            System.out.println("Два времени ровны");
        }
        else if(a.quantitySecond() == b.second){
            System.out.println("Два времени ровны");
        }
        else if(a.second == b.quantitySecond()){
            System.out.println("Два времени ровны");
        }
        else if(a.second == b.second){
            System.out.println("Два времени ровны");
        }
        else System.out.println("Два времени не равны");
    }
}
