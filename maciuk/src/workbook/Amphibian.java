package workbook;

/**
 * Created by Asus on 27.02.2015.
 */
public class Amphibian extends Animal {
    private Characteristic p = new Characteristic("может жить в воде");
    private Descripsion t = new Descripsion("И в воде и на земле");

    public Amphibian() {
        System.out.println("Amphibian()");
    }
    protected void dispose(){
        System.out.println("dispose() в Amphibian");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
