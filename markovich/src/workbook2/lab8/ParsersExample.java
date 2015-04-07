package workbook2.lab8;

import java.util.List;

import static workbook2.lab8.ParsersTypeEnum.*;

/**
 * Напишите программу, которая будет разбирать xml файл, сделанный в предыдущих заданиях с помощью DOM,
 * и выводить его на экран в текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух чисел,
 * разделенных запятой, при этом должна выводиться единица измерения. Например: 10px, 30px
 */

public class ParsersExample {

    public static void main(String[] args) {

        Parser parser = ParserFactory.getParser(SAX);
        List<Point> pointList = parser.parseXML();

        UtilPrint.printList(pointList);

    }
}