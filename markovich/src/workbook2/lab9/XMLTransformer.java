package workbook2.lab9;

import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class XMLTransformer {

    private static String PATH = "markovich/src/workbook2/lab9/";

    public void transform() throws TransformerException, FileNotFoundException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        StreamSource streamSource = new StreamSource(new File(PATH + "pointsList.xsl"));
        Templates templates = transformerFactory.newTemplates(streamSource);
        Transformer transformer = templates.newTransformer();
        transformer.transform(new StreamSource(new File(PATH + "pointsList.xml")),
                new StreamResult(new FileOutputStream(new File(PATH + "pointsList.html"))));
    }
}