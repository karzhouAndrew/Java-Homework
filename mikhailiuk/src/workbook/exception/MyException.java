package workbook.exception;

/**
 * Created by Natashka on 09.03.2015.
 */
public class MyException extends Exception {
    public MyException() {
        super("My Exception");
        System.out.println("It works!");
    }
}
