package workbook2.lab8.stax;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Напишите программу, которая будет разбирать xml файл, сделан-ный в предыдущих заданиях с помощью StAX,
 * и выводить его на экран в текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух чисел,
 * разделенных запятой, при этом должна выводиться еди-ница измерения. Например: 10px, 30px
 */
public class StaxParser {

    private static String PATH = "markovich/src/workbook2/lab8/stax/";

    public static void main(String[] args) {
        List<Point> pointList = staxParseXML(PATH + "pointsList.xml");
        for (Point point : pointList) {
            System.out.println(point.toString());
        }
    }

    private static List<Point> staxParseXML(String xmlFile) {
        List<Point> pointList = new ArrayList<Point>();
        Point point = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(xmlFile));
            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    if (startElement.getName().getLocalPart().equals("point")) {
                        point = new Point();
                        Attribute unitAttribute = startElement.getAttributeByName(new QName("unit"));
                        if (unitAttribute != null) {
                            point.setUnit(unitAttribute.getValue());
                        }
                    } else if (startElement.getName().getLocalPart().equals("x")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        point.setCoordinateX(Integer.parseInt(xmlEvent.asCharacters().getData()));
                    } else if (startElement.getName().getLocalPart().equals("y")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        point.setCoordinateY(Integer.parseInt(xmlEvent.asCharacters().getData()));
                    }
                }
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                    if (endElement.getName().getLocalPart().equals("point")) {
                        pointList.add(point);
                    }
                }
            }

        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return pointList;
    }
}
