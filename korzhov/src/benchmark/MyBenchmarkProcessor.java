package benchmark;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by user on 25.02.2015.
 */
public class MyBenchmarkProcessor {

    public long analyzeBenchmark() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        long difference = 0L;
        Class<StringExecutor> clazz = StringExecutor.class;
        for (Method method : clazz.getMethods()) {
            if (method.isAnnotationPresent(MyBenchmark.class)) {
                long startTesting = System.nanoTime();
                method.invoke(clazz.newInstance(), null);
                difference = System.nanoTime() - startTesting;
            }
        }
        return difference;
    }
}
