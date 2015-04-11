package workbook.lab30;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by vasilevich on 20.03.2015.
 */
public class WordAndMarkCounter {
    private int punktMarkCounter;
    private int wordCounter;

    private boolean isContainPunktMark(String checkedWord){
        return checkedWord.matches(".*[.,!-?]+.*");
    }

    private int getMarkCountAtString(String substring, char foundVal){
        int pos = substring.indexOf(foundVal);
        int markCount = 0;
        while (pos != -1){
            markCount++;
            pos = substring.indexOf(foundVal, ++pos);
        }
        return markCount;
    }

    private int getPunkMarkCount(String checkedWord) {
        String marksArr = ".,!-?";
        int markCount = 0;
        for(int i = 0; i < marksArr.length(); i++){
            markCount += getMarkCountAtString(checkedWord, marksArr.charAt(i));
        }
        return markCount;
    }

    private boolean isContaintChar(String checkedWord) {
        return checkedWord.matches(".*[a-zA-Z]+.*");
    }

    private void AnalyseLine(String stringLine){
        String[] wordsArr = stringLine.split(" +");
        for(String word : wordsArr) {
            if (isContainPunktMark(word)) {
                punktMarkCounter += getPunkMarkCount(word);
            }
            if (isContaintChar(word)){
                wordCounter++;
            }


        }
    }

    public void FileLoader(String fileName) throws IOException {

        BufferedReader inputStream = new BufferedReader(new FileReader(fileName));
        String stringLine = inputStream.readLine();
        while (stringLine != null) {
            AnalyseLine(stringLine);
            stringLine = inputStream.readLine();
        }
    }

    @Override
    public String toString() {
        return "WordAndMarkCounter{" +
                "punktMarkCounter=" + punktMarkCounter +
                ", wordCounter=" + wordCounter +
                '}';
    }
}
