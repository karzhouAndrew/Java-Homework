package homework.work5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записанных по правилам JAVA,
с пом регуляр выражений и вывести их на страницу */

public class Task20 {
    public static void main(String[] args) {
        String str = "Наносекунда (нс) — единица 8измерения времени, дольная по отношению к секунде — одной из семи основных единиц Международной системы единиц (СИ) и системы СГС.";
        String hex = new String();
        for (int i = 0; i < str.length(); i++) {
            hex = hex + " 0x" + Byte.toString((byte) str.charAt(i));
        }
        System.out.println(hex);
        String find = new String();
        find = "0x20";
        Pattern pattern = Pattern.compile(find);
        Matcher matcher = pattern.matcher(hex);
        while (matcher.find()) {
            System.out.println("Find 0x20 at position " + matcher.end() / 5);
        }
    }
}
