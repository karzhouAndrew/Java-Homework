package workbook.test7_11;

/**
 * Создать файл с текстом, прочитать, подсчитать знаки препинания и слова.
 */
public class TextFileTest {
    public static void main(String[] args) {
        TextWriter textWriter = new TextWriter();
        textWriter.writer();
        TextReader textReader = new TextReader();
        textReader.reader();
    }
}
