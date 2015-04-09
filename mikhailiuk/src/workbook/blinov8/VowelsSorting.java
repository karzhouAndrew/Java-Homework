package workbook.blinov8;

/**
 * Created by Natashka on 01.03.2015.
 */
public class VowelsSorting {
    private char[] vowels = {'а', 'е', 'ё', 'и', 'у', 'э', 'ю', 'я', 'о'};
    private char[] consonants = {'б', 'в', 'г', 'д', 'ж', 'з', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};

    public String[] vowelsSort(String[] words) {
        int i = 0;
        String[] sortedWords = new String[words.length];
        char[] lettersNumber;
        for (String word : words) {
            for (char vowel : vowels) {
                lettersNumber = word.toCharArray();
                if ((lettersNumber.length > 1) && (word.charAt(1) == vowel)) {
                    for (char consonant : consonants) {
                        if (word.charAt(2) == consonant) {
                            sortedWords[i] = word;
                            i++;
                        }
                    }
                }
            }
        }
        for (char consonant : consonants) {
            for (String word : words) {
                if (word.charAt(1) == consonant) {
                    sortedWords[i] = word;
                    i++;
                }
            }
        }
        return sortedWords;
    }
}
