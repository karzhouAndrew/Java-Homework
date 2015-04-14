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
        for (int i = 1; i < strVal.length(); i++) {
            if (checkSymbol(strVal.charAt(i))) {
                if (!lastCharWasEnd) {
                    strResult += strVal.charAt(i - 1);
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

    private static boolean checkSymbol(char checkSymbol) {
        char endWordSymbols[] = {' ', ',', '.', '!', '?', '-', '(', ')'};
        for (int i = 0; i < endWordSymbols.length; i++) {
            if (checkSymbol == endWordSymbols[i]) {
                return true;
            }
        }
        return false;
    }

}
