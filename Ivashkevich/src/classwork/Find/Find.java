package classwork.Find;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Leonid on 18.02.2015.
 */
public class Find {
    public static void main(String[] args) {
        String str = "";
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            str += in.nextLine() + "\r\n";
            if (in.equals(".")){
                break;
            }
        }



        Pattern pattern = Pattern.compile("[ёуеыаоэяиюЁУЕЫАОЭЯИЮ]+");
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find())

        {

            i = i + matcher.end() - matcher.start();

        }

        System.out.println("Колличество гласных:   " + i);

        Pattern pattern1 = Pattern.compile("[йцкнгшщзхъфвпрлджчсмтьбЙЦКНГШЩЗХЪФВПРЛДЖЧСМТЬБ]+");
        matcher = pattern1.matcher(str);
        i = 0;
        while (matcher.find())

        {
            i = i + matcher.end() - matcher.start();

        }

        System.out.println("Колличество согласных: " + i);
        System.out.println(str.replaceAll(" ", ""));

    }
}

