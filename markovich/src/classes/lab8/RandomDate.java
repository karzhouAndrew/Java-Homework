package classes.lab8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class RandomDate {
    public static Date setRandomBirthDate() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int year = randBetween(1950, 1998);
        gregorianCalendar.set(gregorianCalendar.YEAR, year);
        int dayOfYear = randBetween(1, gregorianCalendar.getActualMaximum(gregorianCalendar.DAY_OF_YEAR));
        gregorianCalendar.set(gregorianCalendar.DAY_OF_YEAR, dayOfYear);
        String stringDate = (gregorianCalendar.get(gregorianCalendar.YEAR) + "-" + gregorianCalendar.get(gregorianCalendar.MONTH) + "-" + gregorianCalendar.get(gregorianCalendar.DAY_OF_MONTH));
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-M-dd");
            Date hireDate = format.parse(stringDate);
            return hireDate;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date setRandomHireDate() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int year = randBetween(2000, gregorianCalendar.get(gregorianCalendar.YEAR));
        gregorianCalendar.set(gregorianCalendar.YEAR, year);
        int dayOfYear = randBetween(1, gregorianCalendar.getActualMaximum(gregorianCalendar.DAY_OF_YEAR));
        gregorianCalendar.set(gregorianCalendar.DAY_OF_YEAR, dayOfYear);
        String stringDate = (gregorianCalendar.get(gregorianCalendar.YEAR) + "-" + gregorianCalendar.get(gregorianCalendar.MONTH) + "-" + gregorianCalendar.get(gregorianCalendar.DAY_OF_MONTH));
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-M-dd");
            Date hireDate = format.parse(stringDate);
            return hireDate;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
}
