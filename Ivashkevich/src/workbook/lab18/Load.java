package workbook.lab18;

/*
 * Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
 */
public class Load {
    public static void main(String[] args) {
        String text = "Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.";
        TextManager textManager = new TextManager();
        textManager.searchLetter(text);
    }
}
