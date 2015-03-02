package testPackage.annotation;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        inspectService(LazyService.class);
    }

    static void inspectService(Class<?> service) {
        Class<LazyService> clazz = LazyService.class;
        for (Method method : clazz.getMethods()) {
            if (method.isAnnotationPresent(Init.class)) {
                System.out.println(method.getName());
                System.out.println("Labuda");
            }
        }

    }
}
