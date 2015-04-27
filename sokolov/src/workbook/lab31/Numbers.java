package workbook.lab31;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Numbers {
    private List<Float> floatList = new ArrayList<Float>();
    private float sum;

    public void textToNumbers(String text) {
        Pattern pattern = Pattern.compile("[^\\d,.][\\d]+[^\\d,]");
        Pattern pattern2 = Pattern.compile("[\\d]+[,.][\\d]+");

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            char[] chars2 = null;
            char[] chars = matcher.group().toCharArray();
            if (chars.length > 2) {
                chars2 = new char[chars.length - 2];
                System.arraycopy(chars, 1, chars2, 0, chars.length - 2);
            }
            String processedNumber = new String(chars2);
            floatList.add(Float.valueOf(processedNumber));
        }

        Matcher matcher2 = pattern2.matcher(text);
        while (matcher2.find()) {
            String string = matcher2.group();
            string = string.replaceAll(",", ".");
            floatList.add(Float.valueOf(string));
        }
    }

    public void deleteDuplicateNumbers() {
        Set<Float> set = new LinkedHashSet<Float>();
        set.addAll(floatList);
        System.out.println(set);
    }

    public float getSum() {
        Iterator iterator = floatList.iterator();
        float f;
        while (iterator.hasNext()) {
            f = (Float) iterator.next();
            sum = sum + f;
        }
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public List<Float> getFloatList() {
        return floatList;
    }

    public void setFloatList(List<Float> floatList) {
        this.floatList = floatList;
    }
}
