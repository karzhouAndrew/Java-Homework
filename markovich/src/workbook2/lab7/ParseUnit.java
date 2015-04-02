package workbook2.lab7;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

import static workbook2.lab7.PointTags.*;

public class ParseUnit {
    public static void parseFile(String xmlFilePath) {
        try {
            File xmlFile = new File(xmlFilePath);
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(xmlFile);

            System.out.println(document.getDocumentElement().getNodeName());

            NodeList nodeList = document.getElementsByTagName(POINT.toString().toLowerCase());

            for (int i = 0; i < nodeList.getLength(); i++) {
                System.out.println("----------------------");
                Node node = nodeList.item(i);

                System.out.println(node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    readPoint(element);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readPoint(Element point) {
        System.out.println(point.getElementsByTagName(X.toString().toLowerCase()).item(0).getTextContent() +
                point.getAttribute(UNIT.toString().toLowerCase()) + ", " +
                point.getElementsByTagName(PointTags.Y.toString().toLowerCase()).item(0).getTextContent() +
                point.getAttribute(UNIT.toString().toLowerCase()));
    }
}
