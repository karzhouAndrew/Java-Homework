package workbook.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Natashka on 26.02.2015.
 */
public class TransactionTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        TestClass testClass = new TestClass();
        Class<?> clazz = TestClass.class;
        Method[] method = clazz.getDeclaredMethods();
        for (Method method1 : method) {
            if (method1.isAnnotationPresent(Transaction.class)) {
                testClass.StartTransaction();
                method1.invoke(clazz.newInstance());
                testClass.EndTransaction();
            }
        }
    }
}
