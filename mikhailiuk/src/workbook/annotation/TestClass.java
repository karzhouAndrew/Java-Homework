package workbook.annotation;

/**
 * Created by Natashka on 26.02.2015.
 */
public class TestClass {

    @Transaction
    public void markedMethod() {
        System.out.println("Метод, помеченный аннотацией сработал");
    }

    public void StartTransaction() {
        System.out.println("Transaction is started");
    }

    public void EndTransaction() {
        System.out.println("Transaction is ended");
    }
@Transaction
    public void markedMethod2() {
        System.out.println("Еще один метод, помеченный аннотацией сработал");
    }
}
