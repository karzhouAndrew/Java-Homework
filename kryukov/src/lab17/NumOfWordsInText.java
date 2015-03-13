package lab17;

/*
Имеется строка с текстом. Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами,
в начале и конце текста также могуть быть пробелы, но могут и отсутствовать.
 */
public class NumOfWordsInText {
    public static void main(String[] args) {
        String text = "  Имеется строка с    текстом  . Подсчитать   количество слов в тексте. ";
        String[] words = text.trim().replace(".", "").replace(",", "").split(" +");
        System.out.print("В тексте " + words.length + " слов");
    }
}
