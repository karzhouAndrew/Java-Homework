package added.lab10;

/**
 * Created by Sam on 01.03.2015.
 * Реализовать аннотацию Transaction и анализатор данной транзакции. Смысл
 * данной аннотации заключается в том, что если метод помечен данной
 * аннотацией, значит он вызывается в рамках транзакции. В рамках транзакции -
 * когда выводится на консоль два сообщения:
 * 1) Transaction is started
 * 2) Transaction is ended
 */
public class TestTransaction {
    public static void main(String[] args) {
        try {
            TransactProc transaction = new TransactProc();
            transaction.analyzeTransactProc();
        } catch (Exception e) {

        }

    }

}
