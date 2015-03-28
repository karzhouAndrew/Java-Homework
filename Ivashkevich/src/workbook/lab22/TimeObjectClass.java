package workbook.lab22;

/**
 * Created by Leonid on 23.02.2015.
 */
public class TimeObjectClass {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeObjectClass(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public TimeObjectClass(int seconds) {
        this.seconds = seconds % 60;
        int minutes = (seconds - this.seconds) / 60;
        this.minutes = minutes % 60;
        int hours = (minutes - this.minutes) / 60;
        this.hours = hours % 60;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public int timeInSeconds() {
        int timeInSeconds = hours * 3600 + minutes * 60 + seconds;
        return timeInSeconds;
    }

    public int compareTo(TimeObjectClass otherTimeObject) {
        int result;

        int otherHours = otherTimeObject.getHours();
        int otherMinutes = otherTimeObject.getMinutes();
        int otherSeconds = otherTimeObject.getSeconds();

        if(this.hours != otherHours) {
            result = compareInt(this.hours, otherHours);
        } else if(this.minutes != otherMinutes) {
            result = compareInt(this.minutes, otherMinutes);
        } else {
            result = compareInt(this.seconds, otherSeconds);
        }

        return result;
    }

    int compareInt(int arg1, int arg2){
        if(arg1 < arg2) {
            return -1;
        } else if (arg1 == arg2) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "TimeObjectClass{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }


}