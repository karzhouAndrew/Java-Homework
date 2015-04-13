package workbook2.lab7;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Sam on 29.03.2015.
 */
public class DOMXMLReader {
    public DOMXMLReader() {
    }

    public void parseXML(String fileName) {
        Document doc = readXMLFile(fileName);

        if (doc != null) {
            Element root = doc.getDocumentElement();
            ArrayList<Point> pointList = new ArrayList<Point>();
            if (root.getTagName().equals("pointlist")) {
                NodeList nodeList = root.getChildNodes();
                for (int i = 0; i < nodeList.getLength(); i++) {
                    Point point = new Point();
                    Node node = nodeList.item(i);
                    if (node.getNodeName().equals("point")) {
                        NamedNodeMap attributes = node.getAttributes();
                        point.setUnit(attributes.getNamedItem("unit").getNodeValue());
                        NodeList childNodes = node.getChildNodes();
                        for (int childItem = 0; childItem < childNodes.getLength(); childItem++) {
                            Node childNode = childNodes.item(childItem);
                            if (childNode.getNodeName().equals("x")) {
                                point.setX(Integer.parseInt(childNode.getTextContent()));
                            } else {
                                if (childNode.getNodeName().equals("y")) {
                                    point.setY(Integer.parseInt(childNode.getTextContent()));
                                }
                            }
                        }
                        pointList.add(point);
                    }
                }
            }
            System.out.println(pointList.toString());
        }
    }

    private Document readXMLFile(String fileName) {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        builderFactory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder builder = null;
        Document doc = null;
        try {
            builder = builderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        File file = new File(fileName);
        try {
            doc = builder.parse(file);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

}
