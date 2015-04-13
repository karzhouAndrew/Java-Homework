package workbook2.lab7;

/**
 * Created by Sam on 29.03.2015.
 * Напишите программу, которая будет разбирать xml файл, сделанный в предыдущих заданиях с помощью DOM,
 * и выводить его на экран в текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух чисел,
 * разделенных запятой, при этом должна выводиться единица измерения. Например: 10px, 30px
 */
public class TestDOMReader {
    public static void main(String[] args) {


        DOMXMLReader reader = new DOMXMLReader();
        reader.parseXML("E:\\Java\\Homework\\Java-Homework\\Vasilevich\\src\\workbook2\\lab7\\Point.xml");
    }
}
