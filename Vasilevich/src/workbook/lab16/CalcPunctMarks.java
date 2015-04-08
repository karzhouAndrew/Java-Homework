package workbook.lab16;

/**
 * Created by Sam on 20.02.2015.
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество
 */
public class CalcPunctMarks {
    public static void main(String[] args) {
        String strVal = "Напомню скайп: rfe.cook.\n" +
                "Завтра дополнительно скину лекцию номер два на дропбокс.\n" +
                "Если есть вопросы или что-то не понятно/не работает пишем, не стесняемся.";
        int result = 0;

        char markArr[] = {',', '.', '!', '?'};

        for (int i = 0; i < markArr.length; i++) {
            result += getCharCount(strVal, markArr[i]);
        }

        System.out.println("Punctuation marks count = " + result);
    }

    private static int getCharCount(String strVal, char searchVal) {
        int count = 0;
        int i = 0;
        while (i != -1) {
            i = strVal.indexOf(searchVal, i);
            if (i != -1) {
                i++;
                count++;
            }
        }
        return count;
    }
}
