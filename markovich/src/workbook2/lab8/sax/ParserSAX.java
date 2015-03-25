package workbook2.lab8.sax;

import org.xml.sax.SAXException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Напишите программу, которая будет разбирать xml файл, сделан-ный в предыдущих заданиях с помощью StAX,
 * и выводить его на экран в текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух чисел,
 * разделенных запятой, при этом должна выводиться еди-ница измерения. Например: 10px, 30px
 */

public class ParserSAX {
    private static String PATH = "markovich/src/workbook2/lab8/sax/";

    public static void main(String[] args) {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            SAXHandler saxHandler = new SAXHandler();
            saxParser.parse(new File(PATH + "pointsList.xml"), saxHandler);
            List<Point> pointList = saxHandler.getPointList();
            for (Point point : pointList) {
                System.out.println(point);
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}

