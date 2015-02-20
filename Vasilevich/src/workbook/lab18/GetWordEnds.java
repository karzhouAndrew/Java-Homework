package workbook.lab18;

/**
 * Created by Sam on 20.02.2015.
 * Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов
 */
public class GetWordEnds {
    public static void main(String[] args) {
        String strVal = "Всем привет.\n" +
                "Читаем и выполняем задачи из тетрадки Тема 3 + задача №6.\n" +
                "Решаем домашние задачи и приносим с собой на занятие.";
        String strResult = getWordEnds(strVal);
        System.out.println("Word result = " + strResult);
    }

    private static String getWordEnds(String strVal) {
        boolean lastCharWasEnd = false;
        String strResult = "";
        for (int ind = 1; ind < strVal.length(); ind++) {
            if (checkSymbol(strVal.charAt(ind))) {
                if (!lastCharWasEnd) {
                    strResult += strVal.charAt(ind - 1);
                    lastCharWasEnd = true;
                }

            } else {
                lastCharWasEnd = false;
            }

        }

        if ((strVal.length() > 0) && (!lastCharWasEnd)) {
            strResult += strVal.charAt(strVal.length() - 1);
        }
        return strResult;
    }

    private static char endWordSymbols[] = {' ', ',', '.', '!', '?', '-', '(', ')'};

    private static boolean checkSymbol(char checkSymbol) {
        for (int ind = 0; ind < endWordSymbols.length; ind++) {
            if (checkSymbol == endWordSymbols[ind]) {
                return true;
            }
        }
        return false;
    }

}
