package workbook2.lab3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTime {
    public static String getDateAndTime() {
        String dateAndTime;
        GregorianCalendar grC = new GregorianCalendar();
        dateAndTime = grC.get(Calendar.DATE) + "." + grC.get(Calendar.MONTH) + "." + grC.get(Calendar.YEAR) + " " +
                grC.get(Calendar.HOUR) + ":" + grC.get(Calendar.MINUTE) + ":" + grC.get(Calendar.SECOND);
        return dateAndTime;
    }
}
