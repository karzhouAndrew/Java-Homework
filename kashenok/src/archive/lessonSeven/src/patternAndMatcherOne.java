import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Рома on 18.02.2015.
 */
public class patternAndMatcherOne {
    public static void main(String[] args) {
//   0x01 njwl  klhbi vkjgv 0xF1 njb v klb vhvl lk 0xFF

Scanner scan = new Scanner(System.in);
        System.out.println("Please put your text below: ");
        String text = scan.next();


        Pattern pat = Pattern.compile("0x\\p{XDigit}+");
        //         Pattern pat = Pattern.compile("0x00-0xFF}+");

        Matcher mat = pat.matcher(text);

        while (mat.find()) {
                       System.out.println(mat.start() + " " + mat.end());
            System.out.println("Найденное совпадение " + mat.group());


        }

        mat.find();
        System.out.println("pat = " + pat);
        System.out.println("mat = " + mat);


    }


}
