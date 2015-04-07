package workbook.lab20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Sam on 20.02.2015.
 * Написать программу, выполняющую поиск в строке шестнадцатиричных чисел, записанныъ по правилам Java,
 * с помощью регулярных выражений и вывести их на страницу
 */
public class FindHexNums {
    public static void main(String[] args) {
        String strVal = "PREF\n" +
                "ID=e43b1b85184eb9ce:FF=0:TM=1423865123:LM=1423865123:S=QtrSoSMevIgnkJB-\n" +
                "google.com/\n" +
                "1024\n" +
                "460X0395392\n" +
                "30573948\n" +
                "0X3465934624\n" +
                "30427106\n" +
                "*\n" +
                "NID\n" +
                "0x67=Qvh5skA373rut0x1589GeZEc-M8D13X8W06Sekg811C2U02LMGe4Kgy9eXFgbKy7jnHujmCq-poBbUncoXi_hlM_DO-StlLSDxCRE-m0jhkSBHqThYmt06U9Y5lqDWWiLoOq\n" +
                "google.com/\n" +
                "9216\n" +
                "2071712640\n" +
                "30463910\n" +
                "3465934624\n" +
                "30427106\n" +
                "* ";
        StringBuilder strResult = findHexNums(strVal);
        System.out.println("Result = " + strResult);

    }

    private static StringBuilder findHexNums(String strVal) {
        StringBuilder strResult = new StringBuilder();
        Pattern pattern = Pattern.compile("0{1}[xX][0-9]{4}+");
        Matcher matcher = pattern.matcher(strVal);
        while (matcher.find()) {
            strResult.append(strVal.substring(matcher.start(), matcher.end())).append(" ");
        }
        return strResult;
    }
}
