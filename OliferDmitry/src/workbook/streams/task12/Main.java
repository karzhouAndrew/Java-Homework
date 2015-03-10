package workbook.streams.task12;
// Имеется файл с текстом и числами. Найти все числа, распечатать, посчитать сумму, удалить все повторяющиеся числа и снова распечатать.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));

        String line = br.readLine();
        while (line != null) {
            Map<Integer, Integer> preMap = new HashMap<Integer, Integer>();
            preMap.putAll(lineToMap(line));
            map = mapToMap(map, preMap);
            line = br.readLine();
        }
        System.out.println("Numbers from file: " + map);
        System.out.println("Their sum is: " + mapSum(map));
        System.out.println("Numbers without repeat: " + map.keySet());

    }

    private static Map<Integer, Integer> lineToMap(String line) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        String[] splitted = line.split("[^0-9]+");
        for (String str : splitted) {
            if (str.length() > 0) {
                int key = Integer.parseInt(str);
                if (map.containsKey(key)) {
                    int value = map.get(key);
                    map.put(key, ++value);
                } else {
                    map.put(key, 1);
                }
            }
        }
        return map;
    }

    private static Map<Integer, Integer> mapToMap(Map<Integer, Integer> map, Map<Integer, Integer> preMap) {
        for(Map.Entry<Integer,Integer> pair : preMap.entrySet()) {
            int key = pair.getKey();
            int value = pair.getValue();
            if (map.containsKey(key)) {
                int mapValue = map.get(key);
                map.put(key, mapValue + value);
            } else {
                map.put(key, value);
            }
        }
        preMap.clear();
        return map;
    }

    private static int mapSum(Map<Integer, Integer> map) {
        int sum = 0;
        for (Map.Entry<Integer,Integer> pair : map.entrySet()) {
            sum += pair.getKey() * pair.getValue();
        }
        return sum;
    }
}
