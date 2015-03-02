package classes.lab8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class RandomDate {
    public static Calendar setRandomBirthDate() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int year = randBetween(1950, 1998);
        gregorianCalendar.set(gregorianCalendar.YEAR, year);
        int dayOfYear = randBetween(1, gregorianCalendar.getActualMaximum(gregorianCalendar.DAY_OF_YEAR));
        gregorianCalendar.set(gregorianCalendar.DAY_OF_YEAR, dayOfYear);
        String stringDate = (gregorianCalendar.get(gregorianCalendar.YEAR) + "-" + gregorianCalendar.get(gregorianCalendar.MONTH) + "-" + gregorianCalendar.get(gregorianCalendar.DAY_OF_MONTH));
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-M-dd");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(format.parse(stringDate));
            return calendar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Calendar setRandomHireDate() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int year = randBetween(2000, gregorianCalendar.get(gregorianCalendar.YEAR));
        gregorianCalendar.set(gregorianCalendar.YEAR, year);
        int dayOfYear = randBetween(1, gregorianCalendar.getActualMaximum(gregorianCalendar.DAY_OF_YEAR));
        gregorianCalendar.set(gregorianCalendar.DAY_OF_YEAR, dayOfYear);
        String stringDate = (gregorianCalendar.get(gregorianCalendar.YEAR) + "-" + gregorianCalendar.get(gregorianCalendar.MONTH) + "-" + gregorianCalendar.get(gregorianCalendar.DAY_OF_MONTH));
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-M-dd");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(format.parse(stringDate));
            return calendar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getBirthDay(Calendar birthDay) {
        SimpleDateFormat calendarParse = new SimpleDateFormat("dd MMM yyyy");
        String strBirthDay = calendarParse.format(birthDay.getTime());
        return strBirthDay;
    }

    public static String getHireDay(Calendar hireDay) {
        SimpleDateFormat calendarParse = new SimpleDateFormat("dd MMM yyyy");
        String strHireDay = calendarParse.format(hireDay.getTime());
        return strHireDay;
    }

    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
}
