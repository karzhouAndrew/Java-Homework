package workbook2.lab8.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import workbook2.lab8.Parser;
import workbook2.lab8.Point;
import workbook2.lab8.UtilPrint;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static workbook2.lab8.PointTags.*;

public class ParserDOM implements Parser {

    @Override
    public List<Point> parseXML() {
        List<Point> pointList = new ArrayList<Point>();
        Point point;
        try {
            File xmlFile = new File(XML_FILE_PATH);
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(xmlFile);

            NodeList nodeList = document.getElementsByTagName(POINT.toString().toLowerCase());

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    point = new Point();
                    point.setUnit(element.getAttribute(UNIT.toString().toLowerCase()));
                    point.setCoordinateX(Integer.parseInt(element.getElementsByTagName(X.toString().toLowerCase()).item(0).getTextContent()));
                    point.setCoordinateY(Integer.parseInt(element.getElementsByTagName(Y.toString().toLowerCase()).item(0).getTextContent()));
                    pointList.add(point);
                }
            }

            UtilPrint.printList(pointList);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return pointList;
    }
}
