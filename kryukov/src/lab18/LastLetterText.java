package lab18;

/*
Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
 */
public class LastLetterText {
    public static void main(String[] args) {
        String text = "Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.";
        String[] words = text.trim().replace(".", "").replace(",", "").split(" +");
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            System.out.print(word[word.length - 1] + " ");
        }

    }
}
