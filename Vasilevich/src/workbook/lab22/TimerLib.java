package workbook.lab22;

/**
 * Created by vasilevich on 12.03.2015.
 */
public class TimerLib {
    private int seconds;
    private int minutes;
    private int hours;

    private final int SECONDS_IN_MINUTE = 60;
    private final int SECONDS_IN_HOUR = 60 * 60;

    private int sign(int val){
        if (val > 0){
            return 1;
        }else{
            if (val < 0){
                return -1;
            }
        }
        return 0;
    }

    public TimerLib(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public TimerLib(int seconds) {
        this.seconds = seconds;
    }

    public int getTotalSecons(){
        return (seconds + minutes * SECONDS_IN_MINUTE + hours * SECONDS_IN_HOUR);
    }

    public int compareTo(int seconds){
        return sign(getTotalSecons()- seconds);
    }

    public int compareTo(int seconds, int minutes, int hours){
        return sign(getTotalSecons() - (seconds + minutes * SECONDS_IN_MINUTE + hours * SECONDS_IN_HOUR));
    }

    @Override
    public String toString() {
        return "TimerLib{" +
                "seconds=" + seconds +
                ", minutes=" + minutes +
                ", hours=" + hours +
                '}';
    }
}
