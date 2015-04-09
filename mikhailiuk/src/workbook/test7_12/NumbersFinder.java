package workbook.test7_12;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

/**
 * Created by Natashka on 10.03.2015.
 */
public class NumbersFinder {
    public Set<Integer> finder(String str) {
        Set<Integer> numList = new HashSet<Integer>();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        int sum=0;
        while (matcher.find()) {
            String temp = matcher.group();
            int num = parseInt(temp);
            System.out.print(num + " ");
            sum+=num;
            numList.add(num);
        }
        System.out.println();
        System.out.println(sum);
        return numList;
    }
}
