package added.lab15;

import javax.xml.transform.sax.SAXSource;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Sam on 11.03.2015.
 */
public class BlobItemChooseTester {
    public static void main(String[] args) {
        ObjectType obj = ObjectType.OBJ_TYPE_NONE;
        while (obj == ObjectType.OBJ_TYPE_NONE) {
            System.out.println("Enter word/char/int/double");
            Scanner scan = new Scanner(System.in);
            String val = scan.next();

            if (val.equals("word")) {
                obj = ObjectType.OBJ_TYPE_WORD;
            } else {
                if (val.equals("char")) {
                    obj = ObjectType.OBJ_TYPE_CHAR;
                } else {
                    if (val.equals("int")) {
                        obj = ObjectType.OBJ_TYPE_INT;
                    } else {
                        if (val.equals("double")) {
                            obj = ObjectType.OBJ_TYPE_DOUBLE;
                        }
                    }
                }
            }
        }

        ReadDataFromFile switcher = new ReadDataFromFile();

        try {
            switcher.readDataFromFile();
        } catch (IOException e) {
            System.out.println(e.toString());
        }

        System.out.println("Type = " + obj);
        System.out.println("Before = " + switcher);
        switcher.convertStringArray(obj);
        System.out.println("After = " + switcher);
    }
}
