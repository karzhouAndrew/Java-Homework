package workbook2.lab8;

import java.util.List;

public interface Parser {

    String XML_FILE_PATH = "markovich/src/workbook2/lab8/pointsList.xml";
    List<Point> parseXML();

}
