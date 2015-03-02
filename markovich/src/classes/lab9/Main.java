package classes.lab9;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        inspectMethod(AnalyzeMethod.class);
    }

    static void inspectMethod(Class<?> analyze) {
        Class<AnalyzeMethod> clazz = AnalyzeMethod.class;
        for (Method method : clazz.getMethods()) {
            if (method.isAnnotationPresent(Transaction.class)) {
                System.out.println(method.getName() + " is started");
                System.out.println(method.getName() + " is ended");
            } else {
                System.out.println("Method not found");
            }
        }
    }

}
