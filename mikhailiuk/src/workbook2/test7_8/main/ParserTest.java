package workbook2.test7_8.main;

import workbook2.test7_8.entity.Point;
import workbook2.test7_8.parsers.Parser;
import workbook2.test7_8.parsers.ParserFactory;

import java.io.File;
import java.util.List;

/**
 * Разобрать xml файл с помощью парсера вывести на экран, каждую точку в виде двух чисел с запятой и единицами измерения.
 * Название парсера указать (DOM, StAX).
 */
public class ParserTest {
    public static void main(String[] args) {
        ParserFactory parserFactory = new ParserFactory();
        Parser parser = parserFactory.createParser("StAX");
        File file = new File(".\\mikhailiuk\\src\\workbook2\\test7_8\\point3.xml");
        List<Point> listOfPoints = parser.parse(file);
        Point point = new Point();
        point.pointsPrinter(listOfPoints);
    }
}
