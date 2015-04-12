package added.lab10;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Sam on 01.03.2015.
 */
public class TransactProc {


    public void analyzeTransactProc() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<TransactOperation> clazz = TransactOperation.class;
        for (Method method : clazz.getMethods()) {

            if (method.isAnnotationPresent(Transaction.class)) {
                System.out.println("Transaction started");
                method.invoke(clazz.newInstance(), null);
                System.out.println("Transaction finished");
                return;
            }
        }


    }


}
