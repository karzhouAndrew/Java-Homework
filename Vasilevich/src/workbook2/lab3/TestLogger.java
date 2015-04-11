package workbook2.lab3;

import java.io.IOException;

/**
 * Created by vasilevich on 28.03.2015.
 */
public class TestLogger {
    public static void main(String[] args) {

        try {
            int res = 5 / 0;
        } catch (Exception e) {
            addExceptionToLog(e);
        }

        try {
            int res = 5 / 0;
        } catch (Exception e) {
            addExceptionToLog(e);
        }

        try {
            int[] res = new int[3];
            res[5] = 3;
        } catch (Exception e) {
            addExceptionToLog(e);
        }

    }

    private static void addExceptionToLog(Exception e) {
        Logger logger = Logger.getInstance();
        try {
            logger.addErrorMessage(e);
        } catch (IOException exception) {
        }
    }
}
