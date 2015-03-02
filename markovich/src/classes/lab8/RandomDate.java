package classes.lab8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class RandomDate {
    public static Calendar getRandomBirthDate() {
        Calendar calendar = Calendar.getInstance();
        int year = randBetween(1950, 1998);
        calendar.set(calendar.YEAR, year);
        int dayOfYear = randBetween(1, calendar.getActualMaximum(calendar.DAY_OF_YEAR));
        calendar.set(calendar.DAY_OF_YEAR, dayOfYear);
        String stringDate = (calendar.get(calendar.YEAR) + "-" + calendar.get(calendar.MONTH) + "-" + calendar.get(calendar.DAY_OF_MONTH));
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-M-dd");
            calendar.setTime(format.parse(stringDate));
            return calendar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Calendar getRandomHireDate() {
        Calendar calendar = Calendar.getInstance();
        int year = randBetween(2000, calendar.get(calendar.YEAR));
        calendar.set(calendar.YEAR, year);
        int dayOfYear = randBetween(1, calendar.getActualMaximum(calendar.DAY_OF_YEAR));
        calendar.set(calendar.DAY_OF_YEAR, dayOfYear);
        String stringDate = (calendar.get(calendar.YEAR) + "-" + calendar.get(calendar.MONTH) + "-" + calendar.get(calendar.DAY_OF_MONTH));
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-M-dd");
            calendar.setTime(format.parse(stringDate));
            return calendar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getFormatRandomBirthDay(Calendar birthDay) {
        SimpleDateFormat calendarParse = new SimpleDateFormat("dd MMM yyyy");
        return calendarParse.format(birthDay.getTime());
    }

    public static String getFormatRandomHireDay(Calendar hireDay) {
        SimpleDateFormat calendarParse = new SimpleDateFormat("dd MMM yyyy");
        return calendarParse.format(hireDay.getTime());
    }

    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
}
