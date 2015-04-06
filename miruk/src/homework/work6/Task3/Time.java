package homework.work6.Task3;

public class Time {
    private int sec;
    private int min;
    private int hour;

    public Time(int sec) {
        hour = sec / 3600;
        min = (sec - hour * 3600) / 60;
        this.sec = sec - hour * 3600 - min * 60;
    }

    public Time(int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public int getSec() {
        return sec + hour * 3600 + min * 60;
    }

    public void setTime(int sec) {
        hour = sec / 3600;
        min = (sec - hour * 3600) / 60;
        this.sec = sec - hour * 3600 - min * 60;
    }

    public boolean compareSec(int sec) {
        if (sec == this.sec) {
            return true;
        } else {
            return false;
        }
    }

    public boolean compareMin(int min) {
        if (min == this.min) {
            return true;
        } else {
            return false;
        }
    }

    public boolean compareHour(int hour) {
        if (hour == this.hour) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Time:" +
                " hour=" + hour +
                ", min=" + min +
                ", sec=" + sec;
    }
}
