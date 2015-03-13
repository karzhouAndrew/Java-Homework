package workbook.lab35;

import java.util.*;

/**
 * Created by Asus on 06.03.2015.
 */
public class Task10 {
    public static void main(String[] args) {
        String str = "На дворе трава на траве дрова Не руби дрова на траве двора";
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(str.split(" ")));
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        int n = 0;
        for(int i =0; i < list.size(); i++){
            if(hashMap.containsKey(list.get(i))){
                hashMap.put(list.get(i), ++n);
            }
            else hashMap.put(list.get(i), n = 1);
        }
        System.out.println(hashMap);

    }
}
