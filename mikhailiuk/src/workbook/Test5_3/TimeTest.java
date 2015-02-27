package workbook.Test5_3;

/**
 * Created by Natashka on 22.02.2015.
 */
public class TimeTest {
    public static void main(String[] args) {
        Time time1 = new Time(2, 18, 36);
        Time time2 = new Time(2, 18, 36);
        System.out.println(time2.getHour() + " часов " + time2.getMin() + " минут " + time2.getSec() + " секунд равно "
                + time2.seconds() + " секунд");
        time1.printTime();
        time2.printTime();
        System.out.println(Time.compareTime(time1, time2));
    }
}
