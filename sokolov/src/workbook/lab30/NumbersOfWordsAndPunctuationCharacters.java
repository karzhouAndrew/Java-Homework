package workbook.lab30;
/**
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
 */
public class NumbersOfWordsAndPunctuationCharacters {
    public static void main(String[] args) {
        String filePath = "F:/JAVA/Home_Work/Projectes/sokolov/src/workbook/lab30/text.txt";
        String text = " В языке Java ввод вывод организован с помощью потоков. Для каждого вида потока существует свой класс.\n" +
                " Основными классами для чтения информации из файла являются классы FileInputStream и FileReader.\n" +
                " Объекты данных классов выполняют базовые функции файлового ввода вывода, такие как открытие и закрытие файла,\n" +
                "чтение информации из файла. Отличие между этими двумя классами заключается в способе чтения информации.";
        MyFileWriter.recordTextInFile(text,filePath);

        String readFromTheFile = MyFileReader.readFile(filePath);
        Word word = new Word();
        System.out.println("число слов: " + word.NumberW(readFromTheFile));
        PunctuationCharacters punctuationCharacters = new PunctuationCharacters();
        System.out.println("количество знаков препинания: " + punctuationCharacters.getNumber(readFromTheFile));
    }
}
