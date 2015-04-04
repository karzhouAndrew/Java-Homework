package workbook2.checkpoint;

/**
 программа, моделирующая кассы в магазине
 */
public class CheckpointTest {
    public static void main(String[] args) {
        CheckpointPool checkpointPool = new CheckpointPool();
        for (int i = 0; i < 20; i++) {
            new Buyer(checkpointPool);
        }
    }
}
