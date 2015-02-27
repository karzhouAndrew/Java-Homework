package workbook.lab20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Asus on 21.02.2015.
 */
public class Twelve {
    public static void main(String[] args) {
        String str = " Шестнадцатизначное число 0xFFFF ";
        Pattern pattern = Pattern.compile("0x\\p{XDigit}+");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            for(int i = matcher.start(); i <= matcher.end(); i++){
                System.out.print(str.charAt(i));
            }
        }
    }
}
