package workbook2.lab9;

import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;

/**
 * Напишите программу, преобразующую созданный в предыдущих за-даниях xml файл в html, аналогично данному примеру,
 * в каждой ячейке дополнительно к координате должны выводиться единицы измерения.
 * Результат должен записываться в файл на диске.
 */

public class XSLTExample {
    public static void main(String[] args) throws TransformerException, FileNotFoundException {
        XMLTransformer optimusPrime = new XMLTransformer();
        optimusPrime.transform();
    }
}