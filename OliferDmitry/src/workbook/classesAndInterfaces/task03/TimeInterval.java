package workbook.classesAndInterfaces.task03;

public class TimeInterval {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeInterval(int seconds) {
        this.seconds = seconds;

        this.printInterval();
    }

    public TimeInterval(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        this.printInterval();
    }

    public int getSec() {
        return this.hours * 3600 + this.minutes * 60 + seconds;
    }

    public int compareIntervals(TimeInterval interval) {
        return this.getSec() - interval.getSec();
    }

    public void printInterval() {
        System.out.println("Time interval: " + this.hours + " hrs, " + this.minutes + " min, " + this.seconds + " sec");
    }
}
