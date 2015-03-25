package workbook2.lab8;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Leonid on 24.03.2015.
 */
public class STAXParser implements Parser {

    @Override
    public void parseXML() {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
        try {
            XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(new FileInputStream(XML_FILE));
            doParsing(xmlStreamReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

    }

    private void doParsing(XMLStreamReader xmlStreamReader) throws XMLStreamException {
        boolean isX = false;
        boolean isY = false;
        String unit = "";
        while (xmlStreamReader.hasNext()) {
            int res = xmlStreamReader.next();
            if (res == xmlStreamReader.START_ELEMENT) {
                if (xmlStreamReader.getLocalName().equals("point")) {
                    unit = xmlStreamReader.getAttributeValue(0);
                } else if (xmlStreamReader.getLocalName().equals("x")) {
                    isX = true;
                } else if (xmlStreamReader.getLocalName().equals("y")) {
                    isY = true;
                }
            } else if (res == xmlStreamReader.CHARACTERS) {
                if (isX) {
                    System.out.print("Point: " + xmlStreamReader.getText() + unit);
                    isX = false;
                } else if (isY) {
                    System.out.println(", " + xmlStreamReader.getText() + unit);
                    isY = false;
                }
            }
        }

    }
}