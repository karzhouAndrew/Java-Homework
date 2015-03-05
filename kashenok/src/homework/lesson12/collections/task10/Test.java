package homework.lesson12.collections.task10;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        String text = "Я изучаю мапы и у меня нет вопросов вопросов я я вопросов мапы";
        String[] wordsArray = text.split(" +");
        for (int i = 0; i < wordsArray.length; i++) {
            System.out.println(wordsArray[i]);
        }

        Map<String, Integer> textMap = new HashMap<String, Integer>();
        for (String p : wordsArray) {
            if (textMap.containsKey(p)) {
                int count = textMap.get(p);
                textMap.put(p, ++count);
            } else {
                textMap.put(p, 1);
            }
        }

        System.out.println("textMap = " + textMap);


        /*
        for (int j = 0; j<wordsArray.length; j++){
            textMap.put(wordsArray[j], 1);

        }
        System.out.println("textMap = " + textMap);






        int counter =1;
        for (int i=0; i<textMap.size(); i++){

            if (textMap.containsKey())
        }
*/


    }
}
