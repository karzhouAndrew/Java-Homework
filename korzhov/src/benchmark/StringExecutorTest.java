package benchmark;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by user on 25.02.2015.
 */
public class StringExecutorTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        MyBenchmarkProcessor myBenchmarkProcessor = new MyBenchmarkProcessor();
        long time = myBenchmarkProcessor.analyzeBenchmark();
        System.out.println(time);

    }

}
