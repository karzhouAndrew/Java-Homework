package dop;

/**
 * Created by Рома on 18.02.2015.
 */
public class childToChildren {
    public static void main(String[] args) {
        String text = "Some child have birthday tomorrow. Other child are 0 years old today.";
        String text1 = text.replace("child", "children").replaceAll("\\d ","");

        System.out.println("text1 = " + text1);


    }
}
