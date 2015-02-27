package workbook;

/**
 * Created by Asus on 27.02.2015.
 */
public class Flog extends Amphibian {
    private Characteristic p = new Characteristic("квакает");
    private Descripsion t = new Descripsion("ест жуков");

    public Flog() {
        System.out.println("Flog()");
    }
    protected void dispose(){
        System.out.println("Завершение Flog");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Flog f = new Flog();
        System.out.println("Пока");
        f.dispose();
    }
}
