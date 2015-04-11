package workbook.lab33;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sam on 12.04.2015.
 */
public class FileManager {
    public FileManager() {
    }

    public void fileAnalize(String fileName){
        File path = new File(fileName);
        List<String> fileList = new ArrayList<String>();
        List<String> dirList = new ArrayList<String>();
        for (File file : path.listFiles()){
            if (file.isFile()){
                fileList.add(file.getName());
            }else{
                if (file.isDirectory()){
                    dirList.add(file.getName());
                }
            }
        }
        System.out.println("Dir list : " + dirList);
        System.out.println("File list : " + fileList);
    }
}
