package workbook.lab29;

public class Word {
    String word;
    Integer number;

    public Word(String word, Integer number) {
        this.number = number;
        this.word = word;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
