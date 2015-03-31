package workbook.lab26_28;

/**
 * Created by Leonid on 05.03.2015.
 */
public class AssessmentOfString {

    public static Integer getAssessmentOfString(String str) {
        String[] text = str.split(":");
        Integer fragment = null;
        if (text.length == 2) {
            fragment = Integer.valueOf(text[1].trim());
        }
        return fragment;
    }
}
