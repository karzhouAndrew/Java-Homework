package workbook.exception;

/**
 * Created by Natashka on 09.03.2015.
 */
public class M3 {
    public void method3() throws MyException{
        int size = 0;
        if (size == 0) {
            MyException exception= new MyException();
            throw exception;
        }
    }
}
