package training.argumentTransaction.byLink;

/**
 * Created by Рома on 25.02.2015.
 */
public class ByLinkTest {
    public static void main(String[] args) {
        ByLink test = new ByLink(10,15);
        System.out.println("test.a = " + test.a + "\n" + "test.b = " + test.b);

        test.meth(test);

        System.out.println("test.a = " + test.a + "\n" + "test.b = " + test.b);

    }
}
