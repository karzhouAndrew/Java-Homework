package workbook2.workbook2Tasks.parser.blinovTask;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class MySAXParser {

    public static void parseXML(String fileName) throws ParserConfigurationException, SAXException, IOException {

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        DefaultHandler defaultHandler = new DefaultHandler() {
            boolean bPlants, bTree, bBush, bName, bAge, bHeight, bBerries, bInflorescence;

            public void startElement(String uri, String localName, String qName, Attributes attributes) {
                if (qName.equalsIgnoreCase(Tags.PLANTS.toString()))
                    bPlants = true;
                if (qName.equalsIgnoreCase(Tags.TREE.toString()))
                    bTree = true;
                if (qName.equalsIgnoreCase(Tags.BUSH.toString()))
                    bBush = true;
                if (qName.equalsIgnoreCase(Tags.NAME.toString()))
                    bName = true;
                if (qName.equalsIgnoreCase(Tags.AGE.toString()))
                    bAge = true;
                if (qName.equalsIgnoreCase(Tags.HEIGHT.toString()))
                    bHeight = true;
                if (qName.equalsIgnoreCase(Tags.BERRIES.toString()))
                    bBerries = true;
                if (qName.equalsIgnoreCase(Tags.INFLORESCENCE.toString()))
                    bInflorescence = true;
            }

            public void endElement(String uri, String localName, String qName) {}

            public void characters(char ch[], int start, int length) {
                if (bPlants) {
                    bPlants = false;
                }
                if (bTree) {
                    bTree = false;
                }
                if (bBush) {
                    bBush = false;
                }
                if (bName) {
                    System.out.println("\nName: " + new String(ch, start, length));
                    bName = false;
                }
                if (bAge) {
                    System.out.println("Age: " + new String(ch, start, length));
                    bAge = false;
                }
                if (bHeight) {
                    System.out.println("Height: " + new String(ch, start, length));
                    bHeight = false;
                }
                if (bBerries) {
                    System.out.println("Berries: " + new String(ch, start, length));
                    bBerries = false;
                }
                if (bInflorescence) {
                    System.out.println("Inflorescence: " + new String(ch, start, length));
                    bInflorescence = false;
                }
            }
        };
        saxParser.parse(fileName, defaultHandler);
    }
}
