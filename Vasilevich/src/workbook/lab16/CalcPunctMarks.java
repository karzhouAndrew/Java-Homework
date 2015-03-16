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

        for (int ind = 0; ind < markArr.length; ind++) {
            result += getCharCount(strVal, markArr[ind]);
        }

        System.out.println("Punctuation marks count = " + result);
    }

    private static int getCharCount(String strVal, char searchVal) {
        int count = 0;
        int ind = 0;
        while (ind != -1) {
            ind = strVal.indexOf(searchVal, ind);
            if (ind != -1) {
                ind++;
                count++;
            }
        }
        return count;
    }
}
