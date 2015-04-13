package workbook2.lab8;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sam on 11.04.2015.
 */
public class StAXXMLReader {

    public StAXXMLReader() {
    }

    public void parseXML(String fileName) {
        XMLStreamReader reader = readXMLFile(fileName);
        if (reader != null) {
            List<Point> pointList = new ArrayList<Point>();
            try {
                while (reader.hasNext()) {
                    int res = reader.next();
                    if (res == reader.START_ELEMENT) {
                        if (reader.getLocalName().equals("point")) {
                            try {
                                Point point = getReaderPointElem(reader);
                                pointList.add(point);
                            } catch (XMLStreamException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            } catch (XMLStreamException e) {
                e.printStackTrace();
            }
            System.out.println(pointList);
        }
    }

    private XMLStreamReader readXMLFile(String fileName) {
        XMLInputFactory factory = XMLInputFactory.newFactory();
        XMLStreamReader reader = null;
        try {
            try {
                reader = factory.createXMLStreamReader(new FileInputStream(fileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        return reader;
    }

    private Point getReaderPointElem(XMLStreamReader reader) throws XMLStreamException {
        Point point = new Point();
        if (reader.getAttributeLocalName(0).equals("unit")) {
            point.setUnit(reader.getAttributeValue(0));
        }

        while (reader.hasNext()) {
            int res = reader.next();
            if (res == reader.START_ELEMENT) {
                if (reader.getLocalName().equals("x")) {
                    res = reader.next();
                    if (res == reader.CHARACTERS) {
                        point.setX(Integer.parseInt(reader.getText()));
                    }
                } else {
                    if (reader.getLocalName().equals("y")) {
                        res = reader.next();
                        if (res == reader.CHARACTERS) {
                            point.setY(Integer.parseInt(reader.getText()));
                        }
                        break;
                    }
                }
            }
        }
        return point;
    }

}
