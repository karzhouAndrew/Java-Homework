package workbook2.lab7;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Напишите программу, которая будет разбирать xml файл, сделанный в предыдущих заданиях с помощью DOM,
 * и выводить его на экран в текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух чисел,
 * разделенных запятой, при этом должна выводиться единица измерения. Например: 10px, 30px
 */

public class ParserExample {

    private static String PATH = "markovich/src/workbook2/lab7/";

    public static void main(String[] args) {

        try {
            File xmlFile = new File(PATH + "pointsList.xml");
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(xmlFile);

            System.out.println(document.getDocumentElement().getNodeName());

            NodeList nodeList = document.getElementsByTagName("point");

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
        System.out.println(point.getElementsByTagName("x").item(0).getTextContent() +
                point.getAttribute("unit") + ", " +
                point.getElementsByTagName("y").item(0).getTextContent() +
                point.getAttribute("unit"));
    }
}
