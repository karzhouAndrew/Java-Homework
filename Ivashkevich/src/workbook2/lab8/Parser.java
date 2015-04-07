package workbook2.lab8;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;

/**
 * Created by Leonid on 24.03.2015.
 */
public interface Parser {
    String XML_FILE = "Ivashkevich\\src\\workbook2\\lab8\\Point.xml";
    void parseXML() throws ParserConfigurationException, SAXException, FileNotFoundException;
}
