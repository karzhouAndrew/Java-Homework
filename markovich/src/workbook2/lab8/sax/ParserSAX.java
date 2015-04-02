package workbook2.lab8.sax;

/**
 * Напишите программу, которая будет разбирать xml файл, сделан-ный в предыдущих заданиях с помощью StAX,
 * и выводить его на экран в текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух чисел,
 * разделенных запятой, при этом должна выводиться еди-ница измерения. Например: 10px, 30px
 */

public class ParserSAX {

    private static String XML_FILE_PATH = "markovich/src/workbook2/lab8/sax/pointsList.xml";

    public static void main(String[] args) {

        ParseUnit.ParseFile(XML_FILE_PATH);

    }
}

