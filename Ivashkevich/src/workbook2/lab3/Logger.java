package workbook2.lab3;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Leonid on 16.03.2015.
 */
public class Logger {

    private Logger() {
    }

    private static Logger inst;
    private static String path;

    public static Logger inLog(String message) throws IOException {
        if (inst == null) {
            path = MakeFile.make();
            inst = new Logger();
        }

        Date dateEvent = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd.MM.yyyy HH:mm:ss");
        FileWriter log = new FileWriter(path, true);
        log.write(simpleDateFormat.format(dateEvent) + ": " + message + "\r\n");
        log.close();
        return inst;
    }
}
