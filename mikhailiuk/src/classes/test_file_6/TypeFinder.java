package classes.test_file_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Natashka on 11.03.2015.
 */
public class TypeFinder {
    public void finder(String str, String type) {
        String regex="";
       if (type.equals("int")|type.equals("short")|type.equals("long")){
           regex=" \\d+ ";
       } else if (type.equals("char")){
           regex=" \\w{1} ";
       }else if (type.equals("string")){
           regex="[a-zA-Zа-яА-Я]{2,}";
       } else if(type.equals("double")|(type.equals("float"))){
           regex="[-+]?(\\d+\\.\\d*|\\.\\d+)([eE][-+]?\\d+)?";
       }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
