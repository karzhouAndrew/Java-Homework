package workbook2.test7_8.parsers.impl;

import workbook2.test7_8.parsers.Parser;
import workbook2.test7_8.entity.Point;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Natashka on 19.03.2015.
 */
public class StAXParser implements Parser {
    public List<Point> parse(File file) {
        XMLInputFactory factory = XMLInputFactory.newFactory();
        XMLStreamReader reader = null;
        boolean x = false;
        boolean y = false;
        List<Point> listOfPoints = new ArrayList<Point>();
        try {
            reader = factory.createXMLStreamReader(new FileInputStream(file));
            Point parsedPoint = new Point();
            while (reader.hasNext()) {
                int result = reader.next();
                String localName;
                if (result == XMLStreamConstants.START_ELEMENT) {
                    localName = reader.getLocalName();
                    if (localName.equals("pointsList")) {
                        System.out.println(localName);
                    } else if (localName.equals("point")) {
                        parsedPoint.setName(localName);
                        parsedPoint.setUnits(reader.getAttributeValue(0));
                    } else if (localName.equals("x")) {
                        x = true;
                    } else if (localName.equals("y")) {
                        y = true;
                    }
                } else if (result == XMLStreamConstants.CHARACTERS) {
                    if (x) {
                        parsedPoint.setCoordinateX(Integer.parseInt(reader.getText()));
                        x = false;
                    } else if (y) {
                        parsedPoint.setCoordinateY(Integer.parseInt(reader.getText()));
                        y = false;
                    }
                } else if (result == XMLStreamConstants.END_ELEMENT) {
                    localName = reader.getLocalName();
                    if (localName.equals("point")) {
                        listOfPoints.add(parsedPoint);
                        parsedPoint = new Point();
                    }
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return listOfPoints;
    }
}
