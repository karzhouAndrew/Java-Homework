package workbook.lab29;

import java.util.*;

/**
 * Имеется текст. Следует составить для него частотный словарь.
 */
public class FrequencyDictionary {
    private String text;
    private List<Word> wordList = new ArrayList<Word>();
    private Set<Word> wordSet = new LinkedHashSet<Word>();

    public FrequencyDictionary(String text) {
        this.text = text;
        addWordList();
        removeCopy();
        outSetList();
    }

    private void addWordList() {
        String[] strings = (text.split("\\W"));
        String str;
        Word word;
        int number = 0;
        for (int i = 0; i < strings.length; i++) {
            str = strings[i];
            if (str.equals("")) {
                continue;
            }
            for (int j = 0; j < strings.length; j++) {
                if (str.equals(strings[j])) {
                    number++;
                }
            }
            word = new Word(str, new Integer(number));
            wordList.add(word);
            number = 0;
        }
    }

    public void removeCopy() {
        Iterator iterator = wordList.iterator();
        Word word, word2;
        int counter = 0;
        while (iterator.hasNext()) {
            word = (Word) iterator.next();
            wordSet.add(word);
            Iterator iterator2 = wordSet.iterator();
            while (iterator2.hasNext()) {
                word2 = (Word) iterator2.next();
                if (word2.getWord().equals(word.getWord())) {
                    counter++;
                    if (counter > 1) {
                        wordSet.remove(word2);
                        counter--;
                    }
                }
            }
            counter = 0;
        }
    }

    public void outSetList() {
        Iterator iterator = wordSet.iterator();
        while (iterator.hasNext()) {
            Word word = (Word) iterator.next();
            System.out.println(word.getWord() + ": " + word.getNumber());
        }
    }
}
