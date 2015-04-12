package added.lab15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Sam on 11.03.2015.
 * Файл содержит символы, слова, целые и дробные числа. Определить все типы данные, которые вводит пользователь
 */
public class ReadDataFromFile {
    private final String fileName = "Blob.txt";
    private List<String> blobItemList = new ArrayList<String>();

    public void readDataFromFile() throws IOException {
        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String val = reader.readLine();
        while (val != null) {
            String[] stringList = val.split(" ");
            for (String strVal : stringList) {
                blobItemList.add(strVal);
            }
            val = reader.readLine();
        }
    }

    private boolean tryConvertToDouble(String line) {
        if (!tryConvertToInt(line)) {
            try {
                Double.parseDouble(line);
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean tryConvertToInt(String line) {
        try {
            Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private boolean tryConvertToWords(String line) {
        if (line.length() > 1) {
            return (!tryConvertToDouble(line) && (!tryConvertToInt(line)));
        }
        return false;
    }

    private boolean tryConvertToChar(String line) {
        if (line.length() == 1) {
            return line.matches("[a-zA-Z]");
        }
        return false;
    }

    public void convertStringArray(ObjectType objectType) {
        Iterator<String> iterator = blobItemList.iterator();
        while (iterator.hasNext()) {
            if (objectType == ObjectType.OBJ_TYPE_DOUBLE) {
                if (!tryConvertToDouble(iterator.next())) {
                    iterator.remove();
                }
            } else {
                if (objectType == ObjectType.OBJ_TYPE_INT) {
                    if (!tryConvertToInt(iterator.next())) {
                        iterator.remove();
                    }
                } else {
                    if (objectType == ObjectType.OBJ_TYPE_WORD) {
                        if (!tryConvertToWords(iterator.next())) {
                            iterator.remove();
                        }
                    } else {
                        if (objectType == ObjectType.OBJ_TYPE_CHAR) {
                            if (!tryConvertToChar(iterator.next())) {
                                iterator.remove();
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "ReadDataFromFile{" +
                "fileName='" + fileName + '\'' +
                ", blobItemList=" + blobItemList +
                '}';
    }
}
