package workbook2.lab8.sax;

import org.xml.sax.SAXException;
import workbook2.lab8.Parser;
import workbook2.lab8.Point;
import workbook2.lab8.UtilPrint;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserSAX implements Parser{
    @Override
    public List<Point> parseXML() {
        List<Point> pointList = new ArrayList<Point>();
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            SAXHandler saxHandler = new SAXHandler();
            saxParser.parse(new File(XML_FILE_PATH), saxHandler);
            pointList = saxHandler.getPointList();

            UtilPrint.printList(pointList);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return pointList;
    }
}
