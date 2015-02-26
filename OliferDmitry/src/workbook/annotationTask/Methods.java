package workbook.annotationTask;

import java.lang.reflect.Method;

public class Methods {

    public static void method1(){
        System.out.println("This is a method without annotation");
    }
    @Transaction
    public static void method2(){
        System.out.println("his is a method with annotation");
        Methods ob = new Methods();
        Method[] methods = ob.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Transaction.class)){
                System.out.println("Annotation \'" + Transaction.class.getSimpleName() + "\' started");
                System.out.println("Annotation \'" + Transaction.class.getSimpleName() + "\' ended");
            }
        }
    }
}
