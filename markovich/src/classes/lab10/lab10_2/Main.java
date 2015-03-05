package classes.lab10.lab10_2;

/**
 * Создайте итератор, который может проходить массив строк.
 */
public class Main {
    public static void main(String[] args) {
        String[] words = new String[]{"mather","father","son","daughter","sister","brother","grandfather","grandmother","uncle"};

        for(String word : words) {
            System.out.println(word);
        }
    }
}
