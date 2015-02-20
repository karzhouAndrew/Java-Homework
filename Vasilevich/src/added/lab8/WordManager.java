package added.lab8;

/**
 * Created by Sam on 21.02.2015.
 */
public class WordManager {

    private String sentense;

    public WordManager(String strSentense) {
        this.sentense = strSentense;
    }


    public String getSentense() {
        return sentense;
    }

    public void setSentense() {
        this.sentense = sentense;
    }

    public int getSentenseCount(){
        int sentensCount = sentense.split("\\.").length;
        return sentensCount;
    }

    public String[] SplitSentenses(){



        return sentense.split("\\.");
    }

    public int getNumWordsInSentense(int sentInd ){
        String strSent = sentense.split("\\.")[sentInd];
        return strSent.split(" +").length;
    }

    public String getSentense(int sentInd ){
        return sentense.split("\\.")[sentInd];
    }
}
