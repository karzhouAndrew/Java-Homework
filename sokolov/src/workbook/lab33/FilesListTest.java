package workbook.lab33;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно.
 */
public class FilesListTest {
    public static void main(String[] args) {
        String filePath = ".";
        File file = new File(filePath);
        String[] pathArray = file.list();
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < pathArray.length; i++) {
            if (pathArray[i].contains(".")) {
                System.out.println(pathArray[i]);
            } else {
                list.add(pathArray[i]);
            }
        }
        System.out.println();
        Iterator iterator = list.iterator() ;
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
