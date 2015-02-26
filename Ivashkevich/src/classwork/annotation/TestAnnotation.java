package classwork.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Leonid on 26.02.2015.
 */

public class TestAnnotation {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<SomeMethod> clazz = SomeMethod.class;
        for (Method method : clazz.getMethods()) {
            if (method.isAnnotationPresent(Transaction.class)) {
                System.out.println("Transaction is started");
                method.invoke(clazz.newInstance());
                System.out.println("Transaction is started");
            }
        }
    }
}