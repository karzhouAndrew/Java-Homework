package workbook2.lab3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by vasilevich on 28.03.2015.
 */
public class Logger {

    private Logger() {
    }

    private static Logger inst;

    public static Logger getInstance() {
        if (inst == null) {
            inst = new Logger();
        }
        return inst;
    }


    public void addErrorMessage(Exception e) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt", true));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        Date date = new Date();
        bw.write(simpleDateFormat.format(date) + "      " + e.toString() + "\n");
        bw.close();
    }

}
