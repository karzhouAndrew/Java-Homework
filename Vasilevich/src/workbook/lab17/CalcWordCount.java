package workbook.lab17;

/**
 * Created by Sam on 20.02.2015.
 * Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть, что слова могут разделяться несколькими
 * пробелами, в начале и конце текста также мргут быть пробелы, но могут и отутствовать.
 */
public class CalcWordCount {
    public static void main(String[] args) {

        String strVal = "Всем привет.\n" +
                "Читаем и выполняем задачи из тетрадки Тема 3 + задача №6.\n" +
                "Решаем домашние задачи и приносим с собой на занятие.";
        int wordCount = calcCountWord(strVal);
        System.out.println("Word count = " + wordCount);
    }

    private static int calcCountWord(String strVal) {
        boolean lastCharWasEnd = false;
        int wordCount = 0;
        for (int i = 0; i < strVal.length(); i++) {
            if (checkSymbol(strVal.charAt(i))) {
                if (!lastCharWasEnd){
                    wordCount++;
                    lastCharWasEnd = true;
                }
            }else{
                lastCharWasEnd = false;
            }
        }
        if ((strVal.length() > 0) && (!lastCharWasEnd)) {
            wordCount++;
        }
        return wordCount;
    }

    private static char endWordSymbols[] = {' ', ',', '.', '!', '?', '-', '(', ')'};

    private static boolean checkSymbol(char checkSymbol) {
        for (int i = 0; i < endWordSymbols.length; i++) {
            if (checkSymbol == endWordSymbols[i]) {
                return true;
            }
        }
        return false;
    }


}
