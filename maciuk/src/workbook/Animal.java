package workbook;

/**
 * Created by Asus on 27.02.2015.
 */
public class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("имеет сердце");
    private Descripsion t = new Descripsion("животное не растение");

    public Animal() {
        System.out.println("Animal()");
    }
    protected void dispose(){
        System.out.println("dispose() в Animal()");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
