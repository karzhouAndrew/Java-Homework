package workbook.lab17;

public class NumberOfWords {
    public static void main(String[] args) {
        String string = "   Пьесы   Шекспира переведены на все основные языки и ставятся чаще," +
                " чем произведения других  драматургов.   ";
        Word word = new Word(string);
        System.out.println(word.numberW());
    }
}
