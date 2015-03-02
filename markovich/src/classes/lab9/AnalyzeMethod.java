package classes.lab9;

public class AnalyzeMethod {

    @Transaction
    public String analyzeMethod() {
        System.out.println("This is analyze method");
        return null;
    }
}
