package workbook2.lab9;

import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

/**
Набросок к задаче 9.
 */
public class Transformer {
    public static void main(String[] args) {
        File stylesheet = new File("transf.xsl");
        StreamSource styleSource = new StreamSource(stylesheet);
/*       try{
            Transformer t = TransformerFactory.newInstance().newTransformer(styleSource);
            t.transform(new DOMSource(doc.getDocumentElement()), new StreamResult(System.out));
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerFactoryConfigurationError e){
            e.printStackTrace();
        } catch (TransformerException e){
            e.printStackTrace();
        }*/
    }
}

