import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Рома on 17.02.2015.
 */
public class howManyWordsInSentence {
    public static void main(String[] args) {
        String text = "Some    text goes  here  and there, and somewhere too.";

        String [] splited = text.split(" +");
StringBuilder str = new StringBuilder();
        for (String p : splited){
            str.append(p + " ");
        }
System.out.println("В строке " + splited.length + " слов.");
        System.out.print(str);
        //System.out.println(Arrays.toString(text.split(" +")));
    }
}
