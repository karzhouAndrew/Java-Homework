package workbook2.lab8;

import java.util.List;

/**
 * Напишите программу, которая будет разбирать xml файл, сделан-ный в предыдущих заданиях с помощью StAX,
 * и выводить его на экран в текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух чисел,
 * разделенных запятой, при этом должна выводиться еди-ница измерения. Например: 10px, 30px
 */
public class StaxParserExample {

    private static String PATH = "markovich/src/workbook2/lab8/";

    public static void main(String[] args) {
        List<Point> pointList = StaxParser.staxParseXML(PATH + "pointsList.xml");
        for (Point point : pointList) {
            System.out.println(point.toString());
        }
    }
}
