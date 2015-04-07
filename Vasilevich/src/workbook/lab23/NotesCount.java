package workbook.lab23;

/**
 * Created by vasilevich on 23.02.2015.
 */
public class NotesCount {
    private int bill20;
    private int bill50;
    private int bill100;

    public NotesCount() {
    }

    public NotesCount(int bill20, int bill50, int bill100) {
        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bill100;
    }

    public int getBill20() {
        return bill20;
    }

    public void setBill20(int bill20) {
        this.bill20 = bill20;
    }

    public int getBill50() {
        return bill50;
    }

    public void setBill50(int bill50) {
        this.bill50 = bill50;
    }

    public int getBill100() {
        return bill100;
    }

    public void setBill100(int bill100) {
        this.bill100 = bill100;
    }

    public void addBill20(int countBill20) {
        this.bill20 += countBill20;
    }

    public void subBill20(int countBill20) {
        this.bill20 -= countBill20;
    }

    public void addBill50(int countBill50) {
        this.bill50 += countBill50;
    }

    public void subBill50(int countBill50) {
        this.bill50 -= countBill50;
    }

    public void addBill100(int countBill100) {
        this.bill100 += countBill100;
    }

    public void subBill100(int countBill100) {
        this.bill100 -= countBill100;
    }

    public boolean checkNotesCountWithSum(int sum) {
        return (sum < (bill100 * 100 + bill50 * 50 + bill20 * 20));
    }

    public int getSum() {
        return (bill100 * 100 + bill50 * 50 + bill20 * 20);
    }
}
