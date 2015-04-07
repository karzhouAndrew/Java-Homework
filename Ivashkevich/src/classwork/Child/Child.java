package classwork.Child;

/**
 * Created by Leonid on 18.02.2015.
 */
public class Child {
    public static void main(String[] args) {
        String child = ("child");
        String children = ("children");
        String str = ("His child is very pretty.He has 3 years old.");
        System.out.println(str + "\n" + str.replaceAll(child, children));
        System.out.println(str.replaceAll("[0-9]", ""));
    }
}
