package workbook2.test9;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 преобразователь xml в html
 */
public class TransformerXML {
    public static void main(String[] args) {
        StreamSource streamSource = new StreamSource(new File("c:\\Java\\WORK\\Java-Homework\\mikhailiuk\\src\\workbook2\\test9\\point.xsl"));
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Templates templates = transformerFactory.newTemplates(streamSource);
            Transformer transformer = templates.newTransformer();
            transformer.transform(new StreamSource(new File("c:\\Java\\WORK\\Java-Homework\\mikhailiuk\\src\\workbook2\\test9\\point2.xml")), new StreamResult(new FileOutputStream(new File("c:\\Java\\WORK\\Java-Homework\\mikhailiuk\\src\\workbook2\\test9\\point2.html"))));
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
