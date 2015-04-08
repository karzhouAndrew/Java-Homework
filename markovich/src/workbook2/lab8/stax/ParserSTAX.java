package workbook2.lab8.stax;

import workbook2.lab8.Parser;
import workbook2.lab8.Point;
import workbook2.lab8.UtilPrint;

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

import static workbook2.lab8.PointTags.*;

public class ParserSTAX implements Parser{
    @Override
    public List<Point> parseXML() {
        List<Point> pointList = new ArrayList<Point>();
        Point point = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(XML_FILE_PATH));
            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    if (startElement.getName().getLocalPart().equals(POINT.toString().toLowerCase())) {
                        point = new Point();
                        Attribute unitAttribute = startElement.getAttributeByName(new QName(UNIT.toString().toLowerCase()));
                        point.setUnit(unitAttribute.getValue());
                    } else if (startElement.getName().getLocalPart().equals(X.toString().toLowerCase())) {
                        xmlEvent = xmlEventReader.nextEvent();
                        point.setCoordinateX(Integer.parseInt(xmlEvent.asCharacters().getData()));
                    } else if (startElement.getName().getLocalPart().equals(Y.toString().toLowerCase())) {
                        xmlEvent = xmlEventReader.nextEvent();
                        point.setCoordinateY(Integer.parseInt(xmlEvent.asCharacters().getData()));
                    }
                }
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                    if (endElement.getName().getLocalPart().equals(POINT.toString().toLowerCase())) {
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
