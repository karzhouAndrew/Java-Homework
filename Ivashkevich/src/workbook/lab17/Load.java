package workbook.lab17;

/**
 * Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть, что слова
 * могут разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы,
 * но могут и отсутствовать.
 */
public class Load {
    public static void main(String[] args) {
        String text = " Строка c несколькими    словами         разделенными   разным колличеством пробелов       ";
        TextManager textManager = new TextManager();
        textManager.searchWord(text);
    }
}
