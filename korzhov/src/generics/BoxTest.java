package generics;

/**
 * Created by user on 25.02.2015.
 */
public class BoxTest {
    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.setItem("Test");

        Box<Integer> box1 = new Box<Integer>();
        box1.setItem(1);
        Integer i = box1.getItem();
    }
}
