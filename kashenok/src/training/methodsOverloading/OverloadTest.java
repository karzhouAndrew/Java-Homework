package training.methodsOverloading;

/**
 * Created by Рома on 24.02.2015.
 */
public class OverloadTest {
    public static void main(String[] args) {
        OverloadMethods om = new OverloadMethods();
        om.overloadDemo();
        om.overloadDemo(2, "Test");
        om.overloadDemo(4);

    }
}
