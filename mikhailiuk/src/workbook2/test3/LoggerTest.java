package workbook2.test3;

import workbook.exception.MyException;

/**
 * создать логгер на singleton
 */
public class LoggerTest {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        try {
            int a = 4;
            if (a==4){
                throw new MyException();
            }
        } catch (MyException e) {
            logger.logException(e);
        }
    }
}
