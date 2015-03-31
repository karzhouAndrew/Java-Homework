package workbook2.lab7;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by Leonid on 23.03.2015.
 */
public class DOMParser implements Parser {
    @Override
    public void parseXML() {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setIgnoringElementContentWhitespace(true);
        DocumentBuilder db;
        Document doc = null;
        try {
            db = dbf.newDocumentBuilder();
            doc = db.parse(XML_FILE);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        doParsing(doc);
    }
    private void doParsing(Document doc) {
        Element catalog = doc.getDocumentElement();
        NodeList nodeList = catalog.getElementsByTagName("point");
        String valueX, valueY, unit;
        for (int i = 0; i < nodeList.getLength(); ++i) {
            Element el = (Element) nodeList.item(i);
            unit = el.getAttribute("unit");
            valueX = el.getElementsByTagName("x").item(0).getChildNodes().item(0).getNodeValue();
            valueY = el.getElementsByTagName("y").item(0).getChildNodes().item(0).getNodeValue();
            System.out.println(valueX + "" + unit + ", " + valueY + "" + unit);
        }
    }
}

