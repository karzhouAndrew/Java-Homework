package workbook2.lab9;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;

/**
 * Created by Sam on 29.03.2015.
 * Напишите программу, преобразующую созданный в предыдущих за-даниях xml файл в html, аналогично данному примеру,
 * в каждой ячейке дополнительно к координате должны выводиться единицы измерения. Результат должен записываться в файл на диске.
 */
public class TestXSLTransform {
    public static void main(String[] args) {
        File stylesheet = new File("E:\\Java\\Homework\\Java-Homework\\Vasilevich\\src\\workbook2\\lab9\\Point.xsl");
        StreamSource styleSource = new StreamSource(stylesheet);

        Document doc = readXMLFile("E:\\Java\\Homework\\Java-Homework\\Vasilevich\\src\\workbook2\\lab9\\Point.xml");
        File resultFile = new File("E:\\Java\\Homework\\Java-Homework\\Vasilevich\\src\\workbook2\\lab9\\Point.html");

        try {
            Transformer t = TransformerFactory.newInstance().newTransformer(styleSource);
            t.transform(new DOMSource(doc.getDocumentElement()), new StreamResult(resultFile));
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerFactoryConfigurationError e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    private static Document readXMLFile(String fileName) {
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
