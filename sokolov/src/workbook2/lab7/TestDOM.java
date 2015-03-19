package workbook2.lab7;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Задание 7
 * Напишите программу, которая будет разбирать xml файл, сделанный в предыдущих заданиях с помощью DOM,
 * и выводить его на экран в текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух чисел,
 * разделенных запятой, при этом должна выводиться единица измерения. Например: 10px, 30px
 */
public class TestDOM {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document doc = null;
        ;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        File f = new File("Unit.xml");
        try {
            // Document doc = builder.newDocument();
            doc = builder.parse(f);
            Element root = doc.getDocumentElement();
            System.out.println("The tag name of the element:");
            System.out.println(root.getTagName());

            //System.out.println("Get child elements...");
            NodeList nList = root.getChildNodes();
            System.out.println("Print the names of all child elements:");
            for (int i = 0; i < nList.getLength(); i++) {
                System.out.println(nList.item(i).getNodeName());
            }

            //System.out.println("To obtain only child tags: ");
            for (int i = 0; i < nList.getLength(); i++) {
                if (nList.item(i) instanceof Element) {
                    NamedNodeMap attributes = nList.item(i).getAttributes();
                    System.out.print(attributes.item(1));
                    System.out.print(attributes.item(0));
                    System.out.print(", ");
                    System.out.print(attributes.item(2));
                    System.out.print(attributes.item(0));
                }
            }

            System.out.println("The solution of the problem:");

        } catch (SAXException e) {
            System.out.println("SAXException:");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException:");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception:");
            e.printStackTrace();
        }

    }
}
//1)Видит ли f файл из lab4
/*
doc = builder.parse(f);
Element root = doc.getDocumentElement();
System.out.println(root.getTagName());
NodeList nList = root.getChildNodes();
2)подчеркнута первая строка и остальные методы get... красные
3)в теге  poit являются ли unit, x и y параметрами ?
        */