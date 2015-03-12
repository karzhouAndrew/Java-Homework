package workbook.exception;

/**
 * Created by Natashka on 09.03.2015.
 */
public class M1 {
    public void method1() {
        try {
            M2 m2 = new M2();
            m2.method2();
            System.out.println("after m2 launch");
        } catch (MyException e) {
            System.out.println("catch works");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally works");
        }
    }
}
