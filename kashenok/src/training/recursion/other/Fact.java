package training.recursion.other;

public class Fact {
    public int factorial(int n) {
        int result;
        if (n == 1) return n;
        result = factorial(n - 1) * n;
        return result;
    }

}
