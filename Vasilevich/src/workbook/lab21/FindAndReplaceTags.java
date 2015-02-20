package workbook.lab21;

/**
 * Created by Sam on 20.02.2015.
 * Написать программу, выполняющую поиск в строке всех тегов абзацев,
 * в том числе тех, у которых есть параметры, например <p id="p1"> и замену их на простые теги абзацев <p>
 */

public class FindAndReplaceTags {
    public static void main(String[] args) {
        String strVal = "PREF 0x67=<p id=\"sdew\">Qvh5skA3-M8D13X8W06Sek</p>g811C2<p name=\"dsd\">U02LMG</p>e4Kgy9-poBbUnc";
        String strResult = findAndReplaceTags(strVal);
        System.out.println("Result = " + strResult);

    }

    private static String findAndReplaceTags(String strVal) {

        return strVal.replaceAll("<p[^>]+>", "<p>");
    }
}
