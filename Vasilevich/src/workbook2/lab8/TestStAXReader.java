package workbook2.lab8;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Sam on 11.04.2015.
 * Напишите программу, которая будет разбирать xml файл, сделан-ный в предыдущих заданиях с помощью StAX,
 * и выводить его на экран в текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух чисел,
 * разделенных запятой, при этом должна выводиться еди-ница измерения. Например: 10px, 30px
 */
public class TestStAXReader {
    public static void main(String[] args) throws FileNotFoundException {
        StAXXMLReader reader = new StAXXMLReader();
        reader.parseXML("E:\\Java\\Homework\\Java-Homework\\Vasilevich\\src\\workbook2\\lab8\\Point.xml");
    }

}
